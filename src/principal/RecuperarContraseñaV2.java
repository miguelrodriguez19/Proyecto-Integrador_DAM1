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

public class RecuperarContraseñaV2 {

	private JFrame frame;
	private JButton btnOK;
	private JPanel panel;
	private JLabel lblContrasea;
	private JTextField txtAntiguaContrasea;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void RecuperarContraseña() {
		RecuperarContraseñaV2 window = new RecuperarContraseñaV2();
		window.frame.setVisible(true);

	}

	public RecuperarContraseñaV2() {
		frame = new JFrame();
		frame.setResizable(false);
		Container container = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setLayout(null);

		btnOK = new JButton("Confirmar ");
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
		btnOK.setBounds(516, 294, 275, 42);
		container.add(btnOK);

		ButtonGroup group = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("Confirma");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblNewLabel.setBounds(562, -19, 308, 98);
		frame.getContentPane().add(lblNewLabel);

		lblContrasea = new JLabel("tu Mail\r\n");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Trebuchet MS", Font.PLAIN, 36));
		lblContrasea.setBounds(582, 24, 308, 98);
		frame.getContentPane().add(lblContrasea);

		txtAntiguaContrasea = new JTextField();
		txtAntiguaContrasea.setForeground(Color.GRAY);
		txtAntiguaContrasea.setBackground(Color.WHITE);
		txtAntiguaContrasea.setText("Escribe tu mail");
		txtAntiguaContrasea.setBounds(529, 224, 239, 42);
		frame.getContentPane().add(txtAntiguaContrasea);
		txtAntiguaContrasea.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(57, 62, 70));
		btnNewButton.setIcon(new ImageIcon(RecuperarContraseñaV2.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(482, 10, 58, 33);
		frame.getContentPane().add(btnNewButton);

		lblNewLabel_1 = new JLabel("Escriba el Mail de la ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(560, 112, 266, 21);
		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("cuenta que quiera recuperar");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(535, 143, 218, 21);
		frame.getContentPane().add(lblNewLabel_2);

		panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setForeground(Color.WHITE);
		panel.setBounds(468, 0, 368, 443);
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
