package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class HistorialWindow extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JTable table;
	private JPanel panelMain;
	private JScrollPane scrollPane;
	private JButton btnValorar, btnFotoPerfil, btnPerfil, btnFAQs, btnLogo;
	private JLabel lblHistorialDeEventos;
	private JButton btnAtras;

	public static void HistorialWindow() {
		HistorialWindow window = null;
		window = new HistorialWindow();
		window.setVisible(true);
	}

	public HistorialWindow() {

		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contenedor.setLayout(null);
		setTitle("Sport Choice - Historial de eventos");
		panelMain = new JPanel();
		panelMain.setBackground(new Color(34, 40, 49));
		panelMain.setBounds(0, 100, 834, 343);
		getContentPane().add(panelMain);
		panelMain.setLayout(null);

		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(new Object[][] {
//				{"Creador", "Fecha", "Participantes", "Resultado", "Descripcion"},
				{ "@PedroJuarez", "12/02/2022", "14", "10 | 2     Victoria", "Partido F�tbol Villalba" },
				{ "@BenitoPerez", "17/02/2022", "4", "6 | 3     Victoria", "Tenis Polideportivo Moralzarzal" },
				{ "@JuanAlvarez", "22/02/2022", "14", "82 | 78     Victoria", "Baloncesto Polideportivo Moralzarzal" },
				{ "@BenitoPerez", "28/02/2022", "2", "3 | 3     Empate", "Tenis Polideportivo Moralzarzal" },
				{ "@PedroJuarez", "03/03/2022", "22", "3 | 5     Derrota", "Partido F�tbol Villalba" },
				{ "@JuanAlvarez", "12/03/2022", "17", "2 | 5     Derrota", "Partido F�tbol" },
				{ "@PedroJuarez", "12/02/2022", "14", "2 | 5     Derrota", "Partido F�tbol Polideportivo Villalba" },
				{ "@BenitoPerez", "12/02/2022", "8", "5 | 2     Victoria", "Tenis Polideportivo Moralzarzal" },
				{ "@PedroJuarez", "12/02/2022", "10", "10 | 2     Victoria", "Partido F�tbol 7" },
				{ "@PedroJuarez", "12/02/2022", "12", "10 | 2     Victoria", "Partido F�tbol 7" },
				{ "@JuanAlvarez", "15/03/2022", "5", "3 | 2     Victoria", "Padel Polideportivo Moralzarzal" },
				{ "@BenitoPerez", "23/03/2022", "15", "44 | 32     Victoria", "Baloncesto Polideportivo Villalba" },
				{ null, null, null, null } },
				new String[] { "Creador", "Fecha", "Participantes", "Resultado", "Nombre" }) {
			//
			boolean[] columnEditables = new boolean[] { true, true, true, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
//		table.getColumnModel().getColumn(4).setPreferredWidth(720);
		table.setRowHeight(60);
		table.setBounds(96, 58, 709, 285);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 60, 652, 262);
		panelMain.add(scrollPane);
		scrollPane.setViewportView(table);

		btnValorar = new JButton("Valorar");
		btnValorar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValorar.setBackground(new Color(53, 187, 95));
		btnValorar.setBorder(null);
		btnValorar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 16);
			}
		});
		btnValorar.setForeground(Color.WHITE);
		btnValorar.setBounds(709, 292, 103, 30);
		panelMain.add(btnValorar);
		
		lblHistorialDeEventos = new JLabel("Historial de eventos");
		lblHistorialDeEventos.setForeground(Color.WHITE);
		lblHistorialDeEventos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHistorialDeEventos.setBounds(71, 18, 385, 23);
		panelMain.add(lblHistorialDeEventos);
		
		btnAtras = new JButton("");
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 10);
			}
		});
		btnAtras.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBorder(null);
		btnAtras.setBackground((Color) null);
		btnAtras.setBounds(10, 11, 56, 39);
		panelMain.add(btnAtras);
		btnValorar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 16);
			}
		});

		JPanel panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnFotoPerfil = new JButton("");
		btnFotoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFotoPerfil.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/appppp-modified.png")));
		btnFotoPerfil.setBorder(null);
		btnFotoPerfil.setBackground((Color) null);
		btnFotoPerfil.setBounds(718, 0, 99, 100);
		panelHeader.add(btnFotoPerfil);
		btnFotoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 10);
			}
		});

		btnPerfil = new JButton("Perfil");
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setToolTipText("");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground((Color) null);
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 10);
			}
		});

		btnFAQs = new JButton("FAQs");
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 11);
			}
		});
		btnLogo.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo);
		
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(6, 4);
			}
		});
	}
	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

}