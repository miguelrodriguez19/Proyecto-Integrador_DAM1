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
	private salirForo salirForo;
	private unirseEvento unirseEvento;
	private Valoracion valoracion;
	private verEvento verEvento;

	private JFrame[] pantallas = { cambiarContrasena, crearPerfil, crearEvento, editarPerfil, FAQs, foro, login,
			misEventos, modificarEvento, perfil, mainPage, recuperarContrasena, recuperarContrasenaV2, registro,
			salirForo, unirseEvento, valoracion, verEvento, historial };

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
}
