package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;

public class unirseEvento extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JLabel lblNewLabel, lblUnirseEvento, lblNombre, lblNombreEvento, lblFecha, lblFechaVariable, lblHora,
			lblHoraVariable, lblDeporte, lblDeporteVariable, lblParticipantes, lblParticipantesVariable, lblTipoEvento,
			lblTipoEventoVariable;
	private JPanel panelHeader;
	private JButton btnPerfil, btnUnirse, btnLogo, btnPerfil_1, btnFAQs;
	private JButton btnLogo_1;

	public static void unirseEvento() {
		unirseEvento window = new unirseEvento();
		window.setVisible(true);
	}

	public unirseEvento() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setTitle("Sport Choice - Unirse a evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contenedor.setLayout(null);

		btnUnirse = new JButton("UNIRSE");
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53, 187, 95));
		btnUnirse.setBounds(687, 370, 120, 38);
		getContentPane().add(btnUnirse);

		lblUnirseEvento = new JLabel("Unirse Evento");
		lblUnirseEvento.setForeground(Color.WHITE);
		lblUnirseEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUnirseEvento.setBounds(25, 110, 248, 23);
		getContentPane().add(lblUnirseEvento);

		lblNombre = new JLabel("Nombre Evento:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(25, 159, 125, 23);
		getContentPane().add(lblNombre);

		lblNombreEvento = new JLabel("Partido Futbol ");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(148, 159, 125, 23);
		getContentPane().add(lblNombreEvento);

		lblFecha = new JLabel("Fecha:");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha.setBounds(25, 187, 125, 23);
		getContentPane().add(lblFecha);

		lblFechaVariable = new JLabel("25 / 05 / 2022");
		lblFechaVariable.setForeground(Color.WHITE);
		lblFechaVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaVariable.setBounds(148, 187, 125, 23);
		getContentPane().add(lblFechaVariable);

		lblHora = new JLabel("Hora: ");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHora.setBounds(25, 220, 125, 23);
		getContentPane().add(lblHora);

		lblHoraVariable = new JLabel("17 : 30");
		lblHoraVariable.setForeground(Color.WHITE);
		lblHoraVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHoraVariable.setBounds(148, 220, 125, 23);
		getContentPane().add(lblHoraVariable);

		lblDeporte = new JLabel("Deporte:");
		lblDeporte.setForeground(Color.WHITE);
		lblDeporte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporte.setBounds(25, 288, 125, 23);
		getContentPane().add(lblDeporte);

		lblDeporteVariable = new JLabel("Futbol ");
		lblDeporteVariable.setForeground(Color.WHITE);
		lblDeporteVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteVariable.setBounds(148, 288, 125, 23);
		getContentPane().add(lblDeporteVariable);

		lblParticipantes = new JLabel("Participantes:");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(25, 254, 125, 23);
		getContentPane().add(lblParticipantes);

		lblParticipantesVariable = new JLabel("10/14");
		lblParticipantesVariable.setForeground(Color.WHITE);
		lblParticipantesVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantesVariable.setBounds(148, 254, 125, 23);
		getContentPane().add(lblParticipantesVariable);

		lblTipoEvento = new JLabel("Tipo Evento:");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(366, 187, 125, 23);
		getContentPane().add(lblTipoEvento);

		lblTipoEventoVariable = new JLabel("P\u00FAblico");
		lblTipoEventoVariable.setForeground(Color.WHITE);
		lblTipoEventoVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEventoVariable.setBounds(463, 187, 125, 23);
		getContentPane().add(lblTipoEventoVariable);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(35, 322, 68, 72);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setMaximumSize(new Dimension(10, 10));
		lblNewLabel.setIconTextGap(2);
		lblNewLabel.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/icons8-soccer-ball-100.png")));

		JLabel lblLocalizacion = new JLabel("Localizacion:");
		lblLocalizacion.setForeground(Color.WHITE);
		lblLocalizacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacion.setBounds(366, 159, 87, 23);
		getContentPane().add(lblLocalizacion);

		JLabel lblLocalizacionVariable = new JLabel("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		lblLocalizacionVariable.setForeground(Color.WHITE);
		lblLocalizacionVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacionVariable.setBounds(463, 159, 344, 23);
		getContentPane().add(lblLocalizacionVariable);

		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcion.setBounds(366, 212, 87, 23);
		getContentPane().add(lblDescripcion);

		JTextPane txtpnOrganizamosUnPartido = new JTextPane();
		txtpnOrganizamosUnPartido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnOrganizamosUnPartido.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos suficientes. \r\nNecesitas llevar una botella de agua propia y dos camisetas, una roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n");
		txtpnOrganizamosUnPartido.setBounds(366, 241, 441, 118);
		getContentPane().add(txtpnOrganizamosUnPartido);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/appppp-modified.png")));
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
		btnLogo_1.setIcon(new ImageIcon(unirseEvento.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo_1);
	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
