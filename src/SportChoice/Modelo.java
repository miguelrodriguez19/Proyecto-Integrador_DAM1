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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.cj.xdevapi.Table;

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
	private String usuarioConectado;
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
	private String respuesta;
	private final String FILE = "conexionBDPI.ini";

	public Properties getDatosConexion() {
		return datosConexion;
	}

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

	public void login(String usr, String pwd) {
		String rol;
		this.usr = consulta("select * from users where usr=?", usr, "usr");
		this.pwdBBDD = consulta("select * from users where usr=?", usr, "pwd");
		System.out.println("Locales: " + usr + " - " + pwd);
		System.out.println("Atributos: " + this.usr + " - " + this.pwdBBDD);
		rol = consulta("select * from users where usr=?", usr, "rol");
		if (this.usr.equals(usr) && this.pwdBBDD.equals(pwd)) {
			setUsuarioConectado(usr);
			resultado = "Correcto";
			fallos = 0;
		} else {
			fallos++;
			if (fallos == 3) {
				resultado = "Cerrar";
			} else
				resultado = "Incorrecto";
		}
		((LogIn) pantallas[7]).update(rol);
	}

	public DefaultTableModel cargarTabla(String option) {
		String query = cargarQuery(option);
		miTabla = new DefaultTableModel();
		int numColumnas = getNumColumnas(query, option);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(query);
			if (option.equals("misEventos") || option.equals("historialWindow") || option.equals("foro")) {
				if (option.equals("misEventos") || option.equals("historialWindow"))
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

	private String cargarQuery(String option) {
		String query = "";
		switch (option) {
		case "eventosRecientes":
			query = "select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento 'Nombre evento', "
					+ "(select count(*) from participa_evento natural join eventos where cod_evento = Evento group by cod_evento) as Participantes "
					+ "from eventos natural join participa_evento group by cod_evento order by fecha_evento desc;";
			break;
		case "misEventos":
			query = "select cod_evento as Evento, eventos.usr as Creador, fecha_evento as Fecha, nombre_evento as 'Nombre evento', "
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

	private int getNumColumnas(String sql, String option) {
		int num = 0;

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			if (option.equals("misEventos") || option.equals("historialWindow") || option.equals("foro")) {
				if (option.equals("misEventos") || option.equals("historialWindow"))
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

	public String getUsuarioConectado() {
		return usuarioConectado;
	}

	public void setUsuarioConectado(String usuarioConectado) {
		this.usuarioConectado = usuarioConectado;
	}

	public void leerFichero() {
		File rutaProyecto = new File(FILE);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.java", "java");
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

	public void guardarObjeto(JTable tabla) {
		File rutaProyecto = new File(System.getProperty("user.dir"));
		JFileChooser fc = new JFileChooser(rutaProyecto);
		int seleccion = fc.showSaveDialog(tabla);
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			File fichero = fc.getSelectedFile();
			try {
				FileOutputStream fos = new FileOutputStream(fichero);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				RecuperarTablas tablaObject  = new RecuperarTablas((DefaultTableModel) tabla.getModel());
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

//	public TableModel cargarObjeto(JScrollPane scrollPaneTabe) {
//		File rutaProyecto = new File(System.getProperty("user.dir"));
//		JFileChooser fc = new JFileChooser(rutaProyecto);
//		int seleccion = fc.showOpenDialog(scrollPaneTabe);
//		DefaultTableModel modelAux = null;
//		if (seleccion == JFileChooser.APPROVE_OPTION) {
//			try {
//				File fichero = fc.getSelectedFile();
//				FileInputStream fis = new FileInputStream(fichero);
//				ObjectInputStream ois = new ObjectInputStream(fis);
//				RecuperarTablas tablaObject  = (RecuperarTablas) ois.readObject();
//				modelAux = tablaObject.getModeloTabla();
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return modelAux;
//	}
	
	
	
	
	

	public String getRespuesta() {
		return respuesta;
	}
}
