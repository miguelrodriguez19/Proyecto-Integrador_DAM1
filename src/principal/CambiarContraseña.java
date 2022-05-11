package principal;

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

public class CambiarContraseña {

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasea;
	private JTextField txtNuevaContrasea;
	private JTextField txtNuevaContrasea_1;

	/**
	 * Launch the application.
	 */
	public static void CambiarContraseña() {
		CambiarContraseña window = new CambiarContraseña();
		window.frame.setVisible(true);

	}

	public CambiarContraseña() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
//				System.out.println("La Contraseña es " + String.valueOf(passwordField.getPassword()));
			}
		});
		btnOK.setBounds(508, 366, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Cambiar\r\n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(578, -26, 308, 98);
		frame.getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(562, 21, 308, 98);
		frame.getContentPane().add(lblContrasea);

		txtAntiguaContrasea = new JTextField();
		txtAntiguaContrasea.setForeground(Color.GRAY);
		txtAntiguaContrasea.setBackground(Color.WHITE);
		txtAntiguaContrasea.setText("Antigua Contrase\u00F1a");
		txtAntiguaContrasea.setBounds(527, 140, 239, 42);
		frame.getContentPane().add(txtAntiguaContrasea);
		txtAntiguaContrasea.setColumns(10);

		txtNuevaContrasea = new JTextField();
		txtNuevaContrasea.setForeground(Color.GRAY);
		txtNuevaContrasea.setText("Nueva Contrase\u00F1a1");
		txtNuevaContrasea.setColumns(10);
		txtNuevaContrasea.setBounds(527, 222, 239, 42);
		frame.getContentPane().add(txtNuevaContrasea);

		txtNuevaContrasea_1 = new JTextField();
		txtNuevaContrasea_1.setForeground(Color.GRAY);
		txtNuevaContrasea_1.setText("Nueva Contrase\u00F1a2\r\n");
		txtNuevaContrasea_1.setColumns(10);
		txtNuevaContrasea_1.setBounds(527, 274, 239, 42);
		frame.getContentPane().add(txtNuevaContrasea_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(CambiarContraseña.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(494, 10, 58, 33);
		frame.getContentPane().add(btnNewButton);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(479, 0, 357, 443);
		frame.getContentPane().add(panel);

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 91));
		lblNewLabel.setIcon(
				new ImageIcon(CambiarContraseña.class.getResource("/Imagenes/basketball-sports-court- (1).jpg")));
		lblNewLabel.setBounds(-232, -13, 1586, 456);
		frame.getContentPane().add(lblNewLabel);

	}
}

/**
 * Initialize the contents of the frame.
 */