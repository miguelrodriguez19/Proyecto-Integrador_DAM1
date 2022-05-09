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
		txtNombre.setBounds(40, 138, 261, 19);
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
		btnCrear.setBounds(720, 383, 93, 40);
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
		list.setBounds(40, 166, 261, 75);
		frame.getContentPane().add(list);
		
		txtArea = new JTextArea();
		txtArea.setText("DESCRIPCI\u00D3N:");
		txtArea.setBounds(387, 135, 426, 229);
		frame.getContentPane().add(txtArea);
		
		txtLocalización = new JTextField();
		txtLocalización.setText("LOCALIZACI\u00D3N:");
		txtLocalización.setBounds(40, 267, 261, 21);
		frame.getContentPane().add(txtLocalización);
		txtLocalización.setColumns(10);
		
		txtParticipantes = new JTextField();
		txtParticipantes.setText("NUMERO PARTICIPANTES:");
		txtParticipantes.setBounds(40, 311, 261, 19);
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
		
		JButton btnFlechaAtras = new JButton("ATRAS");
		btnFlechaAtras.setBounds(40, 104, 74, 21);
		frame.getContentPane().add(btnFlechaAtras);
		
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
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(766, 43, 45, 21);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(39, 43, 45, 21);
		panel.add(btnNewButton_1);
	}
}
