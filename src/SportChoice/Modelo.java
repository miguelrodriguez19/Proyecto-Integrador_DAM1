package SportChoice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;

import javax.swing.JFrame;

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

	public Modelo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, usuariologin, pwd);
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
}
