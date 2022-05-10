package principal;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MisEventos {
	private JFrame frame;
	private JTextField txtLocalidad;
	private JButton btnFAQs, btnPerfil, btnCrearEventos, btnAplicarFiltros, btnEventosRecientes, btnMisEventos;
	private JLabel lblFiltros;
	private JPanel panelHeader, panelPaginaPrincipal;
	private JComboBox comboBoxDeportes, comboBoxDia, comboBoxMes;
	private JScrollPane scrollPaneEventos;
	private JTable table;
	private JButton btnUnirseEvento, btnHouse;
	private JButton btnEditarEvento;
	private JButton btnEliminarEvento;
	private JButton btnPerfilFoto;

	public static void main(String[] args) {
		MisEventos mainPage = new MisEventos();
		mainPage.frame.setVisible(true);
	}

	public MisEventos() {
		frame = new JFrame();
		frame.setResizable(false);
		Container contenedor = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contenedor.setLayout(null);

		panelHeader = new JPanel();
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);
		
		btnPerfilFoto = new JButton("");
		btnPerfilFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfilFoto.setIcon(new ImageIcon(MisEventos.class.getResource("/Imagenes/appppp-modified.png")));
		btnPerfilFoto.setBorder(null);
		btnPerfilFoto.setBackground((Color) null);
		btnPerfilFoto.setBounds(718, 0, 99, 100);
		panelHeader.add(btnPerfilFoto);

		btnPerfil = new JButton("Perfil");
		btnPerfil.setBorder(null);
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(null);
		btnPerfil.setToolTipText("");
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setBorder(null);
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		btnHouse = new JButton("");
		btnHouse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHouse.setBorder(null);
		btnHouse.setBackground(null);
		btnHouse.setIcon(new ImageIcon(MisEventos.class.getResource("/Imagenes/home-48.png")));
		btnHouse.setBounds(28, 21, 64, 68);
		panelHeader.add(btnHouse);

		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34, 40, 49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		frame.getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);

		btnCrearEventos = new JButton("Crear Eventos");
		btnCrearEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearEventos.setBorder(null);
		btnCrearEventos.setForeground(Color.WHITE);
		btnCrearEventos.setBackground(new Color(53, 187, 95));
		btnCrearEventos.setBounds(29, 5, 148, 30);
		panelPaginaPrincipal.add(btnCrearEventos);

		lblFiltros = new JLabel("Buscar por filtros: ");
		lblFiltros.setForeground(Color.WHITE);
		lblFiltros.setBounds(29, 51, 148, 29);
		panelPaginaPrincipal.add(lblFiltros);

		comboBoxDeportes = new JComboBox();
		comboBoxDeportes
				.setModel(new DefaultComboBoxModel(new String[] { "Deportes", "Futbol", "Baloncesto", "Tenis" }));
		comboBoxDeportes.setBounds(29, 77, 148, 22);
		panelPaginaPrincipal.add(comboBoxDeportes);

		comboBoxMes = new JComboBox();
		comboBoxMes.setModel(new DefaultComboBoxModel(
				new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBoxMes.setBounds(118, 110, 59, 22);
		panelPaginaPrincipal.add(comboBoxMes);

		comboBoxDia = new JComboBox();
		comboBoxDia.setBackground(Color.WHITE);
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
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
		btnEventosRecientes.setBackground(new Color(156, 163, 219));
		btnEventosRecientes.setBounds(202, 0, 310, 40);
		panelPaginaPrincipal.add(btnEventosRecientes);

		btnMisEventos = new JButton("Mis Eventos");
		btnMisEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMisEventos.setForeground(Color.WHITE);
		btnMisEventos.setBorder(null);
		btnMisEventos.setBackground(new Color(129, 136, 212));
		btnMisEventos.setBounds(514, 0, 310, 40);
		panelPaginaPrincipal.add(btnMisEventos);

		table = new JTable();
		table.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setPreferredScrollableViewportSize(new Dimension(400, 400));
		table.setIntercellSpacing(new Dimension(5, 1));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" @IgnacioPerez", "Futbol", "20/02/2022", "5/12", "dnadnsioasudsausduasud"},
				{" @LuisGonzalez", "Baloncesto", "2/03/2022", "12/12", "Pachanguita baloncesto en el polideeportivo de Moralzarzal a las 9 am"},
				{" @MiguelRod", "Padel", "29/02/2022", "3/6", "Partido en polideportivo de Villalba a las 12:00 de la ma\u00F1ana, espero que nos divirtamos : )"},
				{" @IgnaciPerez", "Futbol", "20/02/2022", "10/22", "dnadnsioasudsausduasud"},
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
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(220);
		for (int i = 0; i < 3; i++) {
			table.getColumnModel().getColumn(i).setMinWidth(110);
		}
		table.setRowHeight(65);
		table.setBounds(96, 58, 809, 285);

		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setAutoscrolls(true);
		scrollPaneEventos.setBounds(202, 51, 622, 238);
		panelPaginaPrincipal.add(scrollPaneEventos);
		scrollPaneEventos.setViewportView(table);

		btnUnirseEvento = new JButton("Ver Evento");
		btnUnirseEvento.setForeground(Color.WHITE);
		btnUnirseEvento.setBorder(null);
		btnUnirseEvento.setBackground(new Color(53, 187, 95));
		btnUnirseEvento.setBounds(735, 300, 89, 23);
		panelPaginaPrincipal.add(btnUnirseEvento);
		
		btnEditarEvento = new JButton("Editar Evento");
		btnEditarEvento.setForeground(Color.WHITE);
		btnEditarEvento.setBorder(null);
		btnEditarEvento.setBackground(new Color(217, 201, 62));
		btnEditarEvento.setBounds(636, 300, 89, 23);
		panelPaginaPrincipal.add(btnEditarEvento);
		
		btnEliminarEvento = new JButton("Eliminar");
		btnEliminarEvento.setForeground(Color.WHITE);
		btnEliminarEvento.setBorder(null);
		btnEliminarEvento.setBackground(new Color(223, 62, 60));
		btnEliminarEvento.setBounds(537, 300, 89, 23);
		panelPaginaPrincipal.add(btnEliminarEvento);
	}
}
