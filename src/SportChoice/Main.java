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

		JFrame[] pantallas = { cambiarContrasena, crearPerfil, crearEvento, editarPerfil, FAQs, foro, historial, login, misEventos,
				modificarEvento, perfil, mainPage, recuperarContrasena, recuperarContrasenaV2, registro, unirseEvento,
				valoracion, verEvento };

		miControlador.setMiModelo(miModelo);

		miModelo.setPantallas(pantallas);

		cambiarContrasena.setMiControlador(miControlador);
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

		cambiarContrasena.setMiModelo(miModelo);
		crearEvento.setMiModelo(miModelo);
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
		miControlador.setPantallas(pantallas);
		
		historial.setMiModelo(miModelo);
		login.setVisible(true);
	}
}
