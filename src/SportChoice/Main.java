package SportChoice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main {
	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		miModelo.leerFichero();

		CambiarContrasena cambiarContrasena = new CambiarContrasena();
		ConfCrearPerfil crearPerfil = new ConfCrearPerfil();
		crearEvento crearEvento = new crearEvento();
		editarPerfil editarPerfil = new editarPerfil();
		FAQsWindow FAQs = new FAQsWindow();
		Foro foro = new Foro();
		HistorialWindow historial = new HistorialWindow();
		LogIn login = new LogIn();
		MisEventos misEventos = new MisEventos();
		MainPage mainPage = new MainPage();
		ModificarEvento modificarEvento = new ModificarEvento();
		Perfil perfil = new Perfil();
		RecuperarContrasena recuperarContrasena = new RecuperarContrasena();
		ConfirmarMail recuperarContrasenaV2 = new ConfirmarMail();
		Register registro = new Register();
		unirseEvento unirseEvento = new unirseEvento();
		Valoracion valoracion = new Valoracion();
		verEvento verEvento = new verEvento();
		AdministradorEventos AdministradorEventos = new AdministradorEventos();
		AdministradorUsuarios AdministradorUsuarios = new AdministradorUsuarios();
		datosConexion datosConexionPantalla = new datosConexion();

		JFrame[] pantallas = { /* 0 */cambiarContrasena, /* 1 */crearPerfil, /* 2 */crearEvento, /* 3 */editarPerfil,
				/* 4 */FAQs, /* 5 */foro, /* 6 */historial, /* 7 */login, /* 8 */misEventos, /* 9 */modificarEvento,
				/* 10 */perfil, /* 11 */mainPage, /* 12 */recuperarContrasena, /* 13 */recuperarContrasenaV2,
				/* 14 */registro, /* 15 */unirseEvento, /* 16 */valoracion, /* 17 */verEvento,
				/* 18 */ AdministradorEventos, /* 19 */ AdministradorUsuarios, /* 20 */ datosConexionPantalla };

		miControlador.setMiModelo(miModelo);
		miModelo.setPantallas(pantallas);
		miControlador.setPantallas(pantallas);

		cambiarContrasena.setMiControlador(miControlador);
		datosConexionPantalla.setMiControlador(miControlador);
		crearEvento.setMiControlador(miControlador);
		crearPerfil.setMiControlador(miControlador);
		editarPerfil.setMiControlador(miControlador);
		FAQs.setMiControlador(miControlador);
		foro.setMiControlador(miControlador);
		login.setMiControlador(miControlador);
		misEventos.setMiControlador(miControlador);
		modificarEvento.setMiControlador(miControlador);
		perfil.setMiControlador(miControlador);
		recuperarContrasena.setMiControlador(miControlador);
		recuperarContrasenaV2.setMiControlador(miControlador);
		registro.setMiControlador(miControlador);
		unirseEvento.setMiControlador(miControlador);
		valoracion.setMiControlador(miControlador);
		historial.setMiControlador(miControlador);
		verEvento.setMiControlador(miControlador);
		mainPage.setMiControlador(miControlador);
		AdministradorUsuarios.setMiControlador(miControlador);
		AdministradorEventos.setMiControlador(miControlador);

		cambiarContrasena.setMiModelo(miModelo);
		crearEvento.setMiModelo(miModelo);
		datosConexionPantalla.setMiModelo(miModelo);
		crearPerfil.setMiModelo(miModelo);
		editarPerfil.setMiModelo(miModelo);
		FAQs.setMiModelo(miModelo);
		foro.setMiModelo(miModelo);
		login.setMiModelo(miModelo);
		misEventos.setMiModelo(miModelo);
		modificarEvento.setMiModelo(miModelo);
		perfil.setMiModelo(miModelo);
		recuperarContrasena.setMiModelo(miModelo);
		recuperarContrasenaV2.setMiModelo(miModelo);
		registro.setMiModelo(miModelo);
		unirseEvento.setMiModelo(miModelo);
		valoracion.setMiModelo(miModelo);
		verEvento.setMiModelo(miModelo);
		mainPage.setMiModelo(miModelo);
		AdministradorEventos.setMiModelo(miModelo);
		AdministradorUsuarios.setMiModelo(miModelo);
		miControlador.setPantallas(pantallas);

		historial.setMiModelo(miModelo);
		login.setVisible(true);
	}
}
