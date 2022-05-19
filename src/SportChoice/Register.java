package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Insets;
import java.awt.Point;

public class Register extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JTextField txtNombre, txtApellidos, txtMail, txtContrasea, txtRepiteContrasea;
	private JButton btnSiguiente, btnIniciarSesion;

	public static void Register() {
		Register window = new Register();
		window.setVisible(true);
	}

	public Register() {
		setResizable(false);
		Container container = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Registro");
		container.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(520, 258, 154, 13);
		getContentPane().add(lblNewLabel_1);

		txtNombre = new JTextField();
		txtNombre.setName("");
		txtNombre.setBorder(null);
		txtNombre.setText("Nombre");

		txtNombre.setBounds(520, 97, 85, 30);
		container.add(txtNombre);
		txtNombre.setColumns(10);

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setBackground(new Color(156, 163, 219));
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 miControlador.actualizar(14, 1);
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnSiguiente.setBounds(520, 334, 275, 53);

		container.add(btnSiguiente);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 63));
		lblNewLabel.setBounds(520, 0, 275, 98);
		getContentPane().add(lblNewLabel);

		txtApellidos = new JTextField();
		txtApellidos.setBorder(null);
		txtApellidos.setText("Apellidos");
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(615, 97, 180, 30);
		getContentPane().add(txtApellidos);

		txtMail = new JTextField();
		txtMail.setBorder(null);
		txtMail.setText("Mail");
		txtMail.setColumns(10);
		txtMail.setBounds(520, 138, 275, 30);
		getContentPane().add(txtMail);

		txtRepiteContrasea = new JTextField();
		txtRepiteContrasea.setBorder(null);
		txtRepiteContrasea.setText("Repite Contrase\u00F1a");
		txtRepiteContrasea.setColumns(10);
		txtRepiteContrasea.setBounds(520, 218, 275, 30);
		getContentPane().add(txtRepiteContrasea);

		txtContrasea = new JTextField();
		txtContrasea.setBorder(null);
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(520, 178, 275, 30);
		getContentPane().add(txtContrasea);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		comboBox.setBorder(null);
		comboBox.setBounds(520, 281, 74, 30);
		getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(null);
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "MES", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_1.setBounds(600, 281, 74, 30);
		getContentPane().add(comboBox_1);

		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBorder(null);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "A\u00D1O", "2022", "2021", "2020", "2019",
				"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006",
				"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993",
				"1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980",
				"1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967",
				"1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957" }));
		comboBox_1_1.setBounds(684, 281, 111, 30);
		getContentPane().add(comboBox_1_1);

		btnIniciarSesion = new JButton(
				"\u00BFYa tienes Cuenta? I\u0332n\u0332i\u0332c\u0332i\u0332a\u0332_\u0332S\u0332e\u0332s\u0332i\u0332o\u0332n\u0332\r\n");
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(57, 62, 70));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 miControlador.actualizar(14, 7);
			}
		});
		btnIniciarSesion.setBounds(520, 397, 275, 21);
		getContentPane().add(btnIniciarSesion);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(497, 0, 339, 443);
		getContentPane().add(panel);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(new ImageIcon(Register.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		getContentPane().add(lblNewLabel);
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSiguiente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}