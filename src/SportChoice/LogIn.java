package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LogIn {

	private JFrame frame;
	private JTextField txtMail, textField;
	private JPanel panel;
	private JSeparator separator;
	private JButton btnNewButton, btnOK;

	public static void LogIn() {
		LogIn window = new LogIn();
		window.frame.setVisible(true);

	}

	public LogIn() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sport Choice - Inicio de sesion");
		container.setLayout(null);

		ButtonGroup group = new ButtonGroup();

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(503, 0, 331, 443);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		separator = new JSeparator();
		separator.setBounds(28, 298, 275, 2);
		panel.add(separator);

		txtMail = new JTextField();
		txtMail.setForeground(Color.GRAY);
		txtMail.setBounds(28, 79, 275, 48);
		panel.add(txtMail);
		txtMail.setText("Email o Usuario");
		txtMail.setColumns(10);

		JLabel lblNewLabel = new JLabel("Iniciar Sesi\u00F3n\r\n");
		lblNewLabel.setBounds(28, 0, 275, 98);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 46));

		btnNewButton = new JButton("Recuperar Contrase\u00F1a\r\n");
		btnNewButton.setBounds(23, 266, 275, 21);
		panel.add(btnNewButton);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(57, 62, 70));

		btnOK = new JButton("Iniciar Sesi\u00F3n\r\n\r\n");
		btnOK.setBorder(null);
		btnOK.setForeground(Color.WHITE);
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setBounds(28, 213, 275, 42);
		panel.add(btnOK);

		JButton btnOK_1 = new JButton("Crear Cuenta\r\n");
		btnOK_1.setBorder(null);
		btnOK_1.setForeground(Color.WHITE);
		btnOK_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK_1.setBackground(new Color(156, 163, 219));
		btnOK_1.setBounds(28, 351, 275, 42);
		panel.add(btnOK_1);

		JLabel lblnoTienesCuenta = new JLabel("\u00BFNo tienes cuenta?\r\n");
		lblnoTienesCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblnoTienesCuenta.setVerticalAlignment(SwingConstants.TOP);
		lblnoTienesCuenta.setForeground(Color.WHITE);
		lblnoTienesCuenta.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblnoTienesCuenta.setBounds(28, 316, 275, 35);
		panel.add(lblnoTienesCuenta);

		textField = new JTextField();
		textField.setForeground(Color.GRAY);
		textField.setText("Contrase\u00F1a");
		textField.setColumns(10);
		textField.setBounds(28, 149, 275, 48);
		panel.add(textField);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(new ImageIcon(LogIn.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel);

	}
}