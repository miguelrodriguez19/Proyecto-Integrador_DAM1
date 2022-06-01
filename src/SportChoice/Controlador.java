package SportChoice;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controlador {
	private Modelo miModelo;
	private datosConexion misDatos = new datosConexion();
	private JFrame[] pantallas;

//	= { /*0*/cambiarContrasena, /*1*/crearPerfil, /*2*/crearEvento, /*3*/editarPerfil, /*4*/FAQs, /*5*/foro, /*6*/historial, /*7*/login,
//			/*8*/misEventos, /*9*/modificarEvento, /*10*/perfil, /*11*/mainPage, /*12*/recuperarContrasena, /*13*/recuperarContrasenaV2, /*14*/registro,
//			/*15*/unirseEvento, /*16*/valoracion, /*17*/verEvento };

	public void actualizar(int pantallaAnterior, int pantallaNueva) {
		pantallas[pantallaAnterior].setVisible(false);
		pantallas[pantallaNueva].setVisible(true);
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setPantallas(JFrame[] pantallas) {
		this.pantallas = pantallas;
	}

	public void login() {
		String usr = ((LogIn)pantallas[7]).getUsr();
		String pwd = ((LogIn)pantallas[7]).getPwd();
		miModelo.login(usr, pwd);
	}
	
	public void guardar(){
		miModelo.guardar(misDatos.getBillete(),misDatos.getPremio());
	}
	
	public void borrar (){
		miModelo.borrar(misDatos.getBillete());
	}
	
	public void comprobar (){
		miModelo.comprobar(misDatos.getBillete());
	}
	
}
