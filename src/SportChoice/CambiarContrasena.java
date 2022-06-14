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
	private JTextField txtContrasenaActual;
	private JTextField txtNuevaContrasena;
	private JTextField txtConfirmarNuevaContrasena;
	private JLabel lblCambiarContrasena;
	private JLabel lblCambiar;
	private JSeparator separator;
	private JButton btnAtras;
	private JButton btnIniciarSesion;
	String mensajeTxtContrasenaActual, mensajeTxtNuevaContrasena, mensajeTxtConfirmarNuevaContrasena;

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
//				miControlador.validarCambioContraseña();
				miControlador.actualizar(0, 7);
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
		
		mensajeTxtContrasenaActual = "Contrasena actual";
		txtContrasenaActual = new JTextField();
		txtContrasenaActual.setText(mensajeTxtContrasenaActual);
		txtContrasenaActual.setForeground(Color.GRAY);
		txtContrasenaActual.setColumns(10);
		txtContrasenaActual.setBackground(Color.WHITE);
		txtContrasenaActual.setBounds(55, 134, 256, 42);
		panel.add(txtContrasenaActual);

		txtNuevaContrasena = new JTextField();
		txtNuevaContrasena.setText("Nueva Contrasena");
		txtNuevaContrasena.setForeground(Color.GRAY);
		txtNuevaContrasena.setColumns(10);
		txtNuevaContrasena.setBounds(55, 221, 256, 42);
		panel.add(txtNuevaContrasena);

		txtConfirmarNuevaContrasena = new JTextField();
		txtConfirmarNuevaContrasena.setText("Confirmar Contrasena");
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
		
		txtContrasenaActual.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtContrasenaActual.getText().equals(""))
					txtContrasenaActual.setText("");
				txtContrasenaActual.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtContrasenaActual.getText().equals(mensajeTxtContrasenaActual)) {
					txtContrasenaActual.setText(mensajeTxtContrasenaActual);
					txtContrasenaActual.setForeground(Color.GRAY);
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
}
