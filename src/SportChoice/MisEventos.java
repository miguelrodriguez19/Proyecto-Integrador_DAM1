package SportChoice;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class MisEventos extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtLocalidad;
	private JButton btnFAQs, btnPerfil, btnCrearEventos, btnAplicarFiltros, btnEventosRecientes, btnMisEventos,
			btnUnirseEvento, btnPerfilFoto;
	private JLabel lblFiltros;
	private JPanel panelHeader, panelPaginaPrincipal;
	private JComboBox comboBoxDeportes, comboBoxDia, comboBoxMes;
	private JScrollPane scrollPaneEventos;
	private JTable table;
	private JButton btnLogo;
	private String usuarioConectado;
	private static String eventoSeleccionado;

	public static void MisEventos() {
		MisEventos mainPage = new MisEventos();
		mainPage.setVisible(true);
	}

	public MisEventos() {
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Mis eventos");
		contenedor.setLayout(null);

		panelHeader = new JPanel();
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		btnPerfilFoto = new JButton("");
		btnPerfilFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfilFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfilFoto.setIcon(new ImageIcon(MisEventos.class.getResource("/Imagenes/appppp-modified.png")));
		btnPerfilFoto.setBorder(null);
		btnPerfilFoto.setBackground((Color) null);
		btnPerfilFoto.setBounds(718, 0, 99, 100);
		panelHeader.add(btnPerfilFoto);
		btnPerfilFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 10);
			}
		});

		btnPerfil = new JButton("PERFIL");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setBorder(null);
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(null);
		btnPerfil.setToolTipText("");
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 10);
			}
		});

		btnFAQs = new JButton("FAQS");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setBorder(null);
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 4);
			}
		});
		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.setIcon(new ImageIcon(MisEventos.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo);
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 11);
			}
		});

		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34, 40, 49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);

		btnCrearEventos = new JButton("CREAR EVENTOS");
		btnCrearEventos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCrearEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 2);
			}
		});
		btnCrearEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearEventos.setBorder(null);
		btnCrearEventos.setForeground(Color.WHITE);
		btnCrearEventos.setBackground(new Color(53, 187, 95));
		btnCrearEventos.setBounds(30, 51, 148, 30);
		panelPaginaPrincipal.add(btnCrearEventos);

		lblFiltros = new JLabel("BUSCAR POR FILTROS:");
		lblFiltros.setForeground(Color.WHITE);
		lblFiltros.setBounds(30, 97, 148, 29);
		panelPaginaPrincipal.add(lblFiltros);

		comboBoxDeportes = new JComboBox();
		comboBoxDeportes
				.setModel(new DefaultComboBoxModel(new String[] { "DEPORTES", "FUTBOL", "BALONCESTO", "TENIS" }));
		comboBoxDeportes.setBounds(30, 123, 148, 22);
		panelPaginaPrincipal.add(comboBoxDeportes);

		comboBoxMes = new JComboBox();
		comboBoxMes.setModel(new DefaultComboBoxModel(
				new String[] { "MES", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBoxMes.setBounds(119, 156, 59, 22);
		panelPaginaPrincipal.add(comboBoxMes);

		comboBoxDia = new JComboBox();
		comboBoxDia.setBackground(Color.WHITE);
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		comboBoxDia.setBounds(30, 156, 59, 22);
		panelPaginaPrincipal.add(comboBoxDia);

		txtLocalidad = new JTextField();
		txtLocalidad.setText("LOCALIDAD");
		txtLocalidad.setBounds(30, 189, 148, 29);
		panelPaginaPrincipal.add(txtLocalidad);
		txtLocalidad.setColumns(10);

		btnAplicarFiltros = new JButton("BUSCAR");
		btnAplicarFiltros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAplicarFiltros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAplicarFiltros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAplicarFiltros.setForeground(Color.WHITE);
		btnAplicarFiltros.setBorder(null);
		btnAplicarFiltros.setBackground(new Color(129, 136, 212));

		btnAplicarFiltros.setBounds(89, 229, 89, 23);
		panelPaginaPrincipal.add(btnAplicarFiltros);

		btnEventosRecientes = new JButton("EVENTOS RECIENTES");
		btnEventosRecientes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEventosRecientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 11);
			}
		});
		btnEventosRecientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEventosRecientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEventosRecientes.setSelected(true);
		btnEventosRecientes.setForeground(Color.WHITE);
		btnEventosRecientes.setBorder(null);
		btnEventosRecientes.setBackground(new Color(156, 163, 219));
		btnEventosRecientes.setBounds(202, 10, 310, 40);
		panelPaginaPrincipal.add(btnEventosRecientes);

		btnMisEventos = new JButton("MIS EVENTOS");
		btnMisEventos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMisEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMisEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMisEventos.setForeground(Color.WHITE);
		btnMisEventos.setBorder(null);
		btnMisEventos.setBackground(new Color(129, 136, 212));
		btnMisEventos.setBounds(514, 10, 310, 40);
		panelPaginaPrincipal.add(btnMisEventos);

		btnUnirseEvento = new JButton("VER EVENTO");
		btnUnirseEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUnirseEvento.setEnabled(false);
		btnUnirseEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(8, 17);
			}
		});
		btnUnirseEvento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUnirseEvento.setForeground(Color.WHITE);
		btnUnirseEvento.setBorder(null);
		btnUnirseEvento.setBackground(new Color(53, 187, 95));
		btnUnirseEvento.setBounds(727, 300, 97, 23);
		panelPaginaPrincipal.add(btnUnirseEvento);

		table = new JTable();
		table.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
					eventoSeleccionado = table.getValueAt(table.getSelectedRow(), 0).toString();
					btnUnirseEvento.setEnabled(true);
			}
		});
		table.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setPreferredScrollableViewportSize(new Dimension(400, 400));
		table.setIntercellSpacing(new Dimension(5, 1));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setRowHeight(65);
		table.setBounds(96, 58, 809, 285);

		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setAutoscrolls(true);
		scrollPaneEventos.setBounds(202, 51, 622, 238);
		panelPaginaPrincipal.add(scrollPaneEventos);
		scrollPaneEventos.setViewportView(table);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miModelo.cargarTabla("misEventos");
				table.setModel(miModelo.getTabla());
			}
		});
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public static String getEventoSeleccionado() {
		return eventoSeleccionado;
	}

	public static void setEventoSeleccionado(String eventoSelec) {
		eventoSeleccionado = eventoSelec;
	}
}