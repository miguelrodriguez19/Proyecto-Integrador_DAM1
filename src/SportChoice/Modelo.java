package SportChoice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {
	private CambiarContrasena cambiarContrasena;
	private ConfCrearPerfil crearPerfil;
	private crearEvento crearEvento;
	private editarPerfil editarPerfil;
	private FAQsWindow FAQs;
	private Foro foro;
	private HistorialWindow historial;
	private LogIn login;
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
	public void setCambiarContrasena(CambiarContrasena cambiarContrasena) {
		this.cambiarContrasena = cambiarContrasena;
	}
	public void setRecuperarContrasenaV2(ConfirmarMail recuperarContrasenaV2) {
		this.recuperarContrasenaV2 = recuperarContrasenaV2;
	}
	public void setMainPage(MainPage mainPage) {
		this.mainPage = mainPage;
	}
	public void setCrearPerfil(ConfCrearPerfil crearPerfil) {
		this.crearPerfil = crearPerfil;
	}
	public void setCrearEvento(crearEvento crearEvento) {
		this.crearEvento = crearEvento;
	}
	public void setEditarPerfil(editarPerfil editarPerfil) {
		this.editarPerfil = editarPerfil;
	}
	public void setFAQs(FAQsWindow fAQs) {
		FAQs = fAQs;
	}
	public void setForo(Foro foro) {
		this.foro = foro;
	}
	public void setHistorial(HistorialWindow historial) {
		this.historial = historial;
	}
	public void setLogin(LogIn login) {
		this.login = login;
	}
	public void setMisEventos(MisEventos misEventos) {
		this.misEventos = misEventos;
	}
	public void setModificarEvento(ModificarEvento modificarEvento) {
		this.modificarEvento = modificarEvento;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public void setRecuperarContrasena(RecuperarContrasena recuperarContrasena) {
		this.recuperarContrasena = recuperarContrasena;
	}
	public void setRegistro(Register registro) {
		this.registro = registro;
	}
	public void setUnirseEvento(unirseEvento unirseEvento) {
		this.unirseEvento = unirseEvento;
	}
	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}
	public void setVerEvento(verEvento verEvento) {
		this.verEvento = verEvento;
	}
	
	public class Conexion {
		// Atributos de la clase
		private String bd = "ProyectoIntegrador";
		private String login = "";
		private String pwd = "";
		private String url = "jdbc:mysql://localhost/" + bd;
		private Connection conexion;
		private Statement stmt;

		// Constructor que crea la conexión
		public Conexion() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion = DriverManager.getConnection(url, login, pwd);
				stmt = conexion.createStatement();
				if (conexion != null) {
					System.out.println("Conexión a la bd" + url + ".... ok !!");
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
