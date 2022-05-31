package SportChoice;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Modelo {
	private String bd = "ProyectoIntegrador";
	private String usuariologin = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + bd;
	private Connection conexion;
	private Statement stmt;
	private String usr;
	private String pwdBBDD;
	private String resultado;
	private int fallos;
	private JFrame[] pantallas;
	private String usuarioConectado;

	private String eventosRecientes = "select eventos.usr, fecha_evento, nombre_evento from eventos natural join participa_evento order by fecha_creacion asc;";
	private DefaultTableModel miTabla;

	public Modelo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usuariologin, pwd);
			stmt = conexion.createStatement();

			if (conexion != null) {
//				 System.out.println("Conexión a la BBDD: " + url + " <-- ok!! -->");
				// conn.close();
			}
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

	// Constructor que crea la conexi�n
	public void Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usuariologin, pwd);
			stmt = conexion.createStatement();
			if (conexion != null) {
				System.out.println("Conexi�n a la bd" + url + ".... ok !!");
				// conn.close();
			}
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

	public void login(String usr, String pwd) {
		String rol;
		this.usr = consulta("select * from users where usr=?", usr, "usr");
		this.pwdBBDD = consulta("select * from users where usr=?", usr, "pwd");
		System.out.println("Locales: " + usr + " - " + pwd);
		System.out.println("Atributos: " + this.usr + " - " + this.pwdBBDD);
		rol = consulta("select * from users where usr=?", usr, "rol");
		if (this.usr.equals(usr) && this.pwdBBDD.equals(pwd)) {
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
			if (option.equals("misEventos")) {
				pstmt.setString(1, usuarioConectado);
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
			query = "select eventos.usr, fecha_evento, nombre_evento from eventos natural join participa_evento order by fecha_creacion asc;";
			break;
		case "misEventos":
			query = "select eventos.usr, fecha_evento, nombre_evento from eventos natural join participa_evento where participa_evento.cod_user = ? && fecha_evento > current_date();";
			break;
		case "eventosAdministrador":
			query = "select cod_evento as eventoActual, nombre_evento, usr as creador, fecha_evento, tipo_dep, (select count(*) as participantes from participa_evento where cod_evento = eventoActual group by cod_evento) as participantes from eventos natural join participa_evento group by cod_evento order by fecha_evento desc;";
			break;
		case "usuariosAdministrador":
			query = "select usr, nombre, apellido, email, fecha_nac from users where rol = 'user';";
			break;
		case "foro": // Aun no funciona
			query = "select eventos.usr, fecha_evento, nombre_evento from eventos natural join participa_evento order by fecha_creacion asc;";
			break;
		default:
			System.out.println("error no existe query para tabla");
			break;
		}
		return query;
	}

	private int getNumColumnas(String sql, String option) {
		int num = 0;
		
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			if (option.equals("misEventos")) { // || option.equals("foro") CREO QUE HACE FALTA ESTO
				pstmt.setString(1, usuarioConectado); // EVENTO SELECCIONADO CREATE UN ATRIBUTO PARA GUARDAR SU CODIGO_EVENTO
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
}
