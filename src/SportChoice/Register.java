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
import java.awt.Component;
import javax.swing.border.EmptyBorder;

public class Register extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JTextField txtNombre, txtApellidos, txtEmail;
	private JPasswordField txtContrasena, txtRepiteContrasena;
	private JButton btnSiguiente, btnIniciarSesion;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_Dia;
	private JComboBox comboBox_Mes;
	private JComboBox comboBox_Ano;
	private JLabel lblNewLabel_1;
	private JLabel lblTienesCuenta;

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

		ButtonGroup group = new ButtonGroup();

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(487, 0, 349, 443);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblTienesCuenta = new JLabel("¿Ya tienes Cuenta? ");
		lblTienesCuenta.setForeground(Color.WHITE);
		lblTienesCuenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTienesCuenta.setBounds(82, 388, 101, 21);
		panel.add(lblTienesCuenta);

		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 0, 276, 88);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 63));

		txtApellidos = new JTextField();
		txtApellidos.setMargin(new Insets(2, 5, 2, 5));
		txtApellidos.setBounds(132, 97, 180, 30);
		panel.add(txtApellidos);
		txtApellidos.setText("Apellidos");
		txtApellidos.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setMargin(new Insets(2, 5, 2, 5));
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setBounds(36, 99, 85, 30);
		panel.add(txtNombre);
		txtNombre.setName("");
		txtNombre.setText("Nombre");
		txtNombre.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setMargin(new Insets(2, 5, 2, 5));
		txtEmail.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtEmail.setBounds(37, 138, 275, 30);
		panel.add(txtEmail);
		txtEmail.setText("E-mail");
		txtEmail.setColumns(10);

		txtContrasena = new JPasswordField();
		txtContrasena.setMargin(new Insets(2, 5, 2, 5));
		txtContrasena.setBounds(37, 179, 275, 30);
		panel.add(txtContrasena);
		txtContrasena.setText("Contraseña");
		txtContrasena.setColumns(10);

		txtRepiteContrasena = new JPasswordField();
		txtRepiteContrasena.setMargin(new Insets(2, 5, 2, 5));
		txtRepiteContrasena.setBounds(37, 220, 275, 30);
		panel.add(txtRepiteContrasena);
		txtRepiteContrasena.setText("Repite Contraseña");
		txtRepiteContrasena.setColumns(10);

		lblNewLabel_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1.setBounds(36, 259, 154, 13);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		comboBox_Dia = new JComboBox();
		comboBox_Dia.setBounds(231, 283, 81, 30);
		panel.add(comboBox_Dia);
		comboBox_Dia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
				"26", "27", "28", "29", "30", "31" }));
		comboBox_Dia.setBorder(null);

		comboBox_Mes = new JComboBox();
		comboBox_Mes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarDias();
			}
		});
		comboBox_Mes.setBounds(144, 283, 81, 30);
		panel.add(comboBox_Mes);
		comboBox_Mes.setBorder(null);
		comboBox_Mes.setModel(new DefaultComboBoxModel(
				new String[] { "MES", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

		comboBox_Ano = new JComboBox();
		comboBox_Ano.setBounds(36, 283, 101, 30);
		panel.add(comboBox_Ano);
		comboBox_Ano.setBorder(null);
		comboBox_Ano.setModel(new DefaultComboBoxModel(new String[] { "AÑO", "2022", "2021", "2020", "2019", "2018",
				"2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005",
				"2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992",
				"1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979",
				"1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966",
				"1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957" }));

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(37, 324, 275, 53);
		panel.add(btnSiguiente);
		btnSiguiente.setBorder(null);
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setBackground(new Color(156, 163, 219));
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (miControlador.validarForm(txtNombre.getText(), txtApellidos.getText(), txtEmail.getText(),
						txtContrasena.getPassword().toString(), comboBox_Dia.getSelectedIndex(), comboBox_Mes.getSelectedIndex(), comboBox_Ano.getSelectedIndex())) {
					miControlador.actualizar(14, 1);
				}
			}
		});
		btnSiguiente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnIniciarSesion = new JButton("I̲n̲i̲c̲i̲a̲_S̲e̲s̲i̲o̲n̲");
		btnIniciarSesion.setBounds(184, 388, 85, 21);
		panel.add(btnIniciarSesion);
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(57, 62, 70));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(14, 7);
			}
		});
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setAlignmentX(0.5f);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel_2.setIcon(new ImageIcon(Register.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel_2.setBounds(-232, -13, 1586, 456);
		getContentPane().add(lblNewLabel_2);

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	private void cargarDias() {
		if (comboBox_Ano.getSelectedIndex() != 0) {
			if (comboBox_Mes.getSelectedIndex() == 2) {
				if (Integer.parseInt(comboBox_Ano.getSelectedItem().toString()) % 4 == 0) {
					comboBox_Dia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6",
							"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
							"23", "24", "25", "26", "27", "28", "29" }));
				} else {
					comboBox_Dia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6",
							"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
							"23", "24", "25", "26", "27", "28" }));
				}
			} else {
				comboBox_Dia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7",
						"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
						"24", "25", "26", "27", "28", "29", "30", "31" }));
			}
		}
	}
}