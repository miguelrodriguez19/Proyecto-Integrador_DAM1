package principal;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;

public class Register {

	private JFrame frame;
	private JTextField txtNombre;
	private JButton btnOK;
	private JTextField txtApellidos;
	private JTextField txtMail;
	private JPanel panel;
	private JButton btnNewButton;
	private JTextField txtContrasea;
	private JTextField txtRepiteContrasea;

	/**
	 * Launch the application.
	 */
	public static void Register() {
		Register window = new Register();
		window.frame.setVisible(true);

	}

	public Register() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(520, 268, 154, 13);
		frame.getContentPane().add(lblNewLabel_1);

		txtNombre = new JTextField();
		txtNombre.setText("Nombre");

		txtNombre.setBounds(520, 97, 85, 30);
		container.add(txtNombre);
		txtNombre.setColumns(10);

		btnOK = new JButton("Crear Cuenta\r\n");
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(156, 163, 219));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contraseña es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(520, 349, 275, 53);

		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Regirstro");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 63));
		lblNewLabel.setBounds(520, 0, 275, 98);
		frame.getContentPane().add(lblNewLabel);

		txtApellidos = new JTextField();
		txtApellidos.setText("Apellidos");
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(615, 97, 180, 30);
		frame.getContentPane().add(txtApellidos);

		txtMail = new JTextField();
		txtMail.setText("Mail");
		txtMail.setColumns(10);
		txtMail.setBounds(520, 138, 275, 30);
		frame.getContentPane().add(txtMail);
		
		txtRepiteContrasea = new JTextField();
		txtRepiteContrasea.setText("Repite Contrase\u00F1a");
		txtRepiteContrasea.setColumns(10);
		txtRepiteContrasea.setBounds(520, 228, 275, 30);
		frame.getContentPane().add(txtRepiteContrasea);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contrase\u00F1a");
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(520, 188, 275, 30);
		frame.getContentPane().add(txtContrasea);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "DIA" }));
		comboBox.setBounds(520, 295, 74, 30);
		frame.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "MES" }));
		comboBox_1.setBounds(600, 295, 74, 30);
		frame.getContentPane().add(comboBox_1);

		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "A\u00D1O" }));
		comboBox_1_1.setBounds(684, 295, 111, 30);
		frame.getContentPane().add(comboBox_1_1);

		btnNewButton = new JButton("\u00BFYa tienes Cuenta? Inicia sesion\r\n");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(520, 412, 275, 21);
		frame.getContentPane().add(btnNewButton);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(483, 0, 353, 443);
		frame.getContentPane().add(panel);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(new ImageIcon(Register.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel);

	}
}

/**
 * Initialize the contents of the frame.
 */