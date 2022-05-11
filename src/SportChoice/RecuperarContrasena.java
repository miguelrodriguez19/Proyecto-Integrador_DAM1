package SportChoice;

import java.awt.Container;
import java.awt.Cursor;

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

public class RecuperarContrasena {

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasena;
	private JTextField txtNuevaContrasena;
	private JTextField txtNuevaContrasena_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void RecuperarContrasena() {
		RecuperarContrasena window = new RecuperarContrasena();
		window.frame.setVisible(true);

	}

	public RecuperarContrasena() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);

		btnOK = new JButton("Cambiar Contrase\u00F1a");
		btnOK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOK.setForeground(Color.WHITE);
		btnOK.setBackground(new Color(53, 187, 95));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contrase�a es " + String.valueOf(passwordField.getPassword()));
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

		txtAntiguaContrasena = new JTextField();
		txtAntiguaContrasena.setForeground(Color.GRAY);
		txtAntiguaContrasena.setBackground(Color.WHITE);
		txtAntiguaContrasena.setText("Codigo De Recuperacion\r\n");
		txtAntiguaContrasena.setBounds(527, 180, 239, 42);
		frame.getContentPane().add(txtAntiguaContrasena);
		txtAntiguaContrasena.setColumns(10);

		txtNuevaContrasena = new JTextField();
		txtNuevaContrasena.setForeground(Color.GRAY);
		txtNuevaContrasena.setText("Nueva Contrase\u00F1a1");
		txtNuevaContrasena.setColumns(10);
		txtNuevaContrasena.setBounds(527, 249, 239, 42);
		frame.getContentPane().add(txtNuevaContrasena);

		txtNuevaContrasena_1 = new JTextField();
		txtNuevaContrasena_1.setForeground(Color.GRAY);
		txtNuevaContrasena_1.setText("Nueva Contrase\u00F1a2\r\n");
		txtNuevaContrasena_1.setColumns(10);
		txtNuevaContrasena_1.setBounds(527, 299, 239, 42);
		frame.getContentPane().add(txtNuevaContrasena_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(RecuperarContrasena.class.getResource("/Imagenes/arrow.png")));
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
		lblNewLabel_1.setIcon(
				new ImageIcon(RecuperarContrasena.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel_1.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel_1);

	}
}