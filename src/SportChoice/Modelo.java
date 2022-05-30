package SportChoice;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

// NUESTRO
public class Modelo {
	private CambiarContrasena cambiarContrasena;
	private ConfCrearPerfil crearPerfil;
	private crearEvento crearEvento;
	private editarPerfil editarPerfil;
	private FAQsWindow FAQs;
	private Foro foro;
	private HistorialWindow historial;
	private LogIn loginPantalla = new LogIn();
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
	private String usr;
	private String pwdBBDD;
	private String resultado;
	private int fallos;
	
	private String sqlTabla2="Select * from Eventos";
	private DefaultTableModel miTabla;

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
		cargarTabla2();
	}

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
		this.loginPantalla = login;
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

	public String getResultado() {
		return this.resultado;
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
		loginPantalla.update(rol);
	}

	public String consulta(String query, String cod, String nombreColumna) {
		String ej = "";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, cod);
			ResultSet rset = pstmt.executeQuery();

			while (rset.next()) {
				ej = rset.getString(nombreColumna);
				System.out.println("patata");
				System.out.println(ej);
			}
			rset.close();
			pstmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return ej;
	}
	private void cargarTabla2() {
		miTabla = new DefaultTableModel();
		int numColumnas = getNumColumnas(sqlTabla2);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sqlTabla2);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				miTabla.addColumn(rsmd.getColumnName(i+1));
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
		
	}
	
	private int getNumColumnas(String sql) {
		int num = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
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

}
