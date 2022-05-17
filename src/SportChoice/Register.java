package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Register extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JTextField txtNombre,txtApellidos,txtMail,txtContrasea,txtRepiteContrasea;
	private JButton btnSiguiente,btnIniciarSesion;

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
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnSiguiente.setBounds(520, 321, 275, 53);

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
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DIA" }));
		comboBox.setBounds(520, 281, 74, 30);
		getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(null);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "MES" }));
		comboBox_1.setBounds(600, 281, 74, 30);
		getContentPane().add(comboBox_1);

		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBorder(null);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "A\u00D1O" }));
		comboBox_1_1.setBounds(684, 281, 111, 30);
		getContentPane().add(comboBox_1_1);
		
		btnIniciarSesion = new JButton("\u00BFYa tienes Cuenta? Inicia sesion\r\n");
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(57, 62, 70));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciarSesion.setBounds(520, 384, 275, 21);
		getContentPane().add(btnIniciarSesion);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(489, 0, 347, 443);
		getContentPane().add(panel);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(new ImageIcon(Register.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		getContentPane().add(lblNewLabel);

	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}