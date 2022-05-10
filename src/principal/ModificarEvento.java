package principal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ModificarEvento {

	private JFrame frame;
	private JButton btnPerfil;
	private JButton btnFaqs;
	private JButton btnHome;
	private JTextField txtFechaEvento;
	private JTextField txtCreadorEvento;
	private JTextField txtTipoEvento;
	private JLabel lblNombreEvento;
	private JLabel lblDeporteFutbol;
	private JLabel lblLocalizacion;
	private JButton btnCancelar;
	private JTextArea txtrDescripcinOrganizamosUn;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void ModificarEvento() {
		
					ModificarEvento window = new ModificarEvento();
					window.frame.setVisible(true);
			
	}

	/**
	 * Create the application.
	 */
	public ModificarEvento() {
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
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 834, 100);
		panel.setBackground(new Color(57, 62, 70));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnPerfil = new JButton("");
		btnPerfil.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnPerfil.setBounds(726, 18, 85, 70);
		btnPerfil.setBackground(null);
		btnPerfil.setBorder(null);
		panel.add(btnPerfil);
		
		btnFaqs = new JButton("FAQS");
		btnFaqs.setBorder(null);
		btnFaqs.setBackground(null);
		btnFaqs.setForeground(Color.WHITE);
		btnFaqs.setBounds(516, 43, 85, 21);
		panel.add(btnFaqs);
		
		btnPerfil = new JButton("PERFIL");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground(null);
		btnPerfil.setBounds(631, 43, 85, 21);
		panel.add(btnPerfil);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(650, 361, 157, 51);
		btnGuardar.setBorder(null);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(new Color(53, 187, 95));
		frame.getContentPane().add(btnGuardar);
		
		btnHome = new JButton("");
		btnHome.setBorderPainted(false);
		btnHome.setBackground(null);
		btnHome.setBorder(null);
		btnHome.setToolTipText("");
		btnHome.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/home-48.png")));
		btnHome.setBounds(22, 10, 85, 70);
		panel.add(btnHome);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(366, 361, 157, 51);
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(Color.RED);
		frame.getContentPane().add(btnCancelar);
		
		txtFechaEvento = new JTextField();
		txtFechaEvento.setBounds(25, 383, 283, 29);
		txtFechaEvento.setText("FECHA: 30-04-2022");
		frame.getContentPane().add(txtFechaEvento);
		txtFechaEvento.setColumns(10);
		
		txtTipoEvento = new JTextField();
		txtTipoEvento.setBounds(25, 333, 283, 29);
		txtTipoEvento.setText("TIPO EVENTO:\r\n\r\nPUBLICO");
		frame.getContentPane().add(txtTipoEvento);
		txtTipoEvento.setColumns(10);
		
		txtCreadorEvento = new JTextField();
		txtCreadorEvento.setBounds(25, 283, 283, 29);
		txtCreadorEvento.setText("NUMERO DE PARTICIPANTES:  14");
		frame.getContentPane().add(txtCreadorEvento);
		txtCreadorEvento.setColumns(10);
		
		txtrDescripcinOrganizamosUn = new JTextArea();
		txtrDescripcinOrganizamosUn.setBounds(366, 135, 441, 203);
		txtrDescripcinOrganizamosUn.setText("DESCRIPCI\u00D3N: \r\nOrganizamos un partido de futbol unos amigos y yo pero no somos suficientes. Buscamos a 5 personas.\r\nLugar: Polideportivo de Moralzarzal, a las 12:00\r\nAPUNTAROS!\r\n");
		frame.getContentPane().add(txtrDescripcinOrganizamosUn);
		
		lblNombreEvento = new JLabel("NOMBRE EVENTO: PARTIDO FUTBOL COLEGAS");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setBounds(25, 135, 283, 29);
		frame.getContentPane().add(lblNombreEvento);
		
		lblDeporteFutbol = new JLabel("DEPORTE: FUTBOL");
		lblDeporteFutbol.setForeground(Color.WHITE);
		lblDeporteFutbol.setBounds(25, 184, 283, 29);
		frame.getContentPane().add(lblDeporteFutbol);
		
		lblLocalizacion = new JLabel("LOCALIZACI\u00D3N: C/CRUZ DE MAYO, 8 28411 MORALZARZAL");
		lblLocalizacion.setForeground(Color.WHITE);
		lblLocalizacion.setBounds(25, 223, 283, 45);
		frame.getContentPane().add(lblLocalizacion);
		
	}
}
