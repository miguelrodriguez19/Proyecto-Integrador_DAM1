package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RecuperarContrasena extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JButton btnOK;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasena,txtNuevaContrasena,txtNuevaContrasena_1;
	private JLabel lblNewLabel_1,lblNewLabel_2;

	public static void RecuperarContrasena() {
		RecuperarContrasena window = new RecuperarContrasena();
		window.setVisible(true);

	}

	public RecuperarContrasena() {
		setResizable(false);
		Container container = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Recuperar contrasena");
		container.setLayout(null);

		btnOK = new JButton("Cambiar Contrase\u00F1a");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 miControlador.actualizar(12, 7);
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(527, 366, 239, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Recuperar\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(562, -26, 308, 98);
		getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(562, 21, 308, 98);
		getContentPane().add(lblContrasea);

		txtAntiguaContrasena = new JTextField();
		txtAntiguaContrasena.setForeground(Color.GRAY);
		txtAntiguaContrasena.setBackground(Color.WHITE);
		txtAntiguaContrasena.setText("Codigo De Recuperacion\r\n");
		txtAntiguaContrasena.setBounds(527, 180, 239, 42);
		getContentPane().add(txtAntiguaContrasena);
		txtAntiguaContrasena.setColumns(10);

		txtNuevaContrasena = new JTextField();
		txtNuevaContrasena.setForeground(Color.GRAY);
		txtNuevaContrasena.setText("Nueva Contrase\u00F1a1");
		txtNuevaContrasena.setColumns(10);
		txtNuevaContrasena.setBounds(527, 249, 239, 42);
		getContentPane().add(txtNuevaContrasena);

		txtNuevaContrasena_1 = new JTextField();
		txtNuevaContrasena_1.setForeground(Color.GRAY);
		txtNuevaContrasena_1.setText("Nueva Contrase\u00F1a2\r\n");
		txtNuevaContrasena_1.setColumns(10);
		txtNuevaContrasena_1.setBounds(527, 299, 239, 42);
		getContentPane().add(txtNuevaContrasena_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 miControlador.actualizar(12, 13);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(RecuperarContrasena.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(482, 10, 58, 33);
		getContentPane().add(btnNewButton);

		lblNewLabel_1 = new JLabel("Revise su Mail le habr\u00E1, llegado\r\n");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(527, 117, 266, 21);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel(" un codigo de autentificacion");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(535, 143, 218, 21);
		getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(467, 0, 369, 443);
		getContentPane().add(panel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel_1.setIcon(
				new ImageIcon(RecuperarContrasena.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel_1.setBounds(-232, -13, 1586, 456);
		getContentPane().add(lblNewLabel_1);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}