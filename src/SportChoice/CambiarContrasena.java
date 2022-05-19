package SportChoice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CambiarContrasena extends JFrame{
private Controlador miControlador;
private Modelo miModelo;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblCambiarContrasena;
	private JLabel lblCambiar;
	private JSeparator separator;

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
		
				JButton btnAtras = new JButton("");
				btnAtras.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						miControlador.actualizar(0, 3);
					}
				});
				btnAtras.setBounds(0, 11, 57, 33);
				panel.add(btnAtras);
				btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnAtras.setBorderPainted(false);
				btnAtras.setBackground(new Color(57, 62, 70));
				btnAtras.setIcon(new ImageIcon(CambiarContrasena.class.getResource("/Imagenes/arrow.png")));
				
				JButton btnOK = new JButton("Iniciar Sesión\r\n\r\n");
				btnOK.setForeground(Color.WHITE);
				btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
				btnOK.setBorder(null);
				btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnOK.setBackground(new Color(53, 187, 95));
				btnOK.setBounds(55, 361, 256, 42);
				panel.add(btnOK);
				
				lblCambiarContrasena = new JLabel("\r\nContrasena");
				lblCambiarContrasena.setVerticalAlignment(SwingConstants.TOP);
				lblCambiarContrasena.setHorizontalTextPosition(SwingConstants.CENTER);
				lblCambiarContrasena.setHorizontalAlignment(SwingConstants.CENTER);
				lblCambiarContrasena.setForeground(Color.WHITE);
				lblCambiarContrasena.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
				lblCambiarContrasena.setBounds(55, 68, 256, 55);
				panel.add(lblCambiarContrasena);
				
				textField = new JTextField();
				textField.setText("Contrasena actual");
				textField.setForeground(Color.GRAY);
				textField.setColumns(10);
				textField.setBackground(Color.WHITE);
				textField.setBounds(55, 134, 256, 42);
				panel.add(textField);
				
				textField_1 = new JTextField();
				textField_1.setText("Nueva Contrasena");
				textField_1.setForeground(Color.GRAY);
				textField_1.setColumns(10);
				textField_1.setBounds(55, 221, 256, 42);
				panel.add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setText("Confirmar Contrasena");
				textField_2.setForeground(Color.GRAY);
				textField_2.setColumns(10);
				textField_2.setBounds(55, 274, 256, 42);
				panel.add(textField_2);
				
				lblCambiar = new JLabel("Cambiar\r\n");
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

	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
