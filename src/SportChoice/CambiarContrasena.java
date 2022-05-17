package SportChoice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CambiarContrasena extends JFrame{
private Controlador miControlador;
private Modelo miModelo;

	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasena;
	private JTextField txtNuevaContrasena;
	private JTextField txtNuevaContrasena_1;

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

		btnOK = new JButton("Iniciar Sesi\u00F3n\r\n\r\n");
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contraseï¿½a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(508, 366, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Cambiar\r\n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(578, -26, 308, 98);
		getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(562, 21, 308, 98);
		getContentPane().add(lblContrasea);

		txtAntiguaContrasena = new JTextField();
		txtAntiguaContrasena.setForeground(Color.GRAY);
		txtAntiguaContrasena.setBackground(Color.WHITE);
		txtAntiguaContrasena.setText("Antigua Contrase\u00F1a");
		txtAntiguaContrasena.setBounds(527, 140, 239, 42);
		getContentPane().add(txtAntiguaContrasena);
		txtAntiguaContrasena.setColumns(10);

		txtNuevaContrasena = new JTextField();
		txtNuevaContrasena.setForeground(Color.GRAY);
		txtNuevaContrasena.setText("Nueva Contrase\u00F1a1");
		txtNuevaContrasena.setColumns(10);
		txtNuevaContrasena.setBounds(527, 222, 239, 42);
		getContentPane().add(txtNuevaContrasena);

		txtNuevaContrasena_1 = new JTextField();
		txtNuevaContrasena_1.setForeground(Color.GRAY);
		txtNuevaContrasena_1.setText("Nueva Contrase\u00F1a2\r\n");
		txtNuevaContrasena_1.setColumns(10);
		txtNuevaContrasena_1.setBounds(527, 274, 239, 42);
		getContentPane().add(txtNuevaContrasena_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(CambiarContrasena.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(494, 10, 58, 33);
		getContentPane().add(btnNewButton);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(479, 0, 357, 443);
		getContentPane().add(panel);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(
				new ImageIcon(CambiarContrasena.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
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
