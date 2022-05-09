package principal;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class MainPage {
	private JFrame frame;
	private JTextField txtLocalidad;
	private JButton btnFAQs, btnPerfil, btnCrearEVentos, btnAplicarFiltros, btnEventosRecientes, btnMisEventos;
	private JLabel lblLogo, lblUsuarioIcono, lblNewLabel;
	private JPanel panelHeader, panelUsuarioIcono, panelLogoIcono, panelPaginaPrincipal;
	private JComboBox comboBoxDeportes, comboBoxDia, comboBoxMes;
	private JScrollPane scrollPaneEventos;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MainPage mainPage = new MainPage();
		mainPage.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
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
		
		btnPerfil = new JButton("Perfil");
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setBorder(null);
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(new Color(57, 62, 70, 0));
		btnPerfil.setToolTipText("");
		btnPerfil.setBounds(672, 43, 64, 23);
		panelHeader.add(btnPerfil);
		
		btnFAQs = new JButton("FAQs");
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setBorder(null);
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(new Color(57, 62, 70, 0));
		btnFAQs.setBounds(598, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		panelLogoIcono = new JPanel();
		panelLogoIcono.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelLogoIcono.setBounds(10, 11, 78, 78);
		panelHeader.add(panelLogoIcono);
		panelLogoIcono.setLayout(null);
		
		lblLogo = new JLabel("<!>Logo<!>");
		lblLogo.setBounds(7, 32, 68, 14);
		panelLogoIcono.add(lblLogo);
		
		panelUsuarioIcono = new JPanel();
		panelUsuarioIcono.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelUsuarioIcono.setLayout(null);
		panelUsuarioIcono.setBounds(746, 11, 78, 78);
		panelHeader.add(panelUsuarioIcono);
		
		lblUsuarioIcono = new JLabel("<!>Icono<!>");
		lblUsuarioIcono.setBounds(6, 32, 68, 14);
		panelUsuarioIcono.add(lblUsuarioIcono);
		
		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34,40,49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		frame.getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);
		
		btnCrearEVentos = new JButton("Crear Eventos");
		btnCrearEVentos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearEVentos.setBorder(null);
		btnCrearEVentos.setForeground(Color.WHITE);
		btnCrearEVentos.setBackground(new Color(53, 187, 95));
		btnCrearEVentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearEVentos.setBounds(29, 5, 148, 30);
		panelPaginaPrincipal.add(btnCrearEVentos);
		
		lblNewLabel = new JLabel("Buscar por filtros: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(29, 51, 148, 29);
		panelPaginaPrincipal.add(lblNewLabel);
		
		comboBoxDeportes = new JComboBox();
		comboBoxDeportes.setModel(new DefaultComboBoxModel(new String[] {"Deportes", "Futbol", "Baloncesto", "Tenis"}));
		comboBoxDeportes.setBounds(29, 77, 148, 22);
		panelPaginaPrincipal.add(comboBoxDeportes);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMes.setBounds(118, 110, 59, 22);
		panelPaginaPrincipal.add(comboBoxMes);
		
		comboBoxDia = new JComboBox();
		comboBoxDia.setBackground(Color.WHITE);
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
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
		
		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(202, 51, 622, 277);
		panelPaginaPrincipal.add(scrollPaneEventos);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Eventos"
			}
		));
		scrollPaneEventos.setViewportView(table);
	}
}
