package SportChoice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class CambiarContrasena extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPasswordField txtContrasenaActual, txtNuevaContrasena, txtConfirmarNuevaContrasena;
	private JLabel lblCambiarContrasena;
	private JLabel lblCambiar, lblNuevaContrasenaPlaceHolder, lblContrasenaActualPlaceHolder, lblConfirmarNuevaContrasenaPlaceHolder;
	private JSeparator separator;
	private JButton btnAtras;
	private JButton btnIniciarSesion;
	String mensajeTxtContrasenaActual, mensajeTxtNuevaContrasena, mensajeTxtConfirmarNuevaContrasena;
	private JLabel lblTextoError;
	private JLabel lblTextoError2;

	public static void CambiarContrasena() {
		CambiarContrasena window = new CambiarContrasena();
		window.setVisible(true);
	}

	public CambiarContrasena() {
		setResizable(false);
		Container container = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Cambiar contrasena");
		container.setLayout(null);

		ButtonGroup group = new ButtonGroup();

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(479, 0, 357, 443);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(0, 3);
			}
		});
		btnAtras.setBounds(10, 25, 57, 33);
		panel.add(btnAtras);
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setBorderPainted(false);
		btnAtras.setBackground(new Color(57, 62, 70));
		btnAtras.setIcon(new ImageIcon(CambiarContrasena.class.getResource("/Imagenes/arrow.png")));

		btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciarSesion.setBorder(null);
		btnIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarSesion.setBackground(new Color(53, 187, 95));
		btnIniciarSesion.setBounds(55, 361, 256, 42);
		panel.add(btnIniciarSesion);

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.cambioContrasena();
			}
		});

		lblCambiarContrasena = new JLabel("CONTRASE\u00D1A");
		lblCambiarContrasena.setVerticalAlignment(SwingConstants.TOP);
		lblCambiarContrasena.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCambiarContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiarContrasena.setForeground(Color.WHITE);
		lblCambiarContrasena.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblCambiarContrasena.setBounds(55, 68, 256, 55);
		panel.add(lblCambiarContrasena);
		
		lblContrasenaActualPlaceHolder = new JLabel("Contrasena actual");
		lblContrasenaActualPlaceHolder.setBounds(56, 134, 256, 42);
		panel.add(lblContrasenaActualPlaceHolder);
		lblContrasenaActualPlaceHolder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblContrasenaActualPlaceHolder.setForeground(Color.GRAY);
		
		txtContrasenaActual = new JPasswordField();
		txtContrasenaActual.setText("");
		txtContrasenaActual.setForeground(Color.GRAY);
		txtContrasenaActual.setColumns(10);
		txtContrasenaActual.setBackground(Color.WHITE);
		txtContrasenaActual.setBounds(55, 134, 256, 42);
		panel.add(txtContrasenaActual);
		
		lblNuevaContrasenaPlaceHolder = new JLabel("Nueva Contrasena");
		lblNuevaContrasenaPlaceHolder.setBounds(56, 221, 256, 42);
		panel.add(lblNuevaContrasenaPlaceHolder);
		lblNuevaContrasenaPlaceHolder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNuevaContrasenaPlaceHolder.setForeground(Color.GRAY);
		
		txtNuevaContrasena = new JPasswordField();
		txtNuevaContrasena.setText("");
		txtNuevaContrasena.setForeground(Color.GRAY);
		txtNuevaContrasena.setColumns(10);
		txtNuevaContrasena.setBounds(56, 221, 256, 42);
		panel.add(txtNuevaContrasena);

		lblConfirmarNuevaContrasenaPlaceHolder = new JLabel("Confirmar Contrasena");
		lblConfirmarNuevaContrasenaPlaceHolder.setBounds(55, 274, 256, 42);
		panel.add(lblConfirmarNuevaContrasenaPlaceHolder);
		lblConfirmarNuevaContrasenaPlaceHolder.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblConfirmarNuevaContrasenaPlaceHolder.setForeground(Color.GRAY);
		
		txtConfirmarNuevaContrasena = new JPasswordField();
		txtConfirmarNuevaContrasena.setText("");
		txtConfirmarNuevaContrasena.setForeground(Color.GRAY);
		txtConfirmarNuevaContrasena.setColumns(10);
		txtConfirmarNuevaContrasena.setBounds(55, 274, 256, 42);
		panel.add(txtConfirmarNuevaContrasena);

		lblCambiar = new JLabel("CAMBIAR");
		lblCambiar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCambiar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiar.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCambiar.setForeground(Color.WHITE);
		lblCambiar.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblCambiar.setBounds(55, 11, 256, 55);
		panel.add(lblCambiar);

		separator = new JSeparator();
		separator.setBounds(55, 196, 255, 2);
		panel.add(separator);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(
				new ImageIcon(CambiarContrasena.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		getContentPane().add(lblNewLabel);
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblTextoError = new JLabel("");
		lblTextoError.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextoError.setForeground(Color.RED);
		lblTextoError.setBounds(55, 324, 256, 18);
		panel.add(lblTextoError);
		
		lblTextoError2 = new JLabel("");
		lblTextoError2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTextoError2.setForeground(Color.RED);
		lblTextoError2.setBounds(55, 341, 256, 14);
		panel.add(lblTextoError2);

		txtContrasenaActual.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (String.valueOf(txtContrasenaActual.getPassword()).equals(""))
					lblContrasenaActualPlaceHolder.setVisible(false);
				txtContrasenaActual.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (String.valueOf(txtContrasenaActual.getPassword()).equals("")) {
					lblContrasenaActualPlaceHolder.setVisible(true);
				}
			}
		});

		txtNuevaContrasena.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (String.valueOf(txtNuevaContrasena.getPassword()).equals(""))
					lblNuevaContrasenaPlaceHolder.setVisible(false);
				txtNuevaContrasena.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (String.valueOf(txtNuevaContrasena.getPassword()).equals("")) {
					lblNuevaContrasenaPlaceHolder.setVisible(true);
				}
			}
		});
		
		txtConfirmarNuevaContrasena.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (String.valueOf(txtConfirmarNuevaContrasena.getPassword()).equals(""))
					lblConfirmarNuevaContrasenaPlaceHolder.setVisible(false);
				txtConfirmarNuevaContrasena.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (String.valueOf(txtConfirmarNuevaContrasena.getPassword()).equals("")) {
					lblConfirmarNuevaContrasenaPlaceHolder.setVisible(true);
				}
			}
		});

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String getTxtContrasenaActual() {
		return String.valueOf(txtContrasenaActual.getPassword());
	}

	public String getTxtNuevaContrasena() {
		return String.valueOf(txtNuevaContrasena.getPassword());
	}

	public String getTxtConfirmarNuevaContrasena() {
		return String.valueOf(txtConfirmarNuevaContrasena.getPassword());
	}

	public void errorContrasenaIncorrecta() {
		// La contraseña antigua introducida no coincide con la de la bd
		lblTextoError.setText("La contraseña antigua introducida");
		lblTextoError2.setText("no es la correcta!");
	}

	public void errorContrasenasDistintas() {
		// Las dos contraseñas introducidas son distintas 
		lblTextoError.setText("Las dos contraseñas nuevas introducidas");
		lblTextoError2.setText("no son iguales!");
	}

	public void cambioContrasenaExitoso() {
		// La contraseña se ha cambiado y se redirige al usuario a inciar sesión
		vaciarCamposYMostrarPlaceHolders();
		miControlador.actualizar(0, 7);
	}
	
	public void vaciarCamposYMostrarPlaceHolders() {
		txtContrasenaActual.setText("");
		txtNuevaContrasena.setText("");
		txtConfirmarNuevaContrasena.setText("");
		lblContrasenaActualPlaceHolder.setVisible(true);
		lblNuevaContrasenaPlaceHolder.setVisible(true);
		lblConfirmarNuevaContrasenaPlaceHolder.setVisible(true);
		lblTextoError.setText("");
		lblTextoError2.setText("");
	}
}
