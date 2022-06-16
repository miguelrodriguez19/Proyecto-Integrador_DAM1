package SportChoice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Modelo {
	private String bd = "ProyectoIntegrador";
	private String url = "jdbc:mysql://localhost/" + bd;
	private Connection conexion;
	private Statement stmt;
	private String usr;
	private String pwdBBDD;
	private String resultado;
	private int fallos;
	private JFrame[] pantallas;
	private String usuarioConectado = "invitado";
	private String eventoSeleccionado;
	private String eventosRecientes = "select eventos.usr, fecha_evento, nombre_evento from eventos natural join participa_evento order by fecha_creacion asc;";
	private DefaultTableModel miTabla;
	private String sqlTabla1 = "Select * from countrylanguage";
	private String sqlTabla2 = "Select * from city";
	private JTextField txtUsuario, txtPassword, txtURL;

	private Properties datosConexion;
	private datosConexion datosConexionPantalla = new datosConexion();
	private File miFichero;
	private InputStream entrada;
	private OutputStream salida;
	private String DeporteFiltro, FiltroFecha, filtroMes, Localicad, queryfilt, opcionFilt;
	private String filtroDia;
	private int ncum;
	private String respuesta;
	private HashMap<String, String> datosUsuario; /*
													 * usr, nombre, apellido, email, pwd, Fecha_nac, FotoPerfil,
													 * descripcion, DeporteFav, valoraciones, cod_recuperacion, rol,
													 * localidad, genero
													 */
	private final String FILE = "conexionBDPI.ini";
	private boolean usrEx = true;

	public Properties getDatosConexion() {
		return datosConexion;
	}

	/**
	 * Constructor de modelo
	 */
	public Modelo() {
		datosConexion = new Properties();
		try {
			miFichero = new File(FILE);
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				datosConexion.load(entrada);
			} else {
				System.err.println("Fichero no encontrado");
				System.exit(1);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Conexion con la BBDD
	 */
	public void conectarFicheroBBDD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(datosConexion.getProperty("URL"), datosConexion.getProperty("Usr"),
					datosConexion.getProperty("Pwd"));
			stmt = conexion.createStatement();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Driver JDBC no encontrado");
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("Error al conectarse a la BBDD");
			sqle.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error general");
			e.printStackTrace();
		}
	}

	public void setPantallas(JFrame[] pantallas) {
		this.pantallas = pantallas;
	}

	/**
	 * Log In verification
	 * 
	 * @param usr
	 * @param pwd
	 */
	public void login(String usr, String pwd) {
		String rol;
		this.usr = consulta("select * from users where usr=?", usr, "usr");
		this.pwdBBDD = consulta("select * from users where usr=?", usr, "pwd");
		rol = consulta("select * from users where usr=?", usr, "rol");
		if (this.usr.equals(usr) && this.pwdBBDD.equals(pwd)) {
			setUsuarioConectado(usr);
			resultado = "Correcto";
			fallos = 0;
			cargarDatosUsuario();
		} else {
			fallos++;
			if (fallos == 3) {
				resultado = "Cerrar";
			} else
				resultado = "Incorrecto";
		}
		((LogIn) pantallas[7]).update(rol);
	}

	/**
	 * Cargar tabla es un metodo que ejecuta una query de SQL para rellenar los
	 * datos de una tabla
	 * 
	 * @param option String que es filtrada el metodo privado @cargarQuery
	 * @return DefaultTableModel devuelve los datos que contiene la tabla
	 */
	public DefaultTableModel cargarTabla(String option) {
		String query = cargarQuery(option);
		miTabla = new DefaultTableModel();
		int numColumnas = getNumColumnas(query, option);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			if (option.equals("misEventos") || option.equals("eventosRecientes") || option.equals("historialWindow")
					|| option.equals("foro")) {
				if (option.equals("misEventos") || option.equals("eventosRecientes")
						|| option.equals("historialWindow"))
					pstmt.setString(1, usuarioConectado);
				if (option.equals("foro"))
					pstmt.setString(1, eventoSeleccionado);
			}
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				miTabla.addColumn(rsmd.getColumnName(i + 1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				miTabla.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return miTabla;

	}

	/**
	 * Cargar query para <b>@cargarTabla<b>
	 * 
	 * @param option
	 * @return String query de SQL
	 */
	private String cargarQuery(String option) {
		String query = "";
		switch (option) {
		case "eventosRecientes":
			query = "select cod_evento as Evento, eventos.usr as Creador, nombre_evento 'Nombre evento', fecha_evento as Fecha, tipo_dep AS Deporte, "
					+ "(select count(*) from participa_evento natural join eventos where cod_evento = Evento group by cod_evento) as Participantes "
					+ "from eventos natural join participa_evento where cod_Evento not in (select cod_Evento from participa_evento where cod_user = ?) "
					+ "group by cod_evento order by fecha_evento desc;";
			break;
		case "misEventos":
			query = "select cod_evento as Evento, eventos.usr as Creador, nombre_evento as 'Nombre evento', fecha_evento as Fecha, tipo_dep AS Deporte, "
					+ "(select count(*) from participa_evento natural join eventos where cod_evento = Evento group by cod_evento) as participantes "
					+ "from eventos natural join participa_evento where participa_evento.cod_user = ? && fecha_evento > current_date() group by cod_evento;";
			break;
		case "eventosAdministrador":
			query = "select cod_evento as eventoActual, nombre_evento as 'Nombre evento', usr as Creador, fecha_evento as Fecha, tipo_dep as Deporte, "
					+ "(select count(*) as participantes from participa_evento where cod_evento = eventoActual group by cod_evento) as participantes "
					+ "from eventos natural join participa_evento group by cod_evento order by fecha_evento desc;";
			break;
		case "usuariosAdministrador":
			query = "select usr  as 'Usuario', nombre as 'Nombre', apellido  as 'Apellido', email  as 'E-mail', fecha_nac as 'Fecha nacimiento' from users where rol = 'user';";
			break;
		case "foro":
			query = "select cod_user as Usuario, mensaje, fecha from mensaje_foro natural join eventos where cod_Evento = ? order by fecha desc;";
			break;
		case "historialWindow":
			query = "select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento as 'Nombre evento', "
					+ "(select count(*) from participa_evento natural join eventos where cod_evento = Evento group by cod_evento) as participantes "
					+ "from eventos natural join participa_evento where participa_evento.cod_user = ? && fecha_evento < current_date() group by cod_evento;";
			break;
		default:
			System.out.print("Error Switch: ");
			System.err.println("no existe query para tabla.");
			break;
		}
		return query;
	}

	/**
	 * Recorre la tabla users del usuario logeado sacando todos sus datos con
	 * resultset y nombres de las columnas de los datos con el resulset metadata, y
	 * con un for rellena un hash map de clave valor, este código se hace algo más
	 * largo porque estos datos algunos los ponemos en mayúsculas si no lo estan ya
	 * que a la hora de verlos en el perfil esto queda mejor y nos pareció lo mejor.
	 */
	private void cargarDatosUsuario() {
		String query = "select usr, nombre, apellido, email, pwd, Fecha_nac, FotoPerfil, descripcion, DeporteFav, valoraciones, cod_recuperacion, rol, localidad, genero from users where usr = ?";
		datosUsuario = new HashMap<>();
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, usuarioConectado);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnas = rsmd.getColumnCount();
			String datoResultado = "";
			if (rset.next())
				for (int j = 1; j <= columnas; j++) {
					if (rsmd.getColumnName(j).equals("nombre") || rsmd.getColumnName(j).equals("apellido")
							|| rsmd.getColumnName(j).equals("localidad") || rsmd.getColumnName(j).equals("genero")) {
						if (rset.getString(j) != null)
							if (rset.getString(j).length() >= 2)
								datoResultado = rset.getString(j).substring(0, 1).toUpperCase()
										+ rset.getString(j).substring(1);
							else
								datoResultado = rset.getString(j).toUpperCase();
					} else {
						datoResultado = rset.getString(j);
					}

					datosUsuario.put(rsmd.getColumnName(j), datoResultado);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, String> getDatosUsuario() {
		return datosUsuario;
	}

	/**
	 * Devuelve el numero de columnas que tiene la tabla en BBDD
	 * 
	 * @param sql
	 * @param option
	 * @return int
	 */
	private int getNumColumnas(String sql, String option) {
		int num = 0;

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			if (option.equals("misEventos") || option.equals("eventosRecientes") || option.equals("historialWindow")
					|| option.equals("foro")) {
				if (option.equals("misEventos") || option.equals("eventosRecientes")
						|| option.equals("historialWindow"))
					pstmt.setString(1, usuarioConectado);
				if (option.equals("foro"))
					pstmt.setString(1, eventoSeleccionado);
			}

			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			num = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	/**
	 * Devuelve el numero de filas que tiene la tabla en BBDD
	 * 
	 * @param sql
	 * @param option
	 * @return int
	 */
	private int getNumFilas(String sql) {
		int numFilas = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			while (rset.next())
				numFilas++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numFilas;
	}

	public DefaultTableModel getTabla() {
		return miTabla;
	}

	public String getResultado() {
		return this.resultado;
	}

	public String consulta(String query, String cod, String nombreColumna) {
		String ej = "";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, cod);
			ResultSet rset = pstmt.executeQuery();
			if (rset.next())
				ej = rset.getString(nombreColumna);
			rset.close();
			pstmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return ej;
	}

	/**
	 * Getter del usuario conectado
	 * 
	 * @return String
	 */
	public String getUsuarioConectado() {
		return usuarioConectado;
	}

	/**
	 * Setter del usuario conectado
	 * 
	 * @param usuarioConectado
	 */
	public void setUsuarioConectado(String usuarioConectado) {
		this.usuarioConectado = usuarioConectado;
	}

	/**
	 * Lee el fichero de la ruta indicada que es donde estan los datos de conexion a
	 * la base de datos.
	 */
	public void leerFichero() {
		File rutaProyecto = new File(FILE);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.java", "java");
	}

	public void Registrarse(String name, String apellido, String password, String mail, String fecha, String usr) {
		String query = "INSERT into users (usr,nombre,apellido,email,pwd,Fecha_nac,cod_recuperacion,rol)values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		int codrec = (int) Math.floor(Math.random() * 9999);
		String numCadena = Integer.toString(codrec);
		try {
			conectarFicheroBBDD();
			pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, usr);
			pstmt.setString(2, name);
			pstmt.setString(3, apellido);
			pstmt.setString(4, mail);
			pstmt.setString(5, password);
			pstmt.setString(6, fecha);
			pstmt.setString(7, numCadena);
			pstmt.setString(8, "user");
			pstmt.executeUpdate();

		} catch (Exception e) {
			usrEx = false;
		}
	}

	/**
	 * Metodo booleano que actua como flag por si un usuario existe ya en la BBDD
	 * 
	 * @return boolean
	 */
	public boolean isUsrEx() {
		return usrEx;
	}

	public void guardar(String[] datos, String[] claves) {
		try {
			for (int i = 0; i < claves.length; i++) {
				datosConexion.setProperty(claves[i], datos[i]);
				salida = new FileOutputStream(miFichero);
				datosConexion.store(salida, "Ultima operacion: Guardado");
				respuesta = "Guardado";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Guardar objeto metodo que guarda un objeto en un fichero para poder leerlo
	 * despues
	 * 
	 * @param tabla
	 */
	public void guardarObjeto(JTable tabla) {
		File rutaProyecto = new File(System.getProperty("user.dir"));
		JFileChooser fc = new JFileChooser(rutaProyecto);
		int seleccion = fc.showSaveDialog(tabla);
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			File fichero = fc.getSelectedFile();
			try {
				FileOutputStream fos = new FileOutputStream(fichero);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				RecuperarTablas tablaObject = new RecuperarTablas((DefaultTableModel) tabla.getModel());
				oos.writeObject(tablaObject);
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * cargarObjeto
	 * 
	 * @param scrollPaneTabe
	 * @return TableModel
	 */
	public TableModel cargarObjeto(JScrollPane scrollPaneTabe) {
		File rutaProyecto = new File(System.getProperty("user.dir"));
		JFileChooser fc = new JFileChooser(rutaProyecto);
		int seleccion = fc.showOpenDialog(scrollPaneTabe);
		DefaultTableModel modelAux = null;
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			try {
				File fichero = fc.getSelectedFile();
				FileInputStream fis = new FileInputStream(fichero);
				ObjectInputStream ois = new ObjectInputStream(fis);
				RecuperarTablas tablaObject = (RecuperarTablas) ois.readObject();
				modelAux = tablaObject.getModeloTabla();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return modelAux;
	}

	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * Realiza el update con el prepared statement y los campos recibidos del
	 * controlador para cambiar los datos del perfil y también los del hashMap del
	 * usuario.
	 * 
	 * @param datosCambiosPerfil
	 */
	public void guardarCambiosPerfil(String[] datosCambiosPerfil) {
		// Usuario, Nombre, Descripcion, Me gustas
		String query = "update users set usr = ?, nombre = ?, apellido = ?, descripcion = ?,  valoraciones = ?, DeporteFav = ?, genero = ? where usr = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, datosCambiosPerfil[0]);
			pstmt.setString(2, datosCambiosPerfil[1]);
			pstmt.setString(3, datosCambiosPerfil[2]);
			pstmt.setString(4, datosCambiosPerfil[3]);
			pstmt.setString(5, datosCambiosPerfil[4]);
			pstmt.setString(6, datosCambiosPerfil[5]);
			pstmt.setString(7, datosCambiosPerfil[6]);
			pstmt.setString(8, usuarioConectado);
			pstmt.executeUpdate();
			usuarioConectado = datosCambiosPerfil[0];
			pstmt.close();
			cargarDatosUsuario();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Unirse a evento Ejecuta un prepareStatement con una query de tipo insert en
	 * la tabla participa_evento(cod_usr, cod_evento) Necesita saber quien es el
	 * usuario conectado
	 * 
	 * @param eventoSeleccionado
	 */
	public void unirseEvento(String eventoSeleccionado) {
		String query = "insert into participa_evento (cod_user, Cod_Evento) values (?, ?);";
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, usuarioConectado);
			pstmt.setString(2, eventoSeleccionado);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Compara la contraseña introducida con la que hay en base de datos, si
	 * coincide y las nuevas introducidas coinciden, le cambia la contraseña con un
	 * update en el prepared statement al usuario conectado.
	 * 
	 * @param supuestaContrasenaActual
	 * @param nuevaContrasena
	 * @param nuevaContrasenaActual
	 */

	public void cambioContrasena(String supuestaContrasenaActual, String nuevaContrasena,
			String nuevaContrasenaActual) {
		if (nuevaContrasena.equals(nuevaContrasenaActual)) {
			String query = "select pwd from users where usr = ?";
			String contrasenaActual = "";
			PreparedStatement pstmt;
			try {
				pstmt = conexion.prepareStatement(query);
				pstmt.setString(1, usuarioConectado);
				ResultSet rset = pstmt.executeQuery();
				if (rset.next())
					contrasenaActual = rset.getString("pwd");
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (contrasenaActual.equals(supuestaContrasenaActual)) {
				String update = "update users set pwd = ? where usr = ?";
				try {
					pstmt = conexion.prepareStatement(update);
					pstmt.setString(1, nuevaContrasena);
					pstmt.setString(2, usuarioConectado);
					pstmt.executeUpdate();
					pstmt.close();
					((CambiarContrasena) pantallas[0]).cambioContrasenaExitoso();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else { // No coincide la contraseña actual dada y la guardada en base de datos
				((CambiarContrasena) pantallas[0]).errorContrasenaIncorrecta();
			}
		} else { // No coinciden las dos contraseñas nuevas introducidas
			((CambiarContrasena) pantallas[0]).errorContrasenasDistintas();
		}

	}

	/**
	 * CargarDatosEvento ejecuta un prepared statement con una query para sacar los
	 * datos de la BBDD segun un evento previamente seleccionado
	 * 
	 * @param eventoSeleccionado2
	 * @return String []
	 */
	public String[] cargarDatosEvento(String eventoSeleccionado2) {
		String datos[] = new String[8];
		String query = "select nombre_evento, fecha_evento, (select count(*) from participa_evento natural join eventos where cod_evento = ?) "
				+ "as Participantes, tipo_dep, localizacion, privacidad, descripcion from eventos where cod_evento = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, eventoSeleccionado2);
			pstmt.setString(2, eventoSeleccionado2);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnas = rsmd.getColumnCount();
			if (rset.next())
				for (int j = 1; j <= columnas; j++) {
					datos[j] = rset.getString(j).toString();
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return datos;
	}

	/**
	 * Hace el insert del nuevo evento rellenandolo con lo introducido en los campos
	 * de la ventana crear eventos mediante un prepareStatement que ejecuta el
	 * final.
	 * 
	 * @param datosEvento
	 * 
	 */

	public void crearEvento(String[] datosEvento) {
		String codigoEvento = "";
		String insert = "insert into eventos (Cod_Evento, fecha_creacion, fecha_evento, Tipo_Dep, Descripcion, nombre_evento, usr, privacidad, Localizacion) values (?, CURDATE(), ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(insert);
			codigoEvento = "e" + (int) Math.floor(Math.random() * 9999);
			System.out.println(codigoEvento);
			pstmt.setString(1, codigoEvento); // Cod-evento
			pstmt.setDate(2, Date.valueOf(datosEvento[5])); // fecha-evento
			pstmt.setString(3, datosEvento[4]); // Tipo-Dep
			pstmt.setString(4, datosEvento[0]); // Descripcion
			pstmt.setString(5, datosEvento[2]); // nombre-evento
			pstmt.setString(6, usuarioConectado); // usr
			pstmt.setString(7, datosEvento[3]); // privacidad
			pstmt.setString(8, datosEvento[1]); // Localizacion
			pstmt.executeUpdate();
			MisEventos.setEventoSeleccionado(codigoEvento);
			System.out.println(codigoEvento);
			pstmt.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	/**
	 * Metodo usado para recoger los datos seleccionados por el usuario desde la
	 * clase MainPage, ademas cambia y tipo fecha la entrada de dia y mes
	 * 
	 * @param table
	 * @param comboBoxDia
	 * @param comboBoxMes
	 * @param comboBoxDeportes
	 * @param txtLocalidad
	 */

	public void selectitems(JTable table, JComboBox comboBoxDia, JComboBox comboBoxMes, JComboBox comboBoxDeportes,
			JTextField txtLocalidad) {

		filtroDia = (String) comboBoxDia.getSelectedItem();
		filtroMes = (String) comboBoxMes.getSelectedItem();
		DeporteFiltro = (String) comboBoxDeportes.getSelectedItem();
		Localicad = txtLocalidad.getText();
		System.out.println(DeporteFiltro);
		System.out.println(filtroDia);
		System.out.println(filtroMes);
		System.out.println(Localicad);
		if (!filtroDia.equals("Dia") && !filtroMes.equals("Mes")) {
			int FiltroDiaInt = Integer.parseInt(filtroDia);
			int FiltroMesInt = Integer.parseInt(filtroMes);
			if (FiltroDiaInt < 10) {
				filtroDia = "0" + filtroDia;
			}
			if (FiltroMesInt < 10) {
				filtroMes = "0" + filtroMes;
			}
			FiltroFecha = "2022-" + filtroMes + "-" + filtroDia;
			System.out.println(FiltroFecha);
		}
	}

	/**
	 * Metodo usado por el metodo "filtroevento", para sacar la cantidad de columnas
	 * segun la query usada y que las tablas se muestren correctamente
	 * 
	 * @param sql
	 * @param Deporte
	 * @param Fecha
	 * @param Local
	 * @return
	 */
	private int getNumColumnas2(String sql, String Deporte, String Fecha, String Local) {
		int num = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			switch (opcionFilt) {
			case "opcion1":
				pstmt.setString(1, Deporte);
				break;
			case "opcion2":
				pstmt.setString(1, Local);
				break;
			case "opcion3":
				pstmt.setString(1, Fecha);
				break;
			case "opcion4":
				pstmt.setString(1, Local);
				pstmt.setString(2, Fecha);
				break;
			case "opcion5":
				pstmt.setString(1, Local);
				pstmt.setString(2, Deporte);
				break;
			case "opcion6":
				pstmt.setString(1, Deporte);
				pstmt.setString(2, Fecha);
				break;
			case "opcion7":
				pstmt.setString(1, Deporte);
				pstmt.setString(2, Local);
				pstmt.setString(3, Fecha);
				break;
			}
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			num = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	/**
	 * Utilizando los datos introducidos por el metodo "selectitems", se hacen
	 * querys para definir los filtros, segun el campo que este rellenado se realiza
	 * una query diferente, luego se llama a la base de datos para obtener los datos
	 * 
	 * 
	 * @return DefaultTableModel
	 */
	public DefaultTableModel filtroevento() {
		DefaultTableModel tablaEven = new DefaultTableModel();
		// Solo deporte
		if (filtroMes.equals("Mes") && filtroDia.equals("Dia") && Localicad.equals("Localidad")
				&& !DeporteFiltro.equals("Deportes")) {
			queryfilt = "Select * from Eventos where Tipo_Dep =?";
			opcionFilt = "opcion1";
			// Solo Localidad
		} else if (filtroMes.equals("Mes") && filtroDia.equals("Dia") && !Localicad.equals("Localidad")
				&& DeporteFiltro.equals("Deportes")) {
			queryfilt = "Select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento' from Eventos where Localizacion =?";
			opcionFilt = "opcion2";
			// Solo Fecha
		} else if (!filtroMes.equals("Mes") && !filtroDia.equals("Dia") && Localicad.equals("Localidad")
				&& DeporteFiltro.equals("Deportes")) {
			queryfilt = "Select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento' from Eventos where fecha_evento =?";
			opcionFilt = "opcion3";
			// Localidad y Fecha
		} else if (!filtroMes.equals("Mes") && !filtroDia.equals("Dia") && !Localicad.equals("Localidad")
				&& DeporteFiltro.equals("Deportes")) {
			queryfilt = "Select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento' from Eventos where Localizacion =? and fecha_evento =?";
			opcionFilt = "opcion4";
			// Localidad y Deporte
		} else if (filtroMes.equals("Mes") && filtroDia.equals("Dia") && !Localicad.equals("Localidad")
				&& !DeporteFiltro.equals("Deportes")) {
			queryfilt = "Select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento' from Eventos where Localizacion =? and Tipo_Dep =?";
			opcionFilt = "opcion5";
			// Deporte y Fecha
		} else if (!filtroMes.equals("Mes") && !filtroDia.equals("Dia") && Localicad.equals("Localidad")
				&& !DeporteFiltro.equals("Deportes")) {
			queryfilt = "Select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento' from Eventos where Tipo_Dep =? and fecha_evento =?";
			opcionFilt = "opcion6";
			// Deporte, localidad y Fecha
		} else {
			queryfilt = "Select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento' from Eventos where Tipo_Dep =? and Localizacion =? and fecha_evento =?";
			opcionFilt = "opcion7";
		}
		ncum = getNumColumnas2(queryfilt, DeporteFiltro, Localicad, FiltroFecha);
		Object[] contenido = new Object[ncum];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(queryfilt);
//			pstmt.setString(1, Filtro);
			switch (opcionFilt) {
			case "opcion1":
				pstmt.setString(1, DeporteFiltro);
				break;
			case "opcion2":
				pstmt.setString(1, Localicad);
				break;
			case "opcion3":
				pstmt.setString(1, FiltroFecha);
				break;
			case "opcion4":
				pstmt.setString(1, Localicad);
				pstmt.setString(2, FiltroFecha);
				break;
			case "opcion5":
				pstmt.setString(1, Localicad);
				pstmt.setString(2, DeporteFiltro);
				break;
			case "opcion6":
				pstmt.setString(1, DeporteFiltro);
				pstmt.setString(2, FiltroFecha);
				break;
			case "opcion7":
				pstmt.setString(1, DeporteFiltro);
				pstmt.setString(2, Localicad);
				pstmt.setString(3, FiltroFecha);
				break;
			}
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			System.out.println(ncum);
			for (int i = 0; i < ncum; i++) {
				tablaEven.addColumn(rsmd.getColumnName(i + 1));
			}
			while (rset.next()) {
				for (int col = 1; col <= ncum; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				tablaEven.addRow(contenido);
				tablaEven.setRowCount(ncum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tablaEven;

	}

	/**
	 * Metodo que valida si el usuario conectado es el creador del evento pasado por
	 * parametro
	 * 
	 * @param eventoSeleccionado
	 * @return boolean
	 */
	public boolean validarUsuarioCreador(String eventoSeleccionado) {
		String query = "select usr from eventos where cod_evento = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, eventoSeleccionado);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			int columnas = rsmd.getColumnCount();
			if (rset.next())
				if (usuarioConectado.equals(rset.getString(1).toString())) {
					return true;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Se ejecuta un delete con el usuario que se ha seleccionado
	 * 
	 * @param usuarioSeleccionado
	 */
	public void Banear(String usuarioSeleccionado) {
		String queryban = "Delete from users where usr=?;";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(queryban);
			pstmt.setString(1, usuarioSeleccionado);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Se ejecuta una query que elimina el evento seleccionado de la BBDD
	 * 
	 * @param EventoSeleccionado
	 */
	public void BorrarEv(String EventoSeleccionado) {
		String queryban = "Delete from Eventos where Cod_Evento=?;";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(queryban);
			pstmt.setString(1, EventoSeleccionado);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Ejecuta un update en la tabla eventos con el cod_Evento pasado por parametro
	 * 
	 * @param nombre
	 * @param deporte
	 * @param localizacion
	 * @param descripcion
	 * @param eventoSeleccionado
	 */
	public void actualizarEvento(String nombre, String deporte, String localizacion, String descripcion,
			String eventoSeleccionado) {
		String query = "UPDATE eventos SET nombre_evento = ?, tipo_dep = ?, localizacion = ?, descripcion = ? WHERE cod_evento=?;";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, nombre);
			pstmt.setString(2, deporte);
			pstmt.setString(3, localizacion);
			pstmt.setString(4, descripcion);
			pstmt.setString(5, eventoSeleccionado);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este metodo ejequeta un delete de la tabla participa_Evento especificando el
	 * evento que el usuario conectado desea abandonar
	 * 
	 * @param eventoSeleccionado
	 */
	public void abandonarEvento(String eventoSeleccionado) {
        String participantes = "select count(*) from participa_evento natural join eventos where cod_evento = ? group by cod_evento";
        PreparedStatement pstmt;
        try {
            pstmt = conexion.prepareStatement(participantes);
            pstmt.setString(1, eventoSeleccionado);
            ResultSet rset = pstmt.executeQuery();
            int participantesNumero = 0;
            if (rset.next())
                participantesNumero = rset.getInt(1);
            if (participantesNumero <= 1) {
                String eliminarEvento = "Delete from eventos where Cod_Evento=?";
                pstmt = conexion.prepareStatement(eliminarEvento);
                pstmt.setString(1, eventoSeleccionado);
                pstmt.execute();
            }
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        String queryban = "Delete from participa_Evento where Cod_Evento=? and cod_user = ?;";
        try {
            pstmt = conexion.prepareStatement(queryban);
            pstmt.setString(1, eventoSeleccionado);
            pstmt.setString(2, usuarioConectado);
            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
