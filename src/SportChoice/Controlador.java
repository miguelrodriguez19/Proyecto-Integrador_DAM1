package SportChoice;

import javax.swing.JFrame;

public class Controlador {
	private CambiarContrasena cambiarContrasena;
	private ConfCrearPerfil crearPerfil;
	private crearEvento crearEvento;
	private editarPerfil editarPerfil;
	private FAQsWindow FAQs;
	private Foro foro;
	private HistorialWindow historial;
	private LogIn login;
	private MisEventos misEventos;
	private ModificarEvento modificarEvento;
	private Perfil perfil;
	private RecuperarContrasena recuperarContrasena;
	private Register registro;
	private salirForo salirForo;
	private unirseEvento unirseEvento;
	private Valoracion valoracion;
	private verEvento verEvento;
	
	public void actualizar(JFrame pantallaAnterior, JFrame pantallaNueva) {
		pantallaAnterior.setVisible(false);
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
