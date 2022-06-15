package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import java.awt.Insets;
import java.awt.Point;
import javax.swing.border.LineBorder;

public class Register extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JTextField txtNombre, txtApellidos, txtMail, txtContrasea, txtRepiteContrasea;
	private JButton btnSiguiente, btnIniciarSesion;
	private JComboBox comboBox_Dia;
	private JComboBox comboBox_Mes;
	private JComboBox comboBox_Ano;

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
		String nombre = "Nombre";
		txtNombre.setText("Nombre");

		txtNombre.setBounds(520, 97, 85, 30);
		container.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtNombre.getText().equals(nombre))
					txtNombre.setText("");
				txtNombre.setForeground(Color.BLACK);
				txtNombre.setBorder(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtNombre.getText().equals("")) {
					txtNombre.setText(nombre);
					txtNombre.setForeground(Color.GRAY);
					txtNombre.setBorder(null);
				}
			}
		});
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setBackground(new Color(156, 163, 219));
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (txtNombre.getText().equals("Nombre") || txtApellidos.getText().equals("Apellidos") ||txtMail.getText().equals("E-mail")||txtRepiteContrasea.getText().equals("Repite Contrase\u00F1a")||txtContrasea.getText().equals("Contrase\u00F1a")||comboBox_Dia.getSelectedItem().equals("DIA")||comboBox_Mes.getSelectedItem().equals("MES")||comboBox_Ano.getSelectedItem().equals("AÑO")) {
					if (txtNombre.getText().endsWith("Nombre")) {
						txtNombre.setForeground(Color.red);
						txtNombre.setBorder(new LineBorder(Color.RED));
					}
					if (txtApellidos.getText().equals("Apellidos")) {
						txtApellidos.setForeground(Color.red);
						txtApellidos.setBorder(new LineBorder(Color.RED));
					}if (txtMail.getText().equals("E-mail")) {
						txtMail.setForeground(Color.red);
						txtMail.setBorder(new LineBorder(Color.RED));
					}if (txtContrasea.getText().equals("Contrase\u00F1a")) {
						txtContrasea.setForeground(Color.red);
						txtContrasea.setBorder(new LineBorder(Color.RED));
					}if (txtRepiteContrasea.getText().equals("Repite Contrase\u00F1a")) {
						txtRepiteContrasea.setForeground(Color.red);
						txtRepiteContrasea.setBorder(new LineBorder(Color.RED));
					}if (comboBox_Dia.getSelectedItem().equals("DIA")) {
						comboBox_Dia.setForeground(Color.red);
					}
					if (comboBox_Mes.getSelectedItem().equals("MES")) {
						comboBox_Mes.setForeground(Color.red);
					}if (comboBox_Ano.getSelectedItem().equals("AÑO")) {
						comboBox_Ano.setForeground(Color.red);
					}
				}
				 else if(!txtContrasea.getText().equals(txtRepiteContrasea.getText())){
						txtRepiteContrasea.setText("Las contraseñas no coinciden");
						txtRepiteContrasea.setForeground(Color.red);
						txtRepiteContrasea.setBorder(new LineBorder(Color.RED));
					}

				else {
					miControlador.actualizar(14, 1);
				}
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
		String apellidos="Apellidos";
		txtApellidos.setText("Apellidos");
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(615, 97, 180, 30);
		getContentPane().add(txtApellidos);
		txtApellidos.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtApellidos.getText().equals(apellidos))
					txtApellidos.setText("");
				txtApellidos.setForeground(Color.BLACK);
				txtApellidos.setBorder(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtApellidos.getText().equals("")) {
					txtApellidos.setText(apellidos);
					txtApellidos.setForeground(Color.GRAY);
					txtApellidos.setBorder(null);
				}
			}
		});

		txtMail = new JTextField();
		txtMail.setBorder(null);
		String mail="E-mail";
		txtMail.setText("E-mail");
		txtMail.setColumns(10);
		txtMail.setBounds(520, 138, 275, 30);
		getContentPane().add(txtMail);
		txtMail.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtMail.getText().equals(mail))
					txtMail.setText("");
				txtMail.setForeground(Color.BLACK);
				txtMail.setBorder(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtMail.getText().equals("")) {
					txtMail.setText(mail);
					txtMail.setForeground(Color.GRAY);
					txtMail.setBorder(null);
				}
			}
		});

		txtRepiteContrasea = new JTextField();
		txtRepiteContrasea.setBorder(null);
		String repContraseña="Repite Contrase\u00F1a";
		txtRepiteContrasea.setText("Repite Contrase\u00F1a");
		txtRepiteContrasea.setColumns(10);
		txtRepiteContrasea.setBounds(520, 218, 275, 30);
		getContentPane().add(txtRepiteContrasea);
		txtRepiteContrasea.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtRepiteContrasea.getText().equals(repContraseña))
					txtRepiteContrasea.setText("");
				txtRepiteContrasea.setForeground(Color.BLACK);
				txtRepiteContrasea.setBorder(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtRepiteContrasea.getText().equals("")) {
					txtRepiteContrasea.setText(repContraseña);
					txtRepiteContrasea.setForeground(Color.GRAY);
					txtRepiteContrasea.setBorder(null);
				}
			}
		});

		txtContrasea = new JTextField();
		txtContrasea.setBorder(null);
		String contaseña="Contrase\u00F1a";
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(520, 178, 275, 30);
		getContentPane().add(txtContrasea);
		txtContrasea.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtContrasea.getText().equals(contaseña))
					txtContrasea.setText("");
				txtContrasea.setForeground(Color.BLACK);
				txtContrasea.setBorder(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtContrasea.getText().equals("")) {
					txtContrasea.setText(contaseña);
					txtContrasea.setForeground(Color.GRAY);
					txtContrasea.setBorder(null);
				}
			}
		});

		comboBox_Dia = new JComboBox();
		comboBox_Dia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		comboBox_Dia.setBorder(null);
		comboBox_Dia.setBounds(520, 281, 74, 30);
		getContentPane().add(comboBox_Dia);

		comboBox_Mes = new JComboBox();
		comboBox_Mes.setBorder(null);
		comboBox_Mes.setModel(new DefaultComboBoxModel(
				new String[] { "MES", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_Mes.setBounds(600, 281, 74, 30);
		getContentPane().add(comboBox_Mes);

		comboBox_Ano = new JComboBox();
		comboBox_Ano.setBorder(null);
		comboBox_Ano.setModel(new DefaultComboBoxModel(new String[] { "A\u00D1O", "2022", "2021", "2020", "2019",
				"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006",
				"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993",
				"1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980",
				"1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967",
				"1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957" }));
		comboBox_Ano.setBounds(684, 281, 111, 30);
		getContentPane().add(comboBox_Ano);

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
	
	public String getTxtNombre() {
		return txtNombre.getText();
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public String getTxtApellidos() {
		return txtApellidos.getText();
	}

	public void setTxtApellidos(JTextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public String getTxtMail() {
		return txtMail.getText();
	}

	public void setTxtMail(JTextField txtMail) {
		this.txtMail = txtMail;
	}

	public String getTxtContrasea() {
		return txtContrasea.getText();
	}

	public void setTxtContrasea(JTextField txtContrasea) {
		this.txtContrasea = txtContrasea;
	}

	public String getDia() {
		String variable = (String) comboBox_Dia.getSelectedItem();
		return variable;
	}

	public String getMes() {
		String variable = (String) comboBox_Mes.getSelectedItem();
		return variable;
	}

	public String getAño() {
		String variable = (String) comboBox_Ano.getSelectedItem();
		return variable;
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

}