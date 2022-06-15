package SportChoice;

import java.util.Calendar;

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

	/**
	 * Coge los campos de datosConexion mediante getters de su pantalla y se los
	 * pasa al modelo para que este realice la funcionalidad ( cambiar los datos de
	 * la conexión)
	 */
	public void guardar() {
		String[] datos = { ((datosConexion) pantallas[20]).getTxtUsuarioConexion().getText(),
				((datosConexion) pantallas[20]).getTxtPwdConexion().getText(),
				((datosConexion) pantallas[20]).getTxtUrlConexion().getText() };
		miModelo.guardar(datos, ((datosConexion) pantallas[20]).getClaves());
	}

	public boolean validarForm(String txtNombre, String txtApellidos, String txtEmail, String txtContrasena,
			int comboBox_Dia, int comboBox_Mes, int comboBox_Ano) {
		if (txtNombre != "" && txtApellidos != "" && txtEmail != "" && txtContrasena != "" && comboBox_Dia != 0
				&& comboBox_Mes != 0 && comboBox_Ano != 0)
			return true;

		return false;
	}

	/**
	 * Coge mediante getters los campos de editarPerfil y rellena un array de
	 * Strings para pasarselo al modelo con estos datos que le serviran al modelo
	 * para actualizar los datos del usuario en cuestión.
	 */
	public void guardarCambiosPerfil() {
		String[] nombreApellido = ((editarPerfil) pantallas[3]).getTxtNuevoNombre().getText().split(" ");
		String[] datosCambiosPerfil = { ((editarPerfil) pantallas[3]).getTxtNuevoNombreUsuario().getText(),
				nombreApellido[0], nombreApellido[1],
				((editarPerfil) pantallas[3]).getTxtModificarDescripcion().getText(),
				((editarPerfil) pantallas[3]).getLblMeGustas().getText(),
				((editarPerfil) pantallas[3]).getComboBoxDeporte(), ((editarPerfil) pantallas[3]).getComboBoxGenero() };
		miModelo.guardarCambiosPerfil(datosCambiosPerfil);
	}

	public void unirseEvento(String eventoSeleccionado) {
		if (!(miModelo.getUsuarioConectado().equals("invitado"))) {
			miModelo.unirseEvento(eventoSeleccionado);
			actualizar(15, 17);
		}else
			actualizar(15, 7);
}

	/**
	 * Coge mediante getters todos los campos de cambiarContrasena (Contraseña
	 * Antigua, Nueva, y ConfirmarNueva) y se pasa al modelo que es el que los
	 * tratará para relizar las respectivas comprobaciones con ellos y cambiar su
	 * contraseña si estas son exitosas.
	 */
	public void cambioContrasena() {
		miModelo.cambioContrasena(((CambiarContrasena) pantallas[0]).getTxtContrasenaActual(),
				((CambiarContrasena) pantallas[0]).getTxtNuevaContrasena(),
				((CambiarContrasena) pantallas[0]).getTxtConfirmarNuevaContrasena());
	}
	public void datosRegistro() {
		String name =((Register) pantallas[14]).getTxtNombre();
		String apellido=((Register) pantallas[14]).getTxtApellidos();
		String password=((Register) pantallas[14]).getTxtContrasea();
		String mail=((Register) pantallas[14]).getTxtMail();
		String dia=((Register) pantallas[14]).getDia();
		String mes=((Register) pantallas[14]).getMes();
		String ano=((Register) pantallas[14]).getAño();
		String usr=((ConfCrearPerfil) pantallas[1]).getTxtUsername();
		String fecha=ano+"-"+mes+"-"+dia;
		miModelo.Registrarse(name,apellido,password,mail,fecha,usr);
	}
	public boolean UserExist(Boolean usrExist) {
		return usrExist;
	}

	/**
	 * Coge mediante getters todos los campos de crearEvento para crear el evento y
	 * rellena un array de Strings con estos que le pasa posteriormente al modelo
	 * que es el que tratará estos datos para crear el respectivo evento.
	 */
	public void crearEvento() {
		String[] fechaEventoArray = ((crearEvento) pantallas[2]).getCalendar().getDate().toString().split(" ");
		String ano = fechaEventoArray[5];
		String mes = fechaEventoArray[1];
		if (mes.equals("Jun"))
			mes = "06";
		else if (mes.equals("Jan"))
			mes = "01";
		else if (mes.equals("Feb"))
			mes = "02";
		else if (mes.equals("Mar"))
			mes = "03";
		else if (mes.equals("Apr"))
			mes = "04";
		else if (mes.equals("Apr"))
			mes = "05";
		else if (mes.equals("Jul"))
			mes = "07";
		else if (mes.equals("Aug"))
			mes = "08";
		else if (mes.equals("Sep"))
			mes = "09";
		else if (mes.equals("Oct"))
			mes = "10";
		else if (mes.equals("Nov"))
			mes = "11";
		else
			mes = "12";
		String dia = fechaEventoArray[2];
		String fechaEvento = ano.concat("-" + mes + "-" + dia);
		String privacidadEvento;
		if (((crearEvento) pantallas[2]).getRdbtnPrivado().isSelected())
			privacidadEvento = "Privado";
		else
			privacidadEvento = "Público";
		String[] datosEvento = { ((crearEvento) pantallas[2]).getTxtpnOrganizamosUnPartido().getText(),
				((crearEvento) pantallas[2]).getTxtLocalizacion().getText(),
				((crearEvento) pantallas[2]).getTxtPartidoFutbol().getText(), privacidadEvento,
				((crearEvento) pantallas[2]).getComboBox().getSelectedItem().toString(), fechaEvento };
		miModelo.crearEvento(datosEvento);
	}
}
