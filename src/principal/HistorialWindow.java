package principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class HistorialWindow {

	private JFrame frame;
	private JButton btnFAQs;
	private JButton btnPerfil;
	private JButton btnProfileIcon;
	private JButton btnHomeIcon;
	private JButton btnBackIcon;
	private JLabel lblHistorialTitle;
	private JTable table;
	private JPanel panelHeader;
	private JPanel panelMain;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void HistorialWindow() {
		HistorialWindow window = null;
		try {
			window = new HistorialWindow();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		window.frame.setVisible(true);
	}

	public HistorialWindow() throws IOException {

		frame = new JFrame();
		frame.setBounds(100, 100, 850, 480);
		frame.setMaximizedBounds(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		panelHeader = new JPanel();
		panelHeader.setForeground(Color.WHITE);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 836, 100);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		btnHomeIcon = new JButton("");
		btnHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHomeIcon.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/home-48.png")));
		btnHomeIcon.setBounds(20, 12, 58, 74);
		btnHomeIcon.setBackground(null);
		btnHomeIcon.setBorder(null);
		panelHeader.add(btnHomeIcon);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFAQs.setBorder(null);
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(519, 37, 85, 21);
		panelHeader.add(btnFAQs);
		
		btnPerfil = new JButton("Perfil");
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBounds(614, 37, 85, 21);
		btnPerfil.setBackground(null);
		panelHeader.add(btnPerfil);

		btnProfileIcon = new JButton("");
		btnProfileIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProfileIcon.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnProfileIcon.setBounds(722, 12, 73, 76);
		btnProfileIcon.setBackground(null);
		btnProfileIcon.setBorder(null);
		panelHeader.add(btnProfileIcon);
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(34, 40, 59));
		panelMain.setBounds(0, 100, 836, 343);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
	
		btnBackIcon = new JButton("");
		btnBackIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBackIcon.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/arrow.png")));
		btnBackIcon.setBounds(0, 0, 50, 50);
		btnBackIcon.setBackground(null);
		btnBackIcon.setBorder(null);
		panelMain.add(btnBackIcon);


		lblHistorialTitle = new JLabel("Historial");
		lblHistorialTitle.setBounds(391, 10, 118, 41);
		panelMain.add(lblHistorialTitle);
		lblHistorialTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblHistorialTitle.setForeground(new Color(238, 238, 238));

		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
//				{"Creador", "Fecha", "Participantes", "Resultado", "Descripcion"},
				{"@PedroJuarez", "12/02/2022", "14", "10 | 2     Victoria", "Partido Fútbol Villalba"},
				{"@BenitoPerez", "17/02/2022", "4", "6 | 3     Victoria", "Tenis Polideportivo Moralzarzal"},
				{"@JuanAlvarez", "22/02/2022", "14", "82 | 78     Victoria", "Baloncesto Polideportivo Moralzarzal"},
				{"@BenitoPerez", "28/02/2022", "2", "3 | 3     Empate", "Tenis Polideportivo Moralzarzal"},
				{"@PedroJuarez", "03/03/2022", "22", "3 | 5     Derrota", "Partido Fútbol Villalba"},
				{"@JuanAlvarez", "12/03/2022", "17", "2 | 5     Derrota", "Partido Fútbol"},
				{"@PedroJuarez", "12/02/2022", "14", "2 | 5     Derrota", "Partido Fútbol Polideportivo Villalba"},
				{"@BenitoPerez", "12/02/2022", "8", "5 | 2     Victoria", "Tenis Polideportivo Moralzarzal"},
				{"@PedroJuarez", "12/02/2022", "10", "10 | 2     Victoria", "Partido Fútbol 7"},
				{"@PedroJuarez", "12/02/2022", "12", "10 | 2     Victoria", "Partido Fútbol 7"},
				{"@JuanAlvarez", "15/03/2022", "5", "3 | 2     Victoria", "Padel Polideportivo Moralzarzal"},
				{"@BenitoPerez", "23/03/2022", "15", "44 | 32     Victoria", "Baloncesto Polideportivo Villalba"},
				{null, null, null, null}
			},
			new String[] {
				"Creador", "Fecha", "Participantes", "Resultado", "Descripcion"
			}
		) {
			//
			boolean[] columnEditables = new boolean[] {
				true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
//		table.getColumnModel().getColumn(4).setPreferredWidth(720);
		table.setRowHeight(60);
		table.setBounds(96, 58, 709, 285);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 58, 709, 285);
		panelMain.add(scrollPane);
		scrollPane.setViewportView(table);

	}
}