package SportChoice;

import javax.swing.JFrame;

public class Controlador {
	private Modelo miModelo;



	private CambiarContrasena cambiarContraseña=new CambiarContrasena();
	private ConfCrearPerfil crearPerfil= new ConfCrearPerfil();
	private crearEvento crearEvento=new crearEvento();
	private editarPerfil editarPerfil=new editarPerfil();
	private FAQsWindow FAQs=new FAQsWindow();
	private Foro foro=new Foro();
//	private HistorialWindow historial=new HistorialWindow();
	private LogIn login=new LogIn();
	private MainPage mainPage=new MainPage();
	private MisEventos misEventos=new MisEventos();
	private ModificarEvento modificarEvento=new ModificarEvento();
	private Perfil perfil=new Perfil();
	private RecuperarContrasena recuperarContraseña=new RecuperarContrasena();
	private RecuperarContrasenaV2 recuperarContraseñaV2=new RecuperarContrasenaV2();
	private Register registro=new Register();
	private salirForo salirForo=new salirForo();
	private unirseEvento unirseEvento=new unirseEvento();
	private Valoracion valoracion=new Valoracion();
	private verEvento verEvento=new verEvento();
	
	private  JFrame[]pantallas={cambiarContraseña,crearPerfil,crearEvento,editarPerfil,FAQs,foro,
			login,misEventos,modificarEvento,perfil,mainPage,recuperarContraseña,recuperarContraseñaV2,registro,salirForo,unirseEvento,valoracion,verEvento
	};
			
	
	
	public void actualizar(int pantallaAnterior, int pantallaNueva) {
		pantallas[pantallaAnterior].setVisible(false);
		pantallas[pantallaNueva].setVisible(true);
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	
	
	
	
}
