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
import javax.swing.ImageIcon;

public class ConfCrearPerfil {

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtUsername;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ConfCrearPerfil window = new ConfCrearPerfil();
		window.frame.setVisible(true);

	}

	public ConfCrearPerfil() {
		frame = new JFrame();
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);

		btnOK = new JButton("Crear Cuenta");
		btnOK.setForeground(Color.BLACK);
		btnOK.setBackground(new Color(156, 163, 219));
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(txtNombre.getText());
//				comboBox.addItem(txtNombre.getText());
//				System.out.println(chckbxNewCheckBox.isSelected());
//				System.out.println("La Contraseña es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(521, 363, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Configurar\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(578, -26, 308, 98);
		frame.getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("Perfil\r\n");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(604, 10, 308, 98);
		frame.getContentPane().add(lblContrasea);

		txtUsername = new JTextField();
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setText("@Username\r\n");
		txtUsername.setColumns(10);
		txtUsername.setBounds(537, 262, 239, 42);
		frame.getContentPane().add(txtUsername);

		JButton btnNewButton = new JButton("<-");
		btnNewButton.setBounds(494, 10, 58, 21);
		frame.getContentPane().add(btnNewButton);

		lblNewLabel_2 = new JLabel("imagen por defecto\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(578, 231, 218, 21);
		frame.getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(485, 0, 351, 443);
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
