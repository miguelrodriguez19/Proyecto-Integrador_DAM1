package SportChoice;

import javax.swing.JFrame;

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

	public boolean validarForm(String txtNombre, String txtApellidos, String txtEmail, String txtContrasena, int comboBox_Dia, int comboBox_Mes, int comboBox_Ano) {
		if (txtNombre != "" && txtApellidos != "" && txtEmail != "" && txtContrasena != "" && comboBox_Dia != 0 && comboBox_Mes != 0 && comboBox_Ano != 0) {
			System.out.println("validar form TRUE");
			return true;
		}
		return false;
	}
	
	public void guardarCambiosPerfil() {
		String[] datosCambiosPerfil = { ((editarPerfil) pantallas[3]).getTxtNuevoNombreUsuario().getText(),
				((editarPerfil) pantallas[3]).getTxtNuevoNombre().getText(),
				((editarPerfil) pantallas[3]).getTxtModificarDescripcion().getText(),
				((editarPerfil) pantallas[3]).getLblMeGustas().getText(),
				(String) ((editarPerfil) pantallas[3]).getComboBoxDeporte().getSelectedItem(),
				(String) ((editarPerfil) pantallas[3]).getComboBoxGenero().getSelectedItem() };
		miModelo.guardarCambiosPerfil(datosCambiosPerfil);
	}

	public void cambioContrasena() {
		miModelo.cambioContrasena(((CambiarContrasena) pantallas[0]).getTxtContrasenaActual(), ((CambiarContrasena) pantallas[0]).getTxtNuevaContrasena(), ((CambiarContrasena) pantallas[0]).getTxtConfirmarNuevaContrasena());
		
	}
}
