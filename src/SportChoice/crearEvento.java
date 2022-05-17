package SportChoice;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JCalendar;

public class crearEvento extends JFrame{

	private JFrame frame;
	private JButton btnCrear, btnLogo, btnPerfil, btnFAQs, btnLogo_1, btnNewButton_1;
	private JTextField txtLocalizacion, txtPartidoFutbol;
	private JLabel lblTipoEvento, lblDeporteFutbol, lblFechaEvento, lblNombreEvento, lblParticipantes, lblHora,
			lblHora_1, lblCrearEvento, lblDescripcin;
	private JRadioButton rdbtnPublico, rdbtnPrivado;
	private JComboBox comboBox;
	private JSpinner spinner, spinner_1, spinner_2;
	private JTextPane txtpnOrganizamosUnPartido;
	private JPanel panelHeader;

	public static void crearEvento() {
		crearEvento window = new crearEvento();
		window.frame.setVisible(true);
	}

	public crearEvento() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sport Choice - Crear evento");
		contenedor.setLayout(null);

		btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCrear.setBorder(null);
		btnCrear.setBackground(new Color(53, 187, 95));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setBounds(700, 386, 113, 40);
		contenedor.add(btnCrear);

		txtLocalizacion = new JTextField();
		txtLocalizacion.setForeground(Color.GRAY);
		txtLocalizacion.setBounds(387, 157, 426, 25);
		frame.getContentPane().add(txtLocalizacion);
		txtLocalizacion.setColumns(10);

		lblTipoEvento = new JLabel("Visibilidad:");
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setBounds(40, 287, 94, 23);
		frame.getContentPane().add(lblTipoEvento);

		rdbtnPublico = new JRadioButton("P\u00FAblico");
		rdbtnPublico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPublico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnPublico.setSelected(true);
		rdbtnPublico.setForeground(Color.WHITE);
		rdbtnPublico.setBounds(156, 292, 72, 21);
		rdbtnPublico.setBackground(null);
		frame.getContentPane().add(rdbtnPublico);

		rdbtnPrivado = new JRadioButton("Privado");
		rdbtnPrivado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPrivado.setForeground(Color.WHITE);
		rdbtnPrivado.setBounds(252, 292, 72, 21);
		rdbtnPrivado.setBackground(null);
		frame.getContentPane().add(rdbtnPrivado);

		lblFechaEvento = new JLabel("Fecha:");
		lblFechaEvento.setForeground(Color.WHITE);
		lblFechaEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaEvento.setBounds(40, 316, 94, 23);
		frame.getContentPane().add(lblFechaEvento);

		JLabel lblLocalizacin = new JLabel("Localizaci\u00F3n:");
		lblLocalizacin.setForeground(Color.WHITE);
		lblLocalizacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacin.setBounds(387, 135, 94, 23);
		frame.getContentPane().add(lblLocalizacin);

		lblNombreEvento = new JLabel("Nombre:");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(40, 156, 94, 23);
		frame.getContentPane().add(lblNombreEvento);

		txtPartidoFutbol = new JTextField();
		txtPartidoFutbol.setForeground(Color.GRAY);
		txtPartidoFutbol.setText("\r\n");
		txtPartidoFutbol.setColumns(10);
		txtPartidoFutbol.setBounds(135, 157, 189, 25);
		frame.getContentPane().add(txtPartidoFutbol);

		lblDeporteFutbol = new JLabel("Deporte:");
		lblDeporteFutbol.setForeground(Color.WHITE);
		lblDeporteFutbol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteFutbol.setBounds(40, 193, 101, 23);
		frame.getContentPane().add(lblDeporteFutbol);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "FUTBOL", "BALONCESTO", "TENIS" }));
		comboBox.setBounds(156, 196, 168, 21);
		frame.getContentPane().add(comboBox);

		lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(40, 262, 101, 23);
		frame.getContentPane().add(lblParticipantes);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(2, 2, 100, 1));
		spinner.setBounds(156, 261, 168, 21);
		frame.getContentPane().add(spinner);

		lblHora = new JLabel("Hora:");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora.setBounds(40, 227, 101, 23);
		frame.getContentPane().add(lblHora);

		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 24, 1));
		spinner_1.setBounds(156, 227, 60, 21);
		frame.getContentPane().add(spinner_1);

		lblHora_1 = new JLabel(":");
		lblHora_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblHora_1.setForeground(Color.WHITE);
		lblHora_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora_1.setBounds(240, 228, 17, 23);
		frame.getContentPane().add(lblHora_1);

		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 60, 1));
		spinner_2.setBounds(264, 227, 60, 21);
		frame.getContentPane().add(spinner_2);

		lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcin.setBounds(387, 193, 101, 23);
		frame.getContentPane().add(lblDescripcin);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/arrow.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground((Color) null);
		btnNewButton_1.setBounds(0, 100, 47, 37);
		frame.getContentPane().add(btnNewButton_1);

		lblCrearEvento = new JLabel("Crear Evento");
		lblCrearEvento.setIcon(null);
		lblCrearEvento.setForeground(Color.WHITE);
		lblCrearEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrearEvento.setBounds(57, 106, 248, 23);
		frame.getContentPane().add(lblCrearEvento);

		txtpnOrganizamosUnPartido = new JTextPane();
		txtpnOrganizamosUnPartido.setForeground(Color.GRAY);
		txtpnOrganizamosUnPartido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnOrganizamosUnPartido.setBounds(387, 227, 426, 136);
		frame.getContentPane().add(txtpnOrganizamosUnPartido);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);

		btnPerfil = new JButton("Perfil");
		btnPerfil.setToolTipText("");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground((Color) null);
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);

		btnLogo_1 = new JButton("");
		btnLogo_1.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/home-48.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(28, 21, 64, 68);
		panelHeader.add(btnLogo_1);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(156, 326, 168, 100);
		frame.getContentPane().add(calendar);

	}
}
