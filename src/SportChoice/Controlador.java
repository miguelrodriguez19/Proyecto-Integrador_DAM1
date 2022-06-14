package SportChoice;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controlador {
	private Modelo miModelo;
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
		String usr = ((LogIn) pantallas[7]).getUsr();
		String pwd = ((LogIn) pantallas[7]).getPwd();
		miModelo.login(usr, pwd);
	}

	public void guardar() {
		String[] datos = { ((datosConexion) pantallas[20]).getTxtUsuarioConexion().getText(),
				((datosConexion) pantallas[20]).getTxtPwdConexion().getText(),
				((datosConexion) pantallas[20]).getTxtUrlConexion().getText() };
		miModelo.guardar(datos, ((datosConexion) pantallas[20]).getClaves());
	}
	public void datosRegistro() {
		String name =((Register) pantallas[14]).getTxtNombre();
		String apellido=((Register) pantallas[14]).getTxtApellidos();
		String password=((Register) pantallas[14]).getTxtContrasea();
		String mail=((Register) pantallas[14]).getTxtMail();
		String dia=((Register) pantallas[14]).getDia();
		String mes=((Register) pantallas[14]).getMes();
		String año=((Register) pantallas[14]).getAño();
		String usr=((ConfCrearPerfil) pantallas[1]).getTxtUsername();
		String fecha=año+"-"+mes+"-"+dia;
		miModelo.Registrarse(name,apellido,password,mail,fecha,usr);
	}
}
