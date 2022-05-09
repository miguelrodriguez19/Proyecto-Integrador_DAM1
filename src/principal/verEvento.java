package principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.Rectangle;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class verEvento {

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
	private JTextField txtDeportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verEvento window = new verEvento();
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
	public verEvento() {
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
		txtTipoEvento.setBounds(25, 333, 248, 29);
		frame.getContentPane().add(txtTipoEvento);
		txtTipoEvento.setColumns(10);
		
		txtCreadorEvento = new JTextField();
		txtCreadorEvento.setText("NUMERO DE PARTICIPANTES:  14");
		txtCreadorEvento.setBounds(25, 289, 248, 29);
		frame.getContentPane().add(txtCreadorEvento);
		txtCreadorEvento.setColumns(10);
		
		txtFechaEvento = new JTextField();
		txtFechaEvento.setText("FECHA: 30-04-2022");
		txtFechaEvento.setBounds(25, 383, 248, 29);
		frame.getContentPane().add(txtFechaEvento);
		txtFechaEvento.setColumns(10);
		
		txtNombreEvento = new JTextField();
		txtNombreEvento.setText("NOMBRE EVENTO: PARTIDO FUTBOL COLEGAS");
		txtNombreEvento.setBounds(25, 135, 248, 29);
		frame.getContentPane().add(txtNombreEvento);
		txtNombreEvento.setColumns(10);
		
		txtLocalización = new JTextField();
		txtLocalización.setHorizontalAlignment(SwingConstants.CENTER);
		txtLocalización.setText("LOCALIZACI\u00D3N: \r\n C/ CRUZ DE MAYO, 8 \r\n28411 MORALZARZAL\r\n");
		txtLocalización.setColumns(10);
		txtLocalización.setBounds(25, 216, 248, 56);
		frame.getContentPane().add(txtLocalización);
		
		JTextArea txtrDescripcinOrganizamosUn = new JTextArea();
		txtrDescripcinOrganizamosUn.setText("DESCRIPCI\u00D3N: \r\nOrganizamos un partido de futbol unos amigos y yo pero no somos suficientes. Buscamos a 5 personas.\r\nLugar: Polideportivo de Moralzarzal, a las 12:00\r\nAPUNTAROS!\r\n");
		txtrDescripcinOrganizamosUn.setBounds(366, 135, 441, 203);
		frame.getContentPane().add(txtrDescripcinOrganizamosUn);
		
		JButton btnUnirse = new JButton("FORO");
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53, 187, 95));
		btnUnirse.setBounds(650, 361, 157, 51);
		frame.getContentPane().add(btnUnirse);
		
		txtDeportes = new JTextField();
		txtDeportes.setText("DEPORTE: FUTBOL");
		txtDeportes.setBounds(25, 174, 248, 29);
		frame.getContentPane().add(txtDeportes);
		txtDeportes.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("SALIR DEL EVENTO\r\n");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(366, 361, 157, 51);
		frame.getContentPane().add(btnNewButton_2);
	}
}
