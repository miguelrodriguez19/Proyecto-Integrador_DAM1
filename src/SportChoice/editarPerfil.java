package SportChoice;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;

public class editarPerfil  extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel header;
	private JLabel lblNewLabel, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7,
			lblNewLabel_8, lblNewLabel_11, lblNewLabel_13, lblNewLabel_14, lblNewLabel_1, lblPerfil;
	private JButton btnEliminar, btnNewButton_1, btnNewButton_2, btnNewButton_3;
	private JComboBox comboBox_1;
	private JTextArea txtrModificarDescripcion;
	private JTextField txtNuevaLocalidad, txtNuevoNombreDe, txtMoralzarzalMadrid;

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

		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/image-modified-modified.png")));
		lblNewLabel.setBounds(736, 0, 101, 100);
		header.add(lblNewLabel);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(57, 62, 70));
		btnNewButton_1.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/home-48.png")));
		btnNewButton_1.setBounds(10, 10, 85, 70);
		header.add(btnNewButton_1);

		txtNuevoNombreDe = new JTextField();
		txtNuevoNombreDe.setForeground(Color.LIGHT_GRAY);
		txtNuevoNombreDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoNombreDe.setText("@Joselin");
		txtNuevoNombreDe.setBounds(569, 27, 157, 23);
		header.add(txtNuevoNombreDe);
		txtNuevoNombreDe.setColumns(10);

		btnNewButton_3 = new JButton("Cambiar contrase�a");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setBackground(null);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBounds(569, 61, 157, 19);
		header.add(btnNewButton_3);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(
				new ImageIcon(editarPerfil.class.getResource("/Imagenes/marker-free-icon-font (1) (1) (1) (1).png")));
		lblNewLabel_3.setBounds(513, 153, 33, 33);
		getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/venus-mars-free-icon-font (1).png")));
		lblNewLabel_4.setBounds(320, 197, 33, 33);
		getContentPane().add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/calendar-free-icon-font (1).png")));
		lblNewLabel_5.setBounds(104, 196, 33, 33);
		getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/basketball-free-icon-font (1).png")));
		lblNewLabel_6.setBounds(320, 154, 33, 33);
		getContentPane().add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/thumbs-up-free-icon-font (1).png")));
		lblNewLabel_7.setBounds(513, 197, 33, 33);
		getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8
				.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/document-free-icon-font (1).png")));
		lblNewLabel_8.setBounds(104, 233, 33, 33);
		getContentPane().add(lblNewLabel_8);

		lblNewLabel_11 = new JLabel("19 a\u00F1os");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(143, 197, 145, 33);
		getContentPane().add(lblNewLabel_11);

		lblNewLabel_13 = new JLabel("125");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(550, 197, 46, 33);
		getContentPane().add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(136, 233, 145, 33);
		getContentPane().add(lblNewLabel_14);

		btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(53, 187, 95));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(607, 382, 120, 30);
		getContentPane().add(btnNewButton_2);

		txtNuevaLocalidad = new JTextField();
		txtNuevaLocalidad.setForeground(Color.LIGHT_GRAY);
		txtNuevaLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevaLocalidad.setText("Jose Hernandez");
		txtNuevaLocalidad.setBounds(143, 159, 145, 24);
		getContentPane().add(txtNuevaLocalidad);
		txtNuevaLocalidad.setColumns(10);

		txtrModificarDescripcion = new JTextArea();
		txtrModificarDescripcion.setForeground(Color.LIGHT_GRAY);
		txtrModificarDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrModificarDescripcion.setText("Modificar descripcion...");
		txtrModificarDescripcion.setBounds(104, 266, 623, 105);
		getContentPane().add(txtrModificarDescripcion);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Deporte Favorito" }));
		comboBox.setBounds(363, 159, 114, 24);
		getContentPane().add(comboBox);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/icons8-usuario-30.png")));
		lblNewLabel_1.setBounds(100, 154, 33, 33);
		getContentPane().add(lblNewLabel_1);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "No especificar", "Hombre ", "Mujer", "Otro" }));
		comboBox_1.setBounds(363, 206, 114, 24);
		getContentPane().add(comboBox_1);

		txtMoralzarzalMadrid = new JTextField();
		txtMoralzarzalMadrid.setText("Moralzarzal, Madrid 28411");
		txtMoralzarzalMadrid.setForeground(Color.LIGHT_GRAY);
		txtMoralzarzalMadrid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMoralzarzalMadrid.setColumns(10);
		txtMoralzarzalMadrid.setBounds(550, 161, 177, 24);
		getContentPane().add(txtMoralzarzalMadrid);

		lblPerfil = new JLabel("Perfil");
		lblPerfil.setForeground(Color.WHITE);
		lblPerfil.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPerfil.setBounds(33, 110, 248, 23);
		getContentPane().add(lblPerfil);

		btnEliminar = new JButton("Cancelar");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(new Color(204, 0, 0));
		btnEliminar.setBounds(476, 383, 120, 30);
		getContentPane().add(btnEliminar);
	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}