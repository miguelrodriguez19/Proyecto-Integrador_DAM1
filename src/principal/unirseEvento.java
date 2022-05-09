package principal;

import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Rectangle;

public class unirseEvento {

	private JFrame frame;
	private JLabel lblFaqs;
	private JLabel lblPerfil;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField txtTipoEvento;
	private JTextField txtCreadorEvento;
	private JTextField txtFechaEvento;
	private JTextField txtNombreEvento;
	private JTextField txtLocalización;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					unirseEvento window = new unirseEvento();
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
	public unirseEvento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34,40,49));
		Container contenedor = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contenedor.setLayout(null);
		
		JButton btnFlechaAtras = new JButton("ATRAS");
		btnFlechaAtras.setBounds(25, 104, 74, 21);
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
		btnNewButton.setBounds(751, 43, 45, 21);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(26, 43, 45, 21);
		panel.add(btnNewButton_1);
		
		txtTipoEvento = new JTextField();
		txtTipoEvento.setText("TIPO EVENTO:\r\n\r\nPUBLICO");
		txtTipoEvento.setBounds(25, 282, 165, 29);
		frame.getContentPane().add(txtTipoEvento);
		txtTipoEvento.setColumns(10);
		
		txtCreadorEvento = new JTextField();
		txtCreadorEvento.setText("CREADOR EVENTO: JUANITO23");
		txtCreadorEvento.setBounds(25, 332, 165, 29);
		frame.getContentPane().add(txtCreadorEvento);
		txtCreadorEvento.setColumns(10);
		
		txtFechaEvento = new JTextField();
		txtFechaEvento.setText("FECHA: 30-04-2022");
		txtFechaEvento.setBounds(25, 383, 165, 29);
		frame.getContentPane().add(txtFechaEvento);
		txtFechaEvento.setColumns(10);
		
		txtNombreEvento = new JTextField();
		txtNombreEvento.setText("NOMBRE EVENTO: PARTIDO FUTBOL COLEGAS");
		txtNombreEvento.setBounds(283, 135, 366, 29);
		frame.getContentPane().add(txtNombreEvento);
		txtNombreEvento.setColumns(10);
		
		txtLocalización = new JTextField();
		txtLocalización.setText("LOCALIZACI\u00D3N: \r\n C/ CRUZ DE MAYO, 8 \r\n28411 MORALZARZAL\r\n");
		txtLocalización.setColumns(10);
		txtLocalización.setBounds(283, 178, 366, 29);
		frame.getContentPane().add(txtLocalización);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setToolTipText("1\r\n2\r\n3\r\n");
		scrollBar.setBounds(618, 223, 29, 68);
		frame.getContentPane().add(scrollBar);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"PARTICIPANTES:", "JUANITO23", "LUISP8", "OSCAR99", "JOSE.LOP", "MARCOS005"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(283, 223, 366, 68);
		frame.getContentPane().add(list);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(628, 309, 23, 103);
		frame.getContentPane().add(scrollBar_1);
		
		JTextArea txtrDescripcinOrganizamosUn = new JTextArea();
		txtrDescripcinOrganizamosUn.setText("DESCRIPCI\u00D3N: \r\nOrganizamos un partido de futbol unos amigos y yo pero no somos suficientes. Buscamos a 5 personas.\r\nLugar: Polideportivo de Moralzarzal, a las 12:00\r\nAPUNTAROS!\r\n");
		txtrDescripcinOrganizamosUn.setBounds(283, 309, 366, 103);
		frame.getContentPane().add(txtrDescripcinOrganizamosUn);
		
		JButton btnUnirse = new JButton("UNIRSE");
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53,187,95));
		btnUnirse.setBounds(687, 370, 120, 38);
		frame.getContentPane().add(btnUnirse);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(25, 123, 157, 149);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setMaximumSize(new Dimension(10, 10));
		lblNewLabel.setIconTextGap(2);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nacho\\OneDrive\\Escritorio\\icons8-soccer-ball-100.png"));
	}
}
