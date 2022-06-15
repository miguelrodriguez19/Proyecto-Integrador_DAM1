package SportChoice;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MainPage extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtLocalidad;
	private JButton btnFAQs, btnPerfil, btnCrearEventos, btnAplicarFiltros, btnEventosRecientes, btnMisEventos,
			btnUnirseEvento, btnLogo;
	private JLabel lblFiltros;
	private JPanel panelHeader, panelPaginaPrincipal;
	private JComboBox comboBoxDeportes, comboBoxDia, comboBoxMes;
	private JScrollPane scrollPaneEventos;
	private JTable table;
	private static String eventoSeleccionado;

	public static void MainPage() {
		MainPage window = new MainPage();
		window.setVisible(true);
	}

	public MainPage() {
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Eventos recientes");
		contenedor.setLayout(null);

		panelHeader = new JPanel();
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		JButton btnFotoPerfil = new JButton("");
		btnFotoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFotoPerfil.setIcon(new ImageIcon(MainPage.class.getResource("/Imagenes/appppp-modified.png")));
		btnFotoPerfil.setBorder(null);
		btnFotoPerfil.setBackground((Color) null);
		btnFotoPerfil.setBounds(718, 0, 99, 100);
		panelHeader.add(btnFotoPerfil);
		btnFotoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 10);
			}
		});

		btnPerfil = new JButton("PERFIL");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPerfil.setBorder(null);
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(null);
		btnPerfil.setToolTipText("");
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 10);
			}
		});
		btnFAQs = new JButton("FAQS");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFAQs.setBorder(null);
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 4);
			}
		});
		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.setBorder(null);
		btnLogo.setBackground(null);
		btnLogo.setIcon(new ImageIcon(MainPage.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo);

		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34, 40, 49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);

		btnCrearEventos = new JButton("CREAR EVENTOS");
		btnCrearEventos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCrearEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 2);
			}
		});
		btnCrearEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearEventos.setBorder(null);
		btnCrearEventos.setForeground(Color.WHITE);
		btnCrearEventos.setBackground(new Color(53, 187, 95));
		btnCrearEventos.setBounds(30, 10, 148, 30);
		panelPaginaPrincipal.add(btnCrearEventos);

		lblFiltros = new JLabel("BUSCAR POR FILTROS");
		lblFiltros.setForeground(Color.WHITE);
		lblFiltros.setBounds(30, 56, 148, 29);
		panelPaginaPrincipal.add(lblFiltros);

		comboBoxDeportes = new JComboBox();
		comboBoxDeportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxDeportes
				.setModel(new DefaultComboBoxModel(new String[] { "DEPORTES", "FUTBOL", "BALONCESTO", "TENIS" }));
		comboBoxDeportes.setBounds(30, 82, 148, 22);
		panelPaginaPrincipal.add(comboBoxDeportes);

		comboBoxMes = new JComboBox();
		comboBoxMes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxMes.setModel(new DefaultComboBoxModel(
				new String[] { "MES", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBoxMes.setBounds(119, 115, 59, 22);
		panelPaginaPrincipal.add(comboBoxMes);

		comboBoxDia = new JComboBox();
		comboBoxDia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxDia.setBackground(Color.WHITE);
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] { "DIA", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		comboBoxDia.setBounds(30, 115, 59, 22);
		panelPaginaPrincipal.add(comboBoxDia);

		txtLocalidad = new JTextField("LOCALIDAD");
		txtLocalidad.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtLocalidad.getText().equals(mensajeTxtMail))
					txtMail.setText("");
				txtMail.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtMail.getText().equals("")) {
					txtMail.setText(mensajeTxtMail);
					txtMail.setForeground(Color.GRAY);
				}
			}
		});
		txtLocalidad.setBounds(30, 148, 148, 29);
		panelPaginaPrincipal.add(txtLocalidad);
		txtLocalidad.setColumns(10);

		btnAplicarFiltros = new JButton("BUSCAR");
		btnAplicarFiltros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAplicarFiltros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAplicarFiltros.setForeground(Color.WHITE);
		btnAplicarFiltros.setBorder(null);
		btnAplicarFiltros.setBackground(new Color(129, 136, 212));

		btnAplicarFiltros.setBounds(89, 188, 89, 23);
		panelPaginaPrincipal.add(btnAplicarFiltros);

		btnEventosRecientes = new JButton("EVENTOS RECIENTES");
		btnEventosRecientes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEventosRecientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEventosRecientes.setSelected(true);
		btnEventosRecientes.setForeground(Color.WHITE);
		btnEventosRecientes.setBorder(null);
		btnEventosRecientes.setBackground(new Color(129, 136, 212));
		btnEventosRecientes.setBounds(202, 10, 310, 40);
		panelPaginaPrincipal.add(btnEventosRecientes);

		btnMisEventos = new JButton("MIS EVENTOS");
		btnMisEventos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMisEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 8);
			}
		});
		btnMisEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMisEventos.setForeground(Color.WHITE);
		btnMisEventos.setBorder(null);
		btnMisEventos.setBackground(new Color(156, 163, 219));
		btnMisEventos.setBounds(514, 10, 310, 40);
		panelPaginaPrincipal.add(btnMisEventos);
		btnMisEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 8);
			}
		});
		btnUnirseEvento = new JButton("VER DETALLES");
		btnUnirseEvento.setEnabled(false);
		btnUnirseEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUnirseEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 15);
			}
		});
		btnUnirseEvento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUnirseEvento.setForeground(Color.WHITE);
		btnUnirseEvento.setBorder(null);

		btnUnirseEvento.setBackground(new Color(53, 187, 95));
		btnUnirseEvento.setBounds(735, 300, 89, 23);
		panelPaginaPrincipal.add(btnUnirseEvento);

		table = new JTable();
		table.setEditingColumn(0);
		table.setEditingRow(0);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				eventoSeleccionado = table.getValueAt(table.getSelectedRow(), 0).toString();
				System.out.println(eventoSeleccionado);
				btnUnirseEvento.setEnabled(true);
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSurrendersFocusOnKeystroke(true);
		table.setToolTipText("");
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setRowHeight(65);
		table.setBounds(96, 58, 809, 285);

		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(202, 51, 622, 238);
		panelPaginaPrincipal.add(scrollPaneEventos);
		scrollPaneEventos.setViewportView(table);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miModelo.cargarTabla("eventosRecientes");
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
}