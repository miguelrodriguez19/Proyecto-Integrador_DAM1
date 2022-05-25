package SportChoice;

import javax.swing.JFrame;

public class Controlador {

	private Modelo miModelo;

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

	private JFrame[] pantallas = { /*0*/cambiarContrasena, /*1*/crearPerfil, /*2*/crearEvento, /*3*/editarPerfil, /*4*/FAQs, /*5*/foro, /*6*/historial, /*7*/login,
			/*8*/misEventos, /*9*/modificarEvento, /*10*/perfil, /*11*/mainPage, /*12*/recuperarContrasena, /*13*/recuperarContrasenaV2, /*14*/registro,
			/*15*/unirseEvento, /*16*/valoracion, /*17*/verEvento };

	public void actualizar(int pantallaAnterior, int pantallaNueva) {
		pantallas[pantallaAnterior].setVisible(false);
		pantallas[pantallaNueva].setVisible(true);
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setPantallas(JFrame[] pantallas) {
		for (int i = 0; i < pantallas.length; i++) {
			this.pantallas[i] = pantallas[i];
		}
	}
	public void login() {
		String usr = login.getUsr();
		String pwd = login.getPwd();
		miModelo.login(usr,pwd);
		
	}
}
