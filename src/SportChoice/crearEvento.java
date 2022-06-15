package SportChoice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JCalendar;

public class crearEvento extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnCrear, btnFotoPerfil, btnPerfil, btnFAQs, btnLogoApp;
	private JTextField txtLocalizacion, txtPartidoFutbol;
	private JLabel lblTipoEvento, lblDeporteFutbol, lblFechaEvento, lblNombreEvento, lblParticipantes, lblCrearEvento,
			lblDescripcin;
	private JRadioButton rdbtnPublico, rdbtnPrivado;
	private JComboBox comboBox;
	private JSpinner spinnerParticipantes;
	private JTextPane txtpnOrganizamosUnPartido;
	private JPanel panelHeader;
	private JButton btnAtras;
	private JCalendar calendar;

	public static void crearEvento() {
		crearEvento window = new crearEvento();
		window.setVisible(true);
	}

	public crearEvento() {
		initialize();
	}

	private void initialize() {
		Container contenedor = getContentPane();
		getContentPane().setBackground(new Color(34, 40, 49));
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Crear evento");
		contenedor.setLayout(null);

		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.crearEvento();
				miControlador.actualizar(2, 17);
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCrear.setBorder(null);
		btnCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrear.setBackground(new Color(53, 187, 95));
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setBounds(700, 386, 113, 40);
		contenedor.add(btnCrear);

		txtLocalizacion = new JTextField();
		txtLocalizacion.setForeground(Color.GRAY);
		txtLocalizacion.setBounds(387, 157, 426, 25);
		getContentPane().add(txtLocalizacion);
		txtLocalizacion.setColumns(10);

		lblTipoEvento = new JLabel("Visibilidad:");
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setBounds(40, 270, 94, 23);
		getContentPane().add(lblTipoEvento);

		rdbtnPublico = new JRadioButton("P\u00FAblico");
		rdbtnPublico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPublico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnPublico.setSelected(true);
		rdbtnPublico.setForeground(Color.WHITE);
		rdbtnPublico.setBounds(157, 272, 72, 21);
		rdbtnPublico.setBackground(null);
		getContentPane().add(rdbtnPublico);

		rdbtnPrivado = new JRadioButton("Privado");
		rdbtnPrivado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPrivado.setForeground(Color.WHITE);
		rdbtnPrivado.setBounds(252, 272, 72, 21);
		rdbtnPrivado.setBackground(null);
		getContentPane().add(rdbtnPrivado);

		lblFechaEvento = new JLabel("Fecha:");
		lblFechaEvento.setForeground(Color.WHITE);
		lblFechaEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaEvento.setBounds(40, 315, 94, 23);
		getContentPane().add(lblFechaEvento);

		JLabel lblLocalizacin = new JLabel("Localizaci\u00F3n:");
		lblLocalizacin.setForeground(Color.WHITE);
		lblLocalizacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacin.setBounds(387, 135, 94, 23);
		getContentPane().add(lblLocalizacin);

		lblNombreEvento = new JLabel("Nombre:");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(40, 156, 94, 23);
		getContentPane().add(lblNombreEvento);

		txtPartidoFutbol = new JTextField();
		txtPartidoFutbol.setForeground(Color.GRAY);
		txtPartidoFutbol.setText("\r\n");
		txtPartidoFutbol.setColumns(10);
		txtPartidoFutbol.setBounds(135, 157, 189, 25);
		getContentPane().add(txtPartidoFutbol);

		lblDeporteFutbol = new JLabel("Deporte:");
		lblDeporteFutbol.setForeground(Color.WHITE);
		lblDeporteFutbol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteFutbol.setBounds(40, 189, 101, 23);
		getContentPane().add(lblDeporteFutbol);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "FUTBOL", "BALONCESTO", "TENIS" }));
		comboBox.setBounds(156, 192, 168, 21);
		getContentPane().add(comboBox);

		lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(40, 227, 101, 23);
		getContentPane().add(lblParticipantes);

		spinnerParticipantes = new JSpinner();
		spinnerParticipantes.setModel(new SpinnerNumberModel(2, 2, 100, 1));
		spinnerParticipantes.setBounds(156, 230, 168, 21);
		getContentPane().add(spinnerParticipantes);

		lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcin.setBounds(387, 193, 101, 23);
		getContentPane().add(lblDescripcin);

		lblCrearEvento = new JLabel("Crear Evento");
		lblCrearEvento.setIcon(null);
		lblCrearEvento.setForeground(Color.WHITE);
		lblCrearEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrearEvento.setBounds(90, 108, 189, 23);
		getContentPane().add(lblCrearEvento);

		txtpnOrganizamosUnPartido = new JTextPane();
		txtpnOrganizamosUnPartido.setForeground(Color.GRAY);
		txtpnOrganizamosUnPartido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnOrganizamosUnPartido.setBounds(387, 227, 426, 136);
		getContentPane().add(txtpnOrganizamosUnPartido);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnFotoPerfil = new JButton("");
		btnFotoPerfil.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnFotoPerfil.setBorder(null);
		btnFotoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFotoPerfil.setBackground((Color) null);
		btnFotoPerfil.setBounds(718, 0, 99, 100);
		btnFotoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHeader.add(btnFotoPerfil);
		btnFotoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(2, 10);
			}
		});

		btnPerfil = new JButton("Perfil");
		btnPerfil.setToolTipText("");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground((Color) null);
		btnPerfil.setBounds(644, 43, 64, 23);
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHeader.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(2, 10);
			}
		});

		btnFAQs = new JButton("FAQs");
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelHeader.add(btnFAQs);
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(2, 4);
			}
		});

		btnLogoApp = new JButton("");
		btnLogoApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(2, 11);
			}
		});
		btnLogoApp.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogoApp.setBorder(null);
		btnLogoApp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogoApp.setBackground((Color) null);
		btnLogoApp.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogoApp);

		btnAtras = new JButton("");
		btnAtras.setBorder(null);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(2, 11);
			}
		});
		btnAtras.setBackground(null);
		btnAtras.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBounds(21, 102, 56, 39);
		getContentPane().add(btnAtras);

		calendar = new JCalendar();
		calendar.setBounds(156, 315, 168, 111);
		getContentPane().add(calendar);

	}

	public JCalendar getCalendar() {
		return calendar;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JTextField getTxtLocalizacion() {
		return txtLocalizacion;
	}

	public JTextField getTxtPartidoFutbol() {
		return txtPartidoFutbol;
	}

	public JRadioButton getRdbtnPublico() {
		return rdbtnPublico;
	}

	public JRadioButton getRdbtnPrivado() {
		return rdbtnPrivado;
	}

	public JSpinner getSpinnerParticipantes() {
		return spinnerParticipantes;
	}

	public JTextPane getTxtpnOrganizamosUnPartido() {
		return txtpnOrganizamosUnPartido;
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
