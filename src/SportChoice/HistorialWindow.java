package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miModelo.cargarTabla("historialWindow");
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

}