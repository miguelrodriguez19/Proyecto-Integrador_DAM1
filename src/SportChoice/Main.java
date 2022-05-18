package SportChoice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Main {

	

	public static void main(String[] args) {
		Controlador miControlador=new Controlador();
		Modelo miModelo=new Modelo();
		
		 CambiarContrasena cambiarContrasena=new CambiarContrasena();
		 ConfCrearPerfil crearPerfil= new ConfCrearPerfil();
		 crearEvento crearEvento=new crearEvento();
		 editarPerfil editarPerfil=new editarPerfil();
		 FAQsWindow FAQs=new FAQsWindow();
		 Foro foro=new Foro();
//		 HistorialWindow historial=new HistorialWindow();
		 LogIn login=new LogIn();
		 MisEventos misEventos=new MisEventos();
		 MainPage mainPage=new MainPage();
		 ModificarEvento modificarEvento=new ModificarEvento();
		 Perfil perfil=new Perfil();
		 RecuperarContrasena recuperarContrasena=new RecuperarContrasena();
		 RecuperarContrasenaV2 recuperarContrasenaV2=new RecuperarContrasenaV2();
		 Register registro=new Register();
		 salirForo salirForo=new salirForo();
		 unirseEvento unirseEvento=new unirseEvento();
		 Valoracion valoracion=new Valoracion();
		 verEvento verEvento=new verEvento();
		 
		 JFrame[]pantallas={cambiarContrasena,crearPerfil,crearEvento,editarPerfil,FAQs,foro,
					login,misEventos,modificarEvento,perfil,mainPage,recuperarContrasena,recuperarContrasenaV2,registro,salirForo,unirseEvento,valoracion,verEvento
			};
		 
		 miControlador.setMiModelo(miModelo);
		 
		 miModelo.setCambiarContrasena(cambiarContrasena);
		 miModelo.setCrearEvento(crearEvento);
		 miModelo.setCrearPerfil(crearPerfil);
		 miModelo.setEditarPerfil(editarPerfil);
		 miModelo.setFAQs(FAQs);
		 miModelo.setForo(foro);
		 miModelo.setLogin(login);
		 miModelo.setMisEventos(misEventos);
		 miModelo.setModificarEvento(modificarEvento);
		 miModelo.setPerfil(perfil);
		 miModelo.setRecuperarContrasena(recuperarContrasena);
		 miModelo.setRecuperarContrasenaV2(recuperarContrasenaV2);
		 miModelo.setRegistro(registro);
		 miModelo.setSalirForo(salirForo);
		 miModelo.setUnirseEvento(unirseEvento);
		 miModelo.setValoracion(valoracion);
		 miModelo.setVerEvento(verEvento);
		 miModelo.setMainPage(mainPage);
		 
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
		salirForo.setMiControlador(miControlador);
		unirseEvento.setMiControlador(miControlador);
		valoracion.setMiControlador(miControlador);
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
		salirForo.setMiModelo(miModelo);
		unirseEvento.setMiModelo(miModelo);
		valoracion.setMiModelo(miModelo);
		verEvento.setMiModelo(miModelo);
		mainPage.setMiModelo(miModelo);
		miControlador.setPantallas(pantallas);
		mainPage.setVisible(true);
	}
}
