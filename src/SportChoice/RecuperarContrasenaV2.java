package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RecuperarContrasenaV2 {

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasena;
	private JLabel lblNewLabel_1,lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void RecuperarContrasena() {
		RecuperarContrasenaV2 window = new RecuperarContrasenaV2();
		window.frame.setVisible(true);

	}

	public RecuperarContrasenaV2() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sport Choice - Confirmar e-mail");
		container.setLayout(null);

		btnOK = new JButton("Confirmar ");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(516, 294, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Confirma");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(562, -19, 308, 98);
		frame.getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("tu Mail\r\n");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(582, 24, 308, 98);
		frame.getContentPane().add(lblContrasea);

		txtAntiguaContrasena = new JTextField();
		txtAntiguaContrasena.setForeground(Color.GRAY);
		txtAntiguaContrasena.setBackground(Color.WHITE);
		txtAntiguaContrasena.setText("Escribe tu mail");
		txtAntiguaContrasena.setBounds(529, 224, 239, 42);
		frame.getContentPane().add(txtAntiguaContrasena);
		txtAntiguaContrasena.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(RecuperarContrasenaV2.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(482, 10, 58, 33);
		frame.getContentPane().add(btnNewButton);

		lblNewLabel_1 = new JLabel("Escriba el Mail de la ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(560, 112, 266, 21);
		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("cuenta que quiera recuperar");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(535, 143, 218, 21);
		frame.getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(468, 0, 368, 443);
		frame.getContentPane().add(panel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel_1.setIcon(
				new ImageIcon(RecuperarContrasenaV2.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel_1.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel_1);

	}
}