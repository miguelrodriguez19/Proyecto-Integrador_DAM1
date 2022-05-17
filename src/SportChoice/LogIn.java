package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LogIn extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtMail, textField;
	private JPanel panel;
	private JSeparator separator;
	private JButton btnRecuperarContrasena, btnIniciarSesion;

	public static void main(String[] args) {
		LogIn window = new LogIn();
		window.setVisible(true);
	}
	
	public static void LogIn() {
		LogIn window = new LogIn();
		window.setVisible(true);
	}

	public LogIn() {
		setResizable(false);
		Container container = getContentPane();
		setBounds(100, 100, 850, 480);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Inicio de sesion");
		container.setLayout(null);

		ButtonGroup group = new ButtonGroup();

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(503, 0, 331, 443);
		getContentPane().add(panel);
		panel.setLayout(null);

		separator = new JSeparator();
		separator.setBounds(28, 298, 275, 2);
		panel.add(separator);

		txtMail = new JTextField();
		txtMail.setForeground(Color.GRAY);
		txtMail.setBounds(28, 79, 275, 48);
		panel.add(txtMail);
		String mensajeTxtMail = "Email o Usuario";
		txtMail.setText(mensajeTxtMail);
		txtMail.setColumns(10);

		JLabel lblNewLabel = new JLabel("Iniciar Sesi\u00F3n\r\n");
		lblNewLabel.setBounds(28, 0, 275, 98);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 46));

		btnRecuperarContrasena = new JButton("Recuperar Contrase\u00F1a\r\n");
		btnRecuperarContrasena.setBounds(23, 266, 275, 21);
		panel.add(btnRecuperarContrasena);
		btnRecuperarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRecuperarContrasena.setBorder(null);
		btnRecuperarContrasena.setForeground(new Color(255, 255, 255));
		btnRecuperarContrasena.setBackground(new Color(57, 62, 70));

		btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n\r\n\r\n");
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciarSesion.setBackground(new Color(53, 187, 95));
		btnIniciarSesion.setBounds(28, 213, 275, 42);
		panel.add(btnIniciarSesion);

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
		String mensajeTextField = "Contraseña";
		textField.setText("Contrase\u00F1a");
		textField.setColumns(10);
		textField.setBounds(28, 149, 275, 48);
		panel.add(textField);
		txtMail.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (txtMail.getText().equals(mensajeTxtMail)) {
					txtMail.setText("");
					txtMail.setForeground(Color.BLACK);
				}
				if (textField.getText().equals("")) {
					textField.setText(mensajeTextField);
					textField.setForeground(Color.GRAY);
				}
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (textField.getText().equals(mensajeTextField)) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
				if (txtMail.getText().equals("")) {
					txtMail.setText(mensajeTxtMail);
					txtMail.setForeground(Color.GRAY);
				}
			}
		});
		panel.add(textField);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMail.setText(mensajeTxtMail);
				textField.setText(mensajeTextField);
				txtMail.setForeground(Color.GRAY);
				textField.setForeground(Color.GRAY);
			}
		});
		btnRecuperarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(new ImageIcon(LogIn.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
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