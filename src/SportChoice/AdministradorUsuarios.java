package SportChoice;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdministradorUsuarios extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		AdministradorUsuarios window = new AdministradorUsuarios();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public AdministradorUsuarios() {
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Mis eventos");
		contenedor.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 40, 49));
		panel.setBounds(0, 0, 888, 864);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnEventos = new JButton("Eventos");
		btnEventos.setSelected(true);
		btnEventos.setForeground(Color.WHITE);
		btnEventos.setBorder(null);
		btnEventos.setBackground(new Color(129, 136, 212));
		btnEventos.setBounds(174, 28, 244, 40);
		panel.add(btnEventos);

		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setBorder(null);
		btnUsuarios.setBackground(new Color(156, 163, 219));
		btnUsuarios.setBounds(420, 28, 261, 40);
		panel.add(btnUsuarios);

		JScrollPane scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(174, 78, 507, 340);
		panel.add(scrollPaneEventos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPaneEventos.setViewportView(scrollPane);

		table = new JTable();
		table.setRowHeight(55);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" @PedroJuarez", "Futbol", "12/02/2022", null, "6/9"},
				{" @JuanPerez", "Futbol", "15/02/2022", null, "10/12"},
				{" @JuanPerez", "Tenis", "17/02/2022", null, "1/4"},
				{" @IgnacioPerez", "Futbol", "20/02/2022", null, "5/12"},
				{" @LuisGonzalez", "Baloncesto", "2/03/2022", null, "12/12"},
				{" @IgnacioPerez", "Futbol", "20/02/2022", null, "18/22"},
				{" @MiguelRod", "Padel", "29/02/2022", null, "3/6"},
				{" @IgnacioPerez", "Futbol", "20/02/2022", null, "10/22"},
			},
			new String[] {
				"Creador", "Nombre", "Apellidos", "Mail", "Reportes"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		JButton btnNewButton = new JButton("Banear");
		btnNewButton.setBounds(701, 386, 112, 30);
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(AdministradorUsuarios.class.getResource("/Imagenes/logoSportChoice.png")));
		lblNewLabel.setBounds(30, 28, 109, 54);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("LogOut");
		btnNewButton_1.setBounds(728, 28, 85, 30);
		panel.add(btnNewButton_1);

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
