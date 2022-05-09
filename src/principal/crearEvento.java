package principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


public class crearEvento {

	private JFrame frame;
	private JTextField txtNombre;
	private JButton btnCrear;
	private JTextArea txtArea;
	private JTextField txtLocalización;
	private JTextField txtParticipantes;
	private JTextField txtFechaEvento;
	private JList list;
	private JLabel lblFaqs;
	private JLabel lblPerfil;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearEvento window = new crearEvento();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public crearEvento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setBackground(new Color(34,40,49));
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contenedor.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setText("NOMBRE EVENTO:\r\n");
		txtNombre.setBounds(40, 153, 261, 23);
		txtNombre.setColumns(10);
		contenedor.add(txtNombre);
		
		btnCrear = new JButton("CREAR");
		btnCrear.setBorder(null);
		btnCrear.setBackground(new Color(53,187,95));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Imprime por consola el valor introducido en el campo de nombre
				System.out.println(txtNombre.getText());
			}
		});
		btnCrear.setBounds(700, 374, 113, 40);
		contenedor.add(btnCrear);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(144, -8, -41, 25);
		frame.getContentPane().add(panel_1);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"DEPORTE:", "FUTBOL", "PADEL", "BALONCESTO", "TENIS"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(40, 190, 261, 75);
		frame.getContentPane().add(list);
		
		txtArea = new JTextArea();
		txtArea.setText("DESCRIPCI\u00D3N:");
		txtArea.setBounds(386, 152, 426, 193);
		frame.getContentPane().add(txtArea);
		
		txtLocalización = new JTextField();
		txtLocalización.setText("LOCALIZACI\u00D3N:");
		txtLocalización.setBounds(40, 280, 261, 25);
		frame.getContentPane().add(txtLocalización);
		txtLocalización.setColumns(10);
		
		txtParticipantes = new JTextField();
		txtParticipantes.setText("NUMERO PARTICIPANTES:");
		txtParticipantes.setBounds(40, 320, 261, 25);
		frame.getContentPane().add(txtParticipantes);
		txtParticipantes.setColumns(10);
		
		JLabel lblTipoEvento = new JLabel("TIPO EVENTO");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setBounds(41, 351, 93, 13);
		frame.getContentPane().add(lblTipoEvento);
		
		JRadioButton rdbtnPublico = new JRadioButton("PUBLICO");
		rdbtnPublico.setBounds(39, 370, 106, 21);
		frame.getContentPane().add(rdbtnPublico);
		
		JRadioButton rdbtnPrivado = new JRadioButton("PRIVADO");
		rdbtnPrivado.setBounds(40, 393, 105, 21);
		frame.getContentPane().add(rdbtnPrivado);
		
		JLabel lblFecha = new JLabel("FECHA EVENTO");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setBounds(198, 351, 82, 13);
		frame.getContentPane().add(lblFecha);
		
		txtFechaEvento = new JTextField();
		txtFechaEvento.setBounds(180, 370, 121, 43);
		frame.getContentPane().add(txtFechaEvento);
		txtFechaEvento.setColumns(10);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblFaqs = new JLabel("FAQS");
		lblFaqs.setForeground(Color.WHITE);
		lblFaqs.setBounds(576, 47, 45, 13);
		panel.add(lblFaqs);
		
		lblPerfil = new JLabel("PERFIL");
		lblPerfil.setForeground(Color.WHITE);
		lblPerfil.setBounds(665, 47, 55, 13);
		panel.add(lblPerfil);
		
		btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(null);
		btnNewButton.setBorder(null);
		btnNewButton.setToolTipText("");
		btnNewButton.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/home-48.png")));
		btnNewButton.setBounds(36, 18, 85, 70);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_1.setBounds(726, 18, 85, 70);
		btnNewButton_1.setBackground(null);
		btnNewButton_1.setBorder(null);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(null);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Nacho\\OneDrive\\Escritorio\\usuario-de-perfil.png"));
		btnNewButton_1.setBorder(null);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(null);
		btnNewButton_2.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/arrow.png")));
		btnNewButton_2.setBounds(0, 106, 94, 37);
		frame.getContentPane().add(btnNewButton_2);
	}
}
