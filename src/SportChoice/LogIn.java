package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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

public class LogIn extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtMail, txtPwd;
	private JPanel panel;
	private JSeparator separator;
	private JButton btnRecuperarContrasena, btnIniciarSesion;
	private JLabel lblErrorLogIn;

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
		separator.setBounds(28, 354, 275, 2);
		panel.add(separator);

		txtMail = new JTextField();
		txtMail.setForeground(Color.GRAY);
		txtMail.setBounds(28, 95, 275, 48);
		panel.add(txtMail);
		String mensajeTxtMail = "Usuario";
		txtMail.setText("Usuario");
		txtMail.setColumns(10);

		JLabel lblNewLabel = new JLabel("Iniciar Sesi\u00F3n\r\n");
		lblNewLabel.setBounds(28, 0, 275, 98);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 46));

		btnRecuperarContrasena = new JButton("Recuperar Contrase\u00F1a\r\n");
		btnRecuperarContrasena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRecuperarContrasena.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRecuperarContrasena.setBounds(28, 323, 275, 21);
		panel.add(btnRecuperarContrasena);
		btnRecuperarContrasena.setBorder(null);
		btnRecuperarContrasena.setForeground(new Color(255, 255, 255));
		btnRecuperarContrasena.setBackground(new Color(57, 62, 70));

		btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n\r\n\r\n");
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciarSesion.setBackground(new Color(53, 187, 95));
		btnIniciarSesion.setBounds(28, 235, 275, 42);
		panel.add(btnIniciarSesion);

		JButton btnRegistro = new JButton("R\u0332e\u0332g\u0332i\u0332s\u0332t\u0332r\u0332o\u0332");
		btnRegistro.setSelected(true);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(7, 14);
			}
		});
		btnRegistro.setBorder(null);
		btnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistro.setForeground(new Color(156, 163, 219));
		btnRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegistro.setBackground(null);
		btnRegistro.setBounds(181, 371, 88, 26);
		panel.add(btnRegistro);

		JLabel lblnoTienesCuenta = new JLabel("\u00BFNo tienes cuenta?\r\n");
		lblnoTienesCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblnoTienesCuenta.setVerticalAlignment(SwingConstants.TOP);
		lblnoTienesCuenta.setForeground(Color.WHITE);
		lblnoTienesCuenta.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblnoTienesCuenta.setBounds(10, 376, 205, 26);
		panel.add(lblnoTienesCuenta);

		txtPwd = new JTextField();
		txtPwd.setForeground(Color.GRAY);
		String mensajeTextField = "Contraseña";
		txtPwd.setText("Contrase\u00F1a");
		txtPwd.setColumns(10);
		txtPwd.setBounds(28, 164, 275, 48);
		panel.add(txtPwd);
		txtMail.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtMail.getText().equals(mensajeTxtMail))
					txtMail.setText("");
				txtMail.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtMail.getText().equals("")) {
					txtMail.setText(mensajeTxtMail);
					txtMail.setForeground(Color.GRAY);
				}
			}
		});
		txtPwd.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPwd.getText().equals(mensajeTextField))
					txtPwd.setText("");
				txtPwd.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtPwd.getText().equals("")) {
					txtPwd.setText(mensajeTextField);
					txtPwd.setForeground(Color.GRAY);
				}
			}
		});
		panel.add(txtPwd);
		txtMail.setText(mensajeTxtMail);
		txtPwd.setText(mensajeTextField);
		txtMail.setForeground(Color.GRAY);
		txtPwd.setForeground(Color.GRAY);

		JButton btnAccederInvitado = new JButton("Acceder como invitado");
		btnAccederInvitado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAccederInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(7, 11);
			}
		});
		btnAccederInvitado.setSelected(true);
		btnAccederInvitado.setForeground(Color.WHITE);
		btnAccederInvitado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAccederInvitado.setBorder(null);
		btnAccederInvitado.setBackground((Color) null);
		btnAccederInvitado.setBounds(84, 292, 168, 21);
		panel.add(btnAccederInvitado);

		lblErrorLogIn = new JLabel("Usuario o contraseña incorrectos");
		lblErrorLogIn.setForeground(Color.RED);
		lblErrorLogIn.setBounds(64, 280, 205, 13);
		panel.add(lblErrorLogIn);
		lblErrorLogIn.setVisible(false);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (miControlador.login(txtMail.getText(), txtPwd.getText()))
					lblErrorLogIn.setVisible(false);
				else
					lblErrorLogIn.setVisible(true);
			}
		});
		btnRecuperarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(7, 13);
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

	public String getUsr() {
		return txtMail.getText();
	}

	public String getPwd() {
		return String.valueOf(txtPwd.getText());
	}

	public void update(String rol) {
		System.out.println("Entrando en update.");
		String resultado = miModelo.getResultado();
		if (resultado.equals("Correcto")) {
			if (rol.equals("admin")) {
				miControlador.actualizar(7, 18);
			} else
				miControlador.actualizar(7, 11);
		} else if (resultado.equals("Incorrecto")) {
			// desplegable de error
		} else {
			System.exit(0);
		}
	}
}
