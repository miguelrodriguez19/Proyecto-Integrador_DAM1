package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class ModificarEvento {

	private JFrame frame;
	private JPanel panelHeader;
	private JTextField txtPartidoFutbol, txtCCruzDe;
	private JSpinner spinner, spinner_1, spinner_2;
	private JRadioButton rdbtnPublico, rdbtnPrivado;
	private JComboBox comboBox, comboBox_1, comboBox_1_1, comboBox_2;
	private JLabel lblNombreEvento, lblDeporteFutbol, lblHora, lblHora_1, lblParticipantes, lblTipoEvento,
			lblFechaEvento, lblDescripcin, lblLocalizacin, lblCrearEvento;
	private JButton btnPerfil, btnCrear, btnNewButton, btnEliminar, btnLogo, btnPerfil_1, btnFAQs, btnLogo_1;

	public static void ModificarEvento() {

		ModificarEvento window = new ModificarEvento();
		window.frame.setVisible(true);

	}

	public ModificarEvento() {
		initialize();
	}
		
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sport Choice - Modificar evento");
		frame.getContentPane().setLayout(null);

		lblNombreEvento = new JLabel("Nombre:");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(40, 133, 94, 23);
		frame.getContentPane().add(lblNombreEvento);

		txtPartidoFutbol = new JTextField();
		txtPartidoFutbol.setForeground(Color.GRAY);
		txtPartidoFutbol.setText("Partido Futbol");
		txtPartidoFutbol.setColumns(10);
		txtPartidoFutbol.setBounds(40, 155, 284, 25);
		frame.getContentPane().add(txtPartidoFutbol);

		lblDeporteFutbol = new JLabel("Deporte:");
		lblDeporteFutbol.setForeground(Color.WHITE);
		lblDeporteFutbol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteFutbol.setBounds(40, 191, 101, 23);
		frame.getContentPane().add(lblDeporteFutbol);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "FUTBOL", "BALONCESTO", "TENIS" }));
		comboBox.setBounds(174, 194, 150, 21);
		frame.getContentPane().add(comboBox);

		lblHora = new JLabel("Hora:");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora.setBounds(40, 225, 101, 23);
		frame.getContentPane().add(lblHora);

		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(17, 1, 24, 1));
		spinner.setBounds(174, 228, 60, 21);
		frame.getContentPane().add(spinner);

		lblHora_1 = new JLabel(":");
		lblHora_1.setForeground(Color.WHITE);
		lblHora_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora_1.setAlignmentX(0.5f);
		lblHora_1.setBounds(244, 225, 17, 23);
		frame.getContentPane().add(lblHora_1);

		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(30, 0, 60, 1));
		spinner_1.setBounds(264, 228, 60, 21);
		frame.getContentPane().add(spinner_1);

		lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(40, 260, 101, 23);
		frame.getContentPane().add(lblParticipantes);

		spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		spinner_2.setModel(new SpinnerNumberModel(14, 2, 100, 1));
		spinner_2.setBounds(174, 259, 150, 21);
		frame.getContentPane().add(spinner_2);

		lblTipoEvento = new JLabel("Visibilidad:");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(40, 285, 94, 23);
		frame.getContentPane().add(lblTipoEvento);

		lblFechaEvento = new JLabel("Fecha:");
		lblFechaEvento.setForeground(Color.WHITE);
		lblFechaEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaEvento.setBounds(174, 285, 94, 23);
		frame.getContentPane().add(lblFechaEvento);

		rdbtnPublico = new JRadioButton("P\u00FAblico");
		rdbtnPublico.setSelected(true);
		rdbtnPublico.setForeground(Color.WHITE);
		rdbtnPublico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPublico.setBackground((Color) null);
		rdbtnPublico.setBounds(40, 315, 72, 21);
		frame.getContentPane().add(rdbtnPublico);

		rdbtnPrivado = new JRadioButton("Privado");
		rdbtnPrivado.setEnabled(false);
		rdbtnPrivado.setForeground(Color.WHITE);
		rdbtnPrivado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPrivado.setBackground((Color) null);
		rdbtnPrivado.setBounds(40, 339, 72, 21);
		frame.getContentPane().add(rdbtnPrivado);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "15" }));
		comboBox_1.setBounds(174, 310, 65, 22);
		frame.getContentPane().add(comboBox_1);

		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] { "2022" }));
		comboBox_1_1.setBounds(174, 339, 150, 22);
		frame.getContentPane().add(comboBox_1_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "05" }));
		comboBox_2.setBounds(259, 310, 65, 22);
		frame.getContentPane().add(comboBox_2);

		lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcin.setBounds(387, 191, 101, 23);
		frame.getContentPane().add(lblDescripcin);

		txtCCruzDe = new JTextField();
		txtCCruzDe.setText("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		txtCCruzDe.setForeground(Color.GRAY);
		txtCCruzDe.setColumns(10);
		txtCCruzDe.setBounds(387, 155, 426, 25);
		frame.getContentPane().add(txtCCruzDe);

		lblLocalizacin = new JLabel("Localizaci\u00F3n:");
		lblLocalizacin.setForeground(Color.WHITE);
		lblLocalizacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacin.setBounds(387, 133, 94, 23);
		frame.getContentPane().add(lblLocalizacin);

		btnCrear = new JButton("Confirmar");
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCrear.setBorder(null);
		btnCrear.setBackground(new Color(53, 187, 95));
		btnCrear.setBounds(700, 372, 113, 40);
		frame.getContentPane().add(btnCrear);

		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(null);
		btnNewButton.setBounds(0, 98, 47, 37);
		frame.getContentPane().add(btnNewButton);

		lblCrearEvento = new JLabel("Modificar Evento");
		lblCrearEvento.setForeground(Color.WHITE);
		lblCrearEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrearEvento.setBounds(57, 104, 248, 23);
		frame.getContentPane().add(lblCrearEvento);

		btnEliminar = new JButton("Cancelar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(new Color(204, 0, 0));
		btnEliminar.setBounds(387, 372, 113, 40);
		frame.getContentPane().add(btnEliminar);

		JTextPane txtpnOrganizamosUnPartido = new JTextPane();
		txtpnOrganizamosUnPartido.setForeground(Color.GRAY);
		txtpnOrganizamosUnPartido.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos\r\nsuficientes. \r\nNecesitas llevar una botella de agua propia y dos camisetas, \r\nuna roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n\r\n");
		txtpnOrganizamosUnPartido.setBounds(387, 225, 426, 135);
		frame.getContentPane().add(txtpnOrganizamosUnPartido);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);

		btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setToolTipText("");
		btnPerfil_1.setForeground(Color.WHITE);
		btnPerfil_1.setBorder(null);
		btnPerfil_1.setBackground((Color) null);
		btnPerfil_1.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil_1);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);

		btnLogo_1 = new JButton("");
		btnLogo_1.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/home-48.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(28, 21, 64, 68);
		panelHeader.add(btnLogo_1);

	}
}