package SportChoice;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class HistorialWindow {

	private JFrame frame;
	private JTable table;
	private JPanel panelMain;
	private JScrollPane scrollPane;
	private JButton btnNewButton;

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
		frame.setTitle("Sport Choice - Historial de eventos");
		frame.setResizable(false);
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(34, 40, 49));
		panelMain.setBounds(0, 100, 834, 343);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);

		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
//				{"Creador", "Fecha", "Participantes", "Resultado", "Descripcion"},
				{"@PedroJuarez", "12/02/2022", "14", "10 | 2     Victoria", "Partido F�tbol Villalba"},
				{"@BenitoPerez", "17/02/2022", "4", "6 | 3     Victoria", "Tenis Polideportivo Moralzarzal"},
				{"@JuanAlvarez", "22/02/2022", "14", "82 | 78     Victoria", "Baloncesto Polideportivo Moralzarzal"},
				{"@BenitoPerez", "28/02/2022", "2", "3 | 3     Empate", "Tenis Polideportivo Moralzarzal"},
				{"@PedroJuarez", "03/03/2022", "22", "3 | 5     Derrota", "Partido F�tbol Villalba"},
				{"@JuanAlvarez", "12/03/2022", "17", "2 | 5     Derrota", "Partido F�tbol"},
				{"@PedroJuarez", "12/02/2022", "14", "2 | 5     Derrota", "Partido F�tbol Polideportivo Villalba"},
				{"@BenitoPerez", "12/02/2022", "8", "5 | 2     Victoria", "Tenis Polideportivo Moralzarzal"},
				{"@PedroJuarez", "12/02/2022", "10", "10 | 2     Victoria", "Partido F�tbol 7"},
				{"@PedroJuarez", "12/02/2022", "12", "10 | 2     Victoria", "Partido F�tbol 7"},
				{"@JuanAlvarez", "15/03/2022", "5", "3 | 2     Victoria", "Padel Polideportivo Moralzarzal"},
				{"@BenitoPerez", "23/03/2022", "15", "44 | 32     Victoria", "Baloncesto Polideportivo Villalba"},
				{null, null, null, null}
			},
			new String[] {
				"Creador", "Fecha", "Participantes", "Resultado", "Nombre"
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
		scrollPane.setBounds(38, 48, 652, 274);
		panelMain.add(scrollPane);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/arrow.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground((Color) null);
		btnNewButton_1.setBounds(0, 0, 47, 37);
		panelMain.add(btnNewButton_1);
		
		JLabel lblHistorialDeEventos = new JLabel("Historial De Eventos");
		lblHistorialDeEventos.setForeground(Color.WHITE);
		lblHistorialDeEventos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHistorialDeEventos.setBounds(57, 6, 276, 23);
		panelMain.add(lblHistorialDeEventos);
		
		btnNewButton = new JButton("Valorar");
		btnNewButton.setBackground(new Color(53, 187, 95));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(709, 292, 103, 30);
		panelMain.add(btnNewButton);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panelHeader);
		
		JButton btnLogo_1 = new JButton("");
		btnLogo_1.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo_1);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setToolTipText("");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground((Color) null);
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);
		
		JButton btnFAQs = new JButton("FAQs");
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		JButton btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/home-48.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(28, 21, 64, 68);
		panelHeader.add(btnLogo);

	}
}