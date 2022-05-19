package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConfirmarMail extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasena;
	private JLabel lblNewLabel_1,lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void RecuperarContrasena() {
		ConfirmarMail window = new ConfirmarMail();
		window.setVisible(true);

	}

	public ConfirmarMail() {
		setResizable(false);
		Container container = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Confirmar e-mail");
		container.setLayout(null);

		btnOK = new JButton("Confirmar ");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 miControlador.actualizar(13, 12);
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(529, 294, 239, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Confirma");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(562, -19, 308, 98);
		getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("tu Mail\r\n");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(582, 24, 308, 98);
		getContentPane().add(lblContrasea);

		txtAntiguaContrasena = new JTextField();
		txtAntiguaContrasena.setForeground(Color.GRAY);
		txtAntiguaContrasena.setBackground(Color.WHITE);
		txtAntiguaContrasena.setText("Escribe tu mail");
		txtAntiguaContrasena.setBounds(529, 224, 239, 42);
		getContentPane().add(txtAntiguaContrasena);
		txtAntiguaContrasena.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 miControlador.actualizar(13, 7);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(ConfirmarMail.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(482, 10, 58, 33);
		getContentPane().add(btnNewButton);

		lblNewLabel_1 = new JLabel("Escriba el Mail de la ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(560, 112, 266, 21);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("cuenta que quiera recuperar");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(535, 143, 218, 21);
		getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(468, 0, 368, 443);
		getContentPane().add(panel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel_1.setIcon(
				new ImageIcon(ConfirmarMail.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
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