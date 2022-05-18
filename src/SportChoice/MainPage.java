package SportChoice;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtLocalidad;
	private JButton btnFAQs, btnPerfil, btnCrearEventos, btnAplicarFiltros, btnEventosRecientes, btnMisEventos, btnUnirseEvento, btnLogo;
	private JLabel lblNewLabel;
	private JPanel panelHeader, panelPaginaPrincipal;
	private JComboBox comboBoxDeportes, comboBoxDia, comboBoxMes;
	private JScrollPane scrollPaneEventos;
	private JTable table;
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
				miControlador.actualizar(10, 9);
			}
		});

		btnPerfil = new JButton("Perfil");
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
		btnFAQs = new JButton("FAQs");
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
		btnLogo.setIcon(new ImageIcon(MainPage.class.getResource("/Imagenes/home-48.png")));
		btnLogo.setBounds(28, 21, 64, 68);
		panelHeader.add(btnLogo);

		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34, 40, 49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);

		btnCrearEventos = new JButton("Crear Eventos");
		btnCrearEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(11, 2);
			}
		});
		btnCrearEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearEventos.setBorder(null);
		btnCrearEventos.setForeground(Color.WHITE);
		btnCrearEventos.setBackground(new Color(53, 187, 95));
		btnCrearEventos.setBounds(29, 5, 148, 30);
		panelPaginaPrincipal.add(btnCrearEventos);

		lblNewLabel = new JLabel("Buscar por filtros: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(29, 51, 148, 29);
		panelPaginaPrincipal.add(lblNewLabel);

		comboBoxDeportes = new JComboBox();
		comboBoxDeportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxDeportes
				.setModel(new DefaultComboBoxModel(new String[] { "Deportes", "Futbol", "Baloncesto", "Tenis" }));
		comboBoxDeportes.setBounds(29, 77, 148, 22);
		panelPaginaPrincipal.add(comboBoxDeportes);

		comboBoxMes = new JComboBox();
		comboBoxMes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxMes.setModel(new DefaultComboBoxModel(
				new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBoxMes.setBounds(118, 110, 59, 22);
		panelPaginaPrincipal.add(comboBoxMes);

		comboBoxDia = new JComboBox();
		comboBoxDia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBoxDia.setBackground(Color.WHITE);
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDia.setBounds(29, 110, 59, 22);
		panelPaginaPrincipal.add(comboBoxDia);

		txtLocalidad = new JTextField();
		txtLocalidad.setText("Localidad");
		txtLocalidad.setBounds(29, 143, 148, 29);
		panelPaginaPrincipal.add(txtLocalidad);
		txtLocalidad.setColumns(10);

		btnAplicarFiltros = new JButton("Aplicar");
		btnAplicarFiltros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAplicarFiltros.setForeground(Color.WHITE);
		btnAplicarFiltros.setBorder(null);
		btnAplicarFiltros.setBackground(new Color(129, 136, 212));

		btnAplicarFiltros.setBounds(88, 183, 89, 23);
		panelPaginaPrincipal.add(btnAplicarFiltros);

		btnEventosRecientes = new JButton("Eventos Recientes");
		btnEventosRecientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEventosRecientes.setSelected(true);
		btnEventosRecientes.setForeground(Color.WHITE);
		btnEventosRecientes.setBorder(null);
		btnEventosRecientes.setBackground(new Color(129, 136, 212));
		btnEventosRecientes.setBounds(202, 0, 310, 40);
		panelPaginaPrincipal.add(btnEventosRecientes);

		btnMisEventos = new JButton("Mis Eventos");
		btnMisEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMisEventos.setForeground(Color.WHITE);
		btnMisEventos.setBorder(null);
		btnMisEventos.setBackground(new Color(156, 163, 219));
		btnMisEventos.setBounds(514, 0, 310, 40);
		panelPaginaPrincipal.add(btnMisEventos);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSurrendersFocusOnKeystroke(true);
		table.setToolTipText("");
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" @PedroJuarez", "Futbol", "12/02/2022", "6/9", "triangular en Laude "
						+ "Fontenebro, 28411"},
				{" @JuanPerez", "Futbol", "15/02/2022", "10/12", "rey de la pista "
						+ "4vs4 futsal"},
				{" @JuanPerez", "Tenis", "17/02/2022", "1/4", "Partido de tenis 2vs2"},
				{" @IgnacioPerez", "Futbol", "20/02/2022", "5/12", "Partido entre amigos"},
				{" @LuisGonzalez", "Baloncesto", "2/03/2022", "12/12", "Pachanguita baloncesto,"
						+ " poli Moralzarzal"},
				{" @IgnacioPerez", "Futbol", "20/02/2022", "18/22", "dnadnsioasudsausduasud"},
				{" @MiguelRod", "Padel", "29/02/2022", "3/6", "Partido en  Villalba a las 12:00)"},
				{" @IgnacioPerez", "Futbol", "20/02/2022", "10/22", "dnadnsioasudsausduasud"},
			},
			new String[] {
				"Creador", "Deporte", "Fecha", "Participantes", "Nombre Evento"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(4).setPreferredWidth(220);
		for (int i = 0; i < 3; i++) {
			table.getColumnModel().getColumn(i).setMinWidth(110);
		}
		table.setRowHeight(65);
		table.setBounds(96, 58, 809, 285);

		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(202, 51, 622, 238);
		panelPaginaPrincipal.add(scrollPaneEventos);
		scrollPaneEventos.setViewportView(table);

		btnUnirseEvento = new JButton("Unirse ");
		btnUnirseEvento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUnirseEvento.setForeground(Color.WHITE);
		btnUnirseEvento.setBorder(null);

		btnUnirseEvento.setBackground(new Color(53, 187, 95));
		btnUnirseEvento.setBounds(735, 300, 89, 23);
		panelPaginaPrincipal.add(btnUnirseEvento);
	}
	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}