package SportChoice;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class editarPerfil  extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel header;
	private JLabel lblFotoPerfil, lblIconoUbicacion, lblIconoGenero, lblIconoCalendario, lblIconoBaloncesto, lblIconoMeGusta,
			lblIconoDescripcion, lblEdad, lblMeGustas, lblDescripcion, lblIconoPerfil, lblPerfil;
	private JButton btnEliminar, btnGuardar, btnCambiarContrasena;
	private JComboBox comboBoxGenero;
	private JTextArea txtrModificarDescripcion;
	private JTextField txtNuevoNombre, txtNuevoNombreUsuario, txtLocalidad;
	private JButton btnLogo;

	public static void editarPerfil() {
		editarPerfil window = new editarPerfil();
		window.setVisible(true);
	}

	public editarPerfil() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Editar perfil");
		getContentPane().setLayout(null);

		header = new JPanel();
		header.setBorder(null);
		header.setBackground(new Color(57, 62, 70));
		header.setBounds(0, 0, 837, 100);
		getContentPane().add(header);
		header.setLayout(null);

		lblFotoPerfil = new JLabel("");
		lblFotoPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoPerfil.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/image-modified-modified.png")));
		lblFotoPerfil.setBounds(736, 0, 101, 100);
		header.add(lblFotoPerfil);

		txtNuevoNombreUsuario = new JTextField();
		txtNuevoNombreUsuario.setForeground(Color.LIGHT_GRAY);
		txtNuevoNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoNombreUsuario.setText("@Joselin");
		txtNuevoNombreUsuario.setBounds(569, 27, 157, 23);
		header.add(txtNuevoNombreUsuario);
		txtNuevoNombreUsuario.setColumns(10);

		btnCambiarContrasena = new JButton("Cambiar contrasena");
		btnCambiarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 0);
			}
		});
		btnCambiarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCambiarContrasena.setBackground(null);
		btnCambiarContrasena.setBorder(null);
		btnCambiarContrasena.setForeground(Color.WHITE);
		btnCambiarContrasena.setBounds(569, 61, 157, 19);
		header.add(btnCambiarContrasena);
		
		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(3, 11);
			}
		});
		btnLogo.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(30, 15, 114, 68);
		header.add(btnLogo);

		lblIconoUbicacion = new JLabel("");
		lblIconoUbicacion.setIcon(
				new ImageIcon(editarPerfil.class.getResource("/Imagenes/marker-free-icon-font (1) (1) (1) (1).png")));
		lblIconoUbicacion.setBounds(513, 153, 33, 33);
		getContentPane().add(lblIconoUbicacion);

		lblIconoGenero = new JLabel("");
		lblIconoGenero
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/venus-mars-free-icon-font (1).png")));
		lblIconoGenero.setBounds(320, 197, 33, 33);
		getContentPane().add(lblIconoGenero);

		lblIconoCalendario = new JLabel("");
		lblIconoCalendario
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/calendar-free-icon-font (1).png")));
		lblIconoCalendario.setBounds(104, 196, 33, 33);
		getContentPane().add(lblIconoCalendario);

		lblIconoBaloncesto = new JLabel("");
		lblIconoBaloncesto
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/basketball-free-icon-font (1).png")));
		lblIconoBaloncesto.setBounds(320, 154, 33, 33);
		getContentPane().add(lblIconoBaloncesto);

		lblIconoMeGusta = new JLabel("");
		lblIconoMeGusta
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/thumbs-up-free-icon-font (1).png")));
		lblIconoMeGusta.setBounds(513, 197, 33, 33);
		getContentPane().add(lblIconoMeGusta);

		lblIconoDescripcion = new JLabel("");
		lblIconoDescripcion
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/document-free-icon-font (1).png")));
		lblIconoDescripcion.setBounds(104, 233, 33, 33);
		getContentPane().add(lblIconoDescripcion);

		lblEdad = new JLabel("19 a\u00F1os");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEdad.setBounds(143, 197, 145, 33);
		getContentPane().add(lblEdad);

		lblMeGustas = new JLabel("125");
		lblMeGustas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMeGustas.setForeground(Color.WHITE);
		lblMeGustas.setBounds(550, 197, 46, 33);
		getContentPane().add(lblMeGustas);

		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(136, 233, 145, 33);
		getContentPane().add(lblDescripcion);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(new Color(53, 187, 95));
		btnGuardar.setBorder(null);
		btnGuardar.setBounds(607, 382, 120, 30);
		getContentPane().add(btnGuardar);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(3, 10);
			}
		});

		txtNuevoNombre = new JTextField();
		txtNuevoNombre.setForeground(Color.LIGHT_GRAY);
		txtNuevoNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoNombre.setText("Jose Hernandez");
		txtNuevoNombre.setBounds(143, 159, 145, 24);
		getContentPane().add(txtNuevoNombre);
		txtNuevoNombre.setColumns(10);

		txtrModificarDescripcion = new JTextArea();
		txtrModificarDescripcion.setForeground(Color.LIGHT_GRAY);
		txtrModificarDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrModificarDescripcion.setText("Modificar descripcion...");
		txtrModificarDescripcion.setBounds(104, 266, 623, 105);
		getContentPane().add(txtrModificarDescripcion);

		JComboBox comboBoxDeporte = new JComboBox();
		comboBoxDeporte.setModel(new DefaultComboBoxModel(new String[] { "Deporte Favorito" }));
		comboBoxDeporte.setBounds(363, 159, 114, 24);
		getContentPane().add(comboBoxDeporte);

		lblIconoPerfil = new JLabel("New label");
		lblIconoPerfil.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/icons8-usuario-30.png")));
		lblIconoPerfil.setBounds(100, 154, 33, 33);
		getContentPane().add(lblIconoPerfil);

		comboBoxGenero = new JComboBox();
		comboBoxGenero.setModel(new DefaultComboBoxModel(new String[] { "No especificar", "Hombre ", "Mujer", "Otro" }));
		comboBoxGenero.setBounds(363, 206, 114, 24);
		getContentPane().add(comboBoxGenero);

		txtLocalidad = new JTextField();
		txtLocalidad.setText("Moralzarzal, Madrid 28411");
		txtLocalidad.setForeground(Color.LIGHT_GRAY);
		txtLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLocalidad.setColumns(10);
		txtLocalidad.setBounds(550, 161, 177, 24);
		getContentPane().add(txtLocalidad);

		lblPerfil = new JLabel("Editar perfil");
		lblPerfil.setForeground(Color.WHITE);
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPerfil.setBounds(40, 115, 248, 33);
		getContentPane().add(lblPerfil);

		btnEliminar = new JButton("Cancelar");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(new Color(204, 0, 0));
		btnEliminar.setBounds(476, 383, 120, 30);
		getContentPane().add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(3, 10);
			}
		});
	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}