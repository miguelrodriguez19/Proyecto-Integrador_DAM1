package SportChoice;

import javax.swing.JFrame;

public class Controlador {

	private Modelo miModelo;



	private CambiarContrasena cambiarContrasena=new CambiarContrasena();
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
	private RecuperarContrasena recuperarContrasena=new RecuperarContrasena();
	private RecuperarContrasenaV2 recuperarContrasenaV2=new RecuperarContrasenaV2();
	private Register registro=new Register();
	private salirForo salirForo=new salirForo();
	private unirseEvento unirseEvento=new unirseEvento();
	private Valoracion valoracion=new Valoracion();
	private verEvento verEvento=new verEvento();

	
	private  JFrame[]pantallas={cambiarContrasena,crearPerfil,crearEvento,editarPerfil,FAQs,foro,
			login,misEventos,modificarEvento,perfil,mainPage,recuperarContrasena,recuperarContrasenaV2,registro,salirForo,unirseEvento,valoracion,verEvento
	};
	
	public void actualizar(int pantallaAnterior, int pantallaNueva) {
		pantallas[pantallaAnterior].setVisible(false);
		pantallas[pantallaNueva].setVisible(true);
	}
	

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public void setCambiarContrasena(CambiarContrasena cambiarContrasena) {
		this.cambiarContrasena = cambiarContrasena;

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
//	public void setHistorial(HistorialWindow historial) {
//		this.historial = historial;
//	}
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
	public void setSalirForo(salirForo salirForo) {
		this.salirForo = salirForo;
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
	
}
