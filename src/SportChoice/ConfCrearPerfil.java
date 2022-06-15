package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class ConfCrearPerfil extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtUsername;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblErrorUser;

	/**
	 * Launch the application.
	 */
	public static void ConfCrearPerfil() {
		ConfCrearPerfil window = new ConfCrearPerfil();
		window.setVisible(true);

	}

	public ConfCrearPerfil() {
		setResizable(false);
		Container container = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Configurar perfil");
		container.setLayout(null);

		btnOK = new JButton("CREAR CUENTA");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBorder(null);
		btnOK.setBackground(new Color(156, 163, 219));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.datosRegistro();
				if (miModelo.isUsrEx()) {
					miControlador.actualizar(1, 7);
				} else {
					txtUsername.setForeground(Color.red);
					txtUsername.setBorder(new LineBorder(Color.red));
					lblErrorUser.setVisible(true);
				}
				
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
			}
		});
		
		lblErrorUser = new JLabel("Usuario ya exisitente");
		lblErrorUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblErrorUser.setBackground(null);
		lblErrorUser.setForeground(Color.RED);
		lblErrorUser.setBounds(578, 320, 164, 28);
		getContentPane().add(lblErrorUser);
		lblErrorUser.setVisible(false);
		btnOK.setBounds(537, 363, 239, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		lblContrasea = new JLabel("PERFIL");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(604, 30, 308, 79);
		getContentPane().add(lblContrasea);

		txtUsername = new JTextField();
		txtUsername.setForeground(Color.GRAY);
		String ursName = "@Username";
		txtUsername.setText("@Username");
		txtUsername.setColumns(10);
		txtUsername.setBounds(537, 262, 239, 42);
		getContentPane().add(txtUsername);
		txtUsername.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals(ursName))
					txtUsername.setText("");
				txtUsername.setForeground(Color.BLACK);
				txtUsername.setBorder(null);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().equals("")) {
					txtUsername.setText(ursName);
					txtUsername.setForeground(Color.GRAY);
					txtUsername.setBorder(null);
				}
			}
		});

		panel_1 = new JPanel();
		panel_1.setBounds(588, 99, 116, 103);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(29, 10, 77, 83);
		lblNewLabel_3.setIcon(new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/usuario-de-perfil.png")));
		panel_1.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(1, 14);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(494, 10, 58, 52);
		getContentPane().add(btnNewButton);

		lblNewLabel_2 = new JLabel("IMAGEN POR DEFECTO");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(578, 231, 218, 21);
		getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(477, 0, 359, 443);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("CONFIGURAR");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
				lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(
						new ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 91));
				// lblNewLabel_1.setIcon(new
				// ImageIcon(ConfCrearPerfil.class.getResource("/Imagenes/basketball-sports-court-(1).jpg")));
				lblNewLabel_1.setBounds(-139, -13, 1586, 456);
				getContentPane().add(lblNewLabel_1);
	}

	public String getTxtUsername() {
		return txtUsername.getText();
	}

	public void setTxtUsername(JTextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
