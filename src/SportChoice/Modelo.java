package SportChoice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.swing.JFrame;

// NUESTRO
public class Modelo {
	private CambiarContrasena cambiarContrasena;
	private ConfCrearPerfil crearPerfil;
	private crearEvento crearEvento;
	private editarPerfil editarPerfil;
	private FAQsWindow FAQs;
	private Foro foro;
	private HistorialWindow historial;
	private LogIn loginPantalla;
	private MainPage mainPage;
	private MisEventos misEventos;
	private ModificarEvento modificarEvento;
	private Perfil perfil;
	private RecuperarContrasena recuperarContrasena;
	private ConfirmarMail recuperarContrasenaV2;
	private Register registro;
	private unirseEvento unirseEvento;
	private Valoracion valoracion;
	private verEvento verEvento;

	private String bd = "ProyectoIntegrador";
	private String login = "root";
	private String pwd = "";
	private String url = "jdbc:mysql://localhost/" + bd;
	private Connection conexion;
	private Statement stmt;

	public Modelo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, login, pwd);
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

	private JFrame[] pantallas = { /* 0 */cambiarContrasena, /* 1 */crearPerfil, /* 2 */crearEvento,
			/* 3 */editarPerfil, /* 4 */FAQs, /* 5 */foro, /* 6 */historial, /* 7 */loginPantalla, /* 8 */misEventos,
			/* 9 */modificarEvento, /* 10 */perfil, /* 11 */mainPage, /* 12 */recuperarContrasena,
			/* 13 */recuperarContrasenaV2, /* 14 */registro, /* 15 */unirseEvento, /* 16 */valoracion,
			/* 17 */verEvento };

	public void setPantallas(JFrame[] pantallas) {
		for (int i = 0; i < pantallas.length; i++) {
			this.pantallas[i] = pantallas[i];
		}
	}
	
	public class Conexion {
		// Atributos de la clase
		private String bd = "ProyectoIntegrador";
		private String login = "";
		private String pwd = "";
		private String url = "jdbc:mysql://localhost/" + bd;
		private Connection conexion;
		private Statement stmt;

		// Constructor que crea la conexi�n
		public Conexion() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion = DriverManager.getConnection(url, login, pwd);
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
}
}
