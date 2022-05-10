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
import javax.swing.SwingConstants;

public class RecuperarContraseña {

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasea;
	private JTextField txtNuevaContrasea;
	private JTextField txtNuevaContrasea_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void RecuperarContraseña() {
		RecuperarContraseña window = new RecuperarContraseña();
		window.frame.setVisible(true);

	}

	public RecuperarContraseña() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);

		btnOK = new JButton("Cambiar Contrase\u00F1a");
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contraseña es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(508, 366, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Recuperar\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(562, -26, 308, 98);
		frame.getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(562, 21, 308, 98);
		frame.getContentPane().add(lblContrasea);

		txtAntiguaContrasea = new JTextField();
		txtAntiguaContrasea.setForeground(Color.GRAY);
		txtAntiguaContrasea.setBackground(Color.WHITE);
		txtAntiguaContrasea.setText("Codigo De Recuperacion\r\n");
		txtAntiguaContrasea.setBounds(527, 180, 239, 42);
		frame.getContentPane().add(txtAntiguaContrasea);
		txtAntiguaContrasea.setColumns(10);

		txtNuevaContrasea = new JTextField();
		txtNuevaContrasea.setForeground(Color.GRAY);
		txtNuevaContrasea.setText("Nueva Contrase\u00F1a1");
		txtNuevaContrasea.setColumns(10);
		txtNuevaContrasea.setBounds(527, 249, 239, 42);
		frame.getContentPane().add(txtNuevaContrasea);

		txtNuevaContrasea_1 = new JTextField();
		txtNuevaContrasea_1.setForeground(Color.GRAY);
		txtNuevaContrasea_1.setText("Nueva Contrase\u00F1a2\r\n");
		txtNuevaContrasea_1.setColumns(10);
		txtNuevaContrasea_1.setBounds(527, 299, 239, 42);
		frame.getContentPane().add(txtNuevaContrasea_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(RecuperarContraseña.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(482, 10, 58, 33);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Revise su Mail le habr\u00E1, llegado\r\n");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(527, 117, 266, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(" un codigo de autentificacion");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(535, 143, 218, 21);
		frame.getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(467, 0, 369, 443);
		frame.getContentPane().add(panel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lugon\\Downloads\\basketball-sports-court- (1).jpg"));
		lblNewLabel_1.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel_1);

	}
}

/**
 * Initialize the contents of the frame.
 */
