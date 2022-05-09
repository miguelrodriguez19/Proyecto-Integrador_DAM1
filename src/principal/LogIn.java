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
import javax.swing.SwingConstants;

public class LogIn {

	private JFrame frame;
	private JButton btnOK;
	private JTextField txtMail;
	private JPasswordField passwordField_1;
	private JPanel panel;
	private JButton btnNewButton;
	private JPanel panel_1;
	private JButton btnOK_1;
	private JLabel lblnoTienesCuenta;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		LogIn window = new LogIn();
		window.frame.setVisible(true);

	}

	public LogIn() {
		frame = new JFrame();
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);

		btnOK = new JButton("Iniciar Sesi\u00F3n\r\n\r\n");
		btnOK.setForeground(Color.BLACK);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contraseña es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(520, 218, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Iniciar Sesi\u00F3n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 46));
		lblNewLabel.setBounds(520, 0, 275, 98);
		frame.getContentPane().add(lblNewLabel);

		txtMail = new JTextField();
		txtMail.setText("Mail/Usuario\r\n");
		txtMail.setColumns(10);
		txtMail.setBounds(520, 108, 275, 48);
		frame.getContentPane().add(txtMail);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(520, 166, 275, 42);
		frame.getContentPane().add(passwordField_1);

		btnNewButton = new JButton("Recuperar Contrase\u00F1a\r\n");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(520, 273, 275, 21);
		frame.getContentPane().add(btnNewButton);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 484, 443);
		frame.getContentPane().add(panel_1);
		
		btnOK_1 = new JButton("Crear Cuenta\r\n");
		btnOK_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOK_1.setForeground(Color.BLACK);
		btnOK_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnOK_1.setBackground(new Color(156, 163, 219));
		btnOK_1.setBounds(520, 376, 275, 42);
		frame.getContentPane().add(btnOK_1);
		
		lblnoTienesCuenta = new JLabel("\u00BFNo tienes cuenta?\r\n");
		lblnoTienesCuenta.setVerticalAlignment(SwingConstants.TOP);
		lblnoTienesCuenta.setForeground(Color.WHITE);
		lblnoTienesCuenta.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblnoTienesCuenta.setBounds(543, 344, 283, 65);
		frame.getContentPane().add(lblnoTienesCuenta);
				
				lblNewLabel_1 = new JLabel("- O -");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblNewLabel_1.setBounds(624, 313, 74, 21);
				frame.getContentPane().add(lblNewLabel_1);
		
				panel = new JPanel();
				panel.setBackground(new Color(57, 62, 70));
				panel.setForeground(Color.WHITE);
				panel.setBounds(480, 0, 356, 443);
				frame.getContentPane().add(panel);

	}
}

/**
 * Initialize the contents of the frame.
 */