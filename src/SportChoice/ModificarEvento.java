package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.toedter.calendar.JCalendar;

public class ModificarEvento extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panelHeader;
	private JTextField txtPartidoFutbol, txtCCruzDe;
	private JSpinner spinner, spinner_1, spinner_2;
	private JRadioButton rdbtnPublico, rdbtnPrivado;
	private JComboBox comboBox;
	private JLabel lblNombreEvento, lblDeporteFutbol, lblHora, lblHora_1, lblParticipantes, lblTipoEvento,
			lblFechaEvento, lblDescripcin, lblLocalizacin, lblCrearEvento;
	private JButton btnPerfil, btnCrear, btnEliminar, btnLogo, btnPerfil_1, btnFAQs;
	private JButton btnLogo_1;
	private JButton btnAtras;

	public static void ModificarEvento() {

		ModificarEvento window = new ModificarEvento();
		window.setVisible(true);

	}

	public ModificarEvento() {
		initialize();
	}
		
	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor =getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Modificar evento");
		getContentPane().setLayout(null);

		lblNombreEvento = new JLabel("NOMBRE");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(40, 143, 94, 23);
		getContentPane().add(lblNombreEvento);

		txtPartidoFutbol = new JTextField();
		txtPartidoFutbol.setForeground(Color.GRAY);
		txtPartidoFutbol.setText("Partido Futbol");
		txtPartidoFutbol.setColumns(10);
		txtPartidoFutbol.setBounds(110, 144, 214, 25);
		getContentPane().add(txtPartidoFutbol);

		lblDeporteFutbol = new JLabel("DEPORTE");
		lblDeporteFutbol.setForeground(Color.WHITE);
		lblDeporteFutbol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteFutbol.setBounds(40, 178, 101, 23);
		getContentPane().add(lblDeporteFutbol);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "FUTBOL", "BALONCESTO", "TENIS" }));
		comboBox.setBounds(162, 179, 162, 21);
		getContentPane().add(comboBox);

		lblHora = new JLabel("HORA");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora.setBounds(40, 212, 101, 23);
		getContentPane().add(lblHora);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(17, 1, 24, 1));
		spinner.setBounds(162, 213, 72, 21);
		getContentPane().add(spinner);

		lblHora_1 = new JLabel(":");
		lblHora_1.setForeground(Color.WHITE);
		lblHora_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora_1.setAlignmentX(0.5f);
		lblHora_1.setBounds(244, 210, 17, 23);
		getContentPane().add(lblHora_1);

		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(30, 0, 60, 1));
		spinner_1.setBounds(264, 213, 60, 21);
		getContentPane().add(spinner_1);

		lblParticipantes = new JLabel("PARTICIPANTES");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(40, 248, 112, 23);
		getContentPane().add(lblParticipantes);

		spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		spinner_2.setModel(new SpinnerNumberModel(14, 2, 100, 1));
		spinner_2.setBounds(162, 250, 162, 21);
		getContentPane().add(spinner_2);

		lblTipoEvento = new JLabel("VISIBILIDAD");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(40, 283, 94, 23);
		getContentPane().add(lblTipoEvento);

		lblFechaEvento = new JLabel("FECHA");
		lblFechaEvento.setForeground(Color.WHITE);
		lblFechaEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaEvento.setBounds(42, 312, 94, 23);
		getContentPane().add(lblFechaEvento);

		rdbtnPublico = new JRadioButton("PUBLICO");
		rdbtnPublico.setSelected(true);
		rdbtnPublico.setForeground(Color.WHITE);
		rdbtnPublico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPublico.setBackground((Color) null);
		rdbtnPublico.setBounds(162, 287, 88, 21);
		getContentPane().add(rdbtnPublico);

		rdbtnPrivado = new JRadioButton("PRIVADO");
		rdbtnPrivado.setEnabled(false);
		rdbtnPrivado.setForeground(Color.WHITE);
		rdbtnPrivado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPrivado.setBackground((Color) null);
		rdbtnPrivado.setBounds(252, 287, 88, 21);
		getContentPane().add(rdbtnPrivado);

		lblDescripcin = new JLabel("DESCRIPCION");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcin.setBounds(387, 199, 101, 23);
		getContentPane().add(lblDescripcin);

		txtCCruzDe = new JTextField();
		txtCCruzDe.setText("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		txtCCruzDe.setForeground(Color.GRAY);
		txtCCruzDe.setColumns(10);
		txtCCruzDe.setBounds(387, 155, 426, 25);
		getContentPane().add(txtCCruzDe);

		lblLocalizacin = new JLabel("LOCALIZACION");
		lblLocalizacin.setForeground(Color.WHITE);
		lblLocalizacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacin.setBounds(387, 133, 113, 23);
		getContentPane().add(lblLocalizacin);

		btnCrear = new JButton("CONFIRMAR");
		btnCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 17);
			}
		});
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCrear.setBorder(null);
		btnCrear.setBackground(new Color(53, 187, 95));
		btnCrear.setBounds(700, 372, 113, 40);
		getContentPane().add(btnCrear);

		lblCrearEvento = new JLabel("MODIFICAR EVENTO");
		lblCrearEvento.setForeground(Color.WHITE);
		lblCrearEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrearEvento.setBounds(76, 110, 287, 23);
		getContentPane().add(lblCrearEvento);

		btnEliminar = new JButton("CANCELAR");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 17);
			}
		});
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(new Color(204, 0, 0));
		btnEliminar.setBounds(387, 372, 113, 40);
		getContentPane().add(btnEliminar);

		JTextPane txtpnOrganizamosUnPartido = new JTextPane();
		txtpnOrganizamosUnPartido.setForeground(Color.GRAY);
		txtpnOrganizamosUnPartido.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos\r\nsuficientes. \r\nNecesitas llevar una botella de agua propia y dos camisetas, \r\nuna roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n\r\n");
		txtpnOrganizamosUnPartido.setBounds(387, 225, 426, 135);
		getContentPane().add(txtpnOrganizamosUnPartido);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 10);
			}
		});
		btnLogo.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);

		btnPerfil_1 = new JButton("PERFIL");
		btnPerfil_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPerfil_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 10);
			}
		});
		btnPerfil_1.setToolTipText("");
		btnPerfil_1.setForeground(Color.WHITE);
		btnPerfil_1.setBorder(null);
		btnPerfil_1.setBackground((Color) null);
		btnPerfil_1.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil_1);

		btnFAQs = new JButton("FAQS");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 4);
			}
		});
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		btnLogo_1 = new JButton("");
		btnLogo_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo_1.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo_1);
		
		btnLogo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 11);
			}
		});
		
		btnAtras = new JButton("");
		btnAtras.setBorder(null);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 17);
			}
		});
		btnAtras.setBackground(null);
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBounds(10, 100, 56, 39);
		getContentPane().add(btnAtras);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(156, 315, 168, 111);
		getContentPane().add(calendar);

	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}