package SportChoice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(datosConexion.getProperty("URL"), datosConexion.getProperty("Usr"), datosConexion.getProperty("Pwd"));
			stmt = conexion.createStatement();

			if (conexion != null) {
				// System.out.println("Conexión a la BBDD: " + url + " <-- ok!! -->");
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

	public void leerFichero() {
		File rutaProyecto = new File(FILE);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.java", "java");
//		txtUsuario.setText(getName());
//		txtPassword.setText(getName());
//		txtURL.setText(getName());
	}

	public void guardar(String billete, String premio) {
		try {
			datosConexion.setProperty(billete, premio);
			salida = new FileOutputStream(miFichero);
			datosConexion.store(salida, "Ultima operacion: Guardado");
			respuesta = "Guardado";
		} catch (IOException e) {
			e.printStackTrace();
		}
//		miVista.actualizar();
	}

	public void borrar(String billete) {
		if (!datosConexion.containsKey(billete)) {
			respuesta = "No Encontrado";
		} else {
			datosConexion.replace(billete, billete);
			try {
				salida = new FileOutputStream(miFichero);
				datosConexion.store(salida, "Ultima operacion: Borrado");
				respuesta = "Borrado";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		datosConexionPantalla.actualizar();
	}

	public void comprobar(String billete) {
		String premio = datosConexion.getProperty(billete);
		if (premio == null) {
			respuesta = "No Encontrado";
		} else {
			respuesta = premio;
		}
		datosConexionPantalla.actualizar();
	}

	public String getRespuesta() {
		return respuesta;
	}
}
