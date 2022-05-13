package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConfCrearPerfil extends JFrame{

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtUsername;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void ConfCrearPerfil() {
		ConfCrearPerfil window = new ConfCrearPerfil();
		window.frame.setVisible(true);

	}

	public ConfCrearPerfil() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sport Choice - Configurar perfil");
		container.setLayout(null);

		btnOK = new JButton("Crear Cuenta");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(156, 163, 219));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(521, 363, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		lblContrasea = new JLabel("Perfil\r\n");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(604, 10, 308, 98);
		frame.getContentPane().add(lblContrasea);

		txtUsername = new JTextField();
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setText("@Username\r\n");
		txtUsername.setColumns(10);
		txtUsername.setBounds(537, 262, 239, 42);
		frame.getContentPane().add(txtUsername);

		panel_1 = new JPanel();
		panel_1.setBounds(588, 99, 116, 103);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(27, 10, 64, 71);
		lblNewLabel_3.setIcon(new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/usuario-de-perfil.png")));
		panel_1.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(494, 10, 58, 52);
		frame.getContentPane().add(btnNewButton);

		lblNewLabel_2 = new JLabel("imagen por defecto\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(578, 231, 218, 21);
		frame.getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(477, 0, 359, 443);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Configurar\r\n");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 91));
		//lblNewLabel_1.setIcon(new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/basketball-sports-court-(1).jpg")));
		lblNewLabel_1.setBounds(-139, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel_1);

	}

}
