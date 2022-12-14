package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class Foro extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panel_1;
	private JTable table;
	private JTextField txtEscribeAqui;

	public static void Foro() {
		Foro window = new Foro();
		window.setVisible(true);
	}

	public Foro() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		getContentPane().setLayout(null);
		setBounds(100, 100, 750, 480);
		setTitle("Sport Choice - Foro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(15, 10, 706, 50);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnX = new JButton("");
		btnX.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/x.png")));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(5, 17);
			}
		});
		btnX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnX.setBounds(663, 15, 20, 20);
		panel_1.add(btnX);
		btnX.setBorder(null);
		btnX.setBackground(null);

		JLabel lblNewLabel_5 = new JLabel("PARTIDO FUTBOL COLEGAS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 15, 302, 20);
		panel_1.add(lblNewLabel_5);

		txtEscribeAqui = new JTextField();
		String mensajeChat = "Escribe aqui";
		txtEscribeAqui.setText(mensajeChat);
		txtEscribeAqui.setBounds(15, 360, 591, 57);
		getContentPane().add(txtEscribeAqui);
		txtEscribeAqui.setColumns(10);
		txtEscribeAqui.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEscribeAqui.getText().equals(mensajeChat))
					txtEscribeAqui.setText("");
				txtEscribeAqui.setForeground(Color.BLACK);
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtEscribeAqui.getText().equals("")) {
					txtEscribeAqui.setText(mensajeChat);
					txtEscribeAqui.setForeground(Color.GRAY);
				}
			}
		});

		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(611, 360, 110, 57);
		btnNewButton.setBackground(new Color(156, 163, 219));
		btnNewButton.setBorder(null);
		getContentPane().add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 69, 706, 271);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setRowHeight(50);
		
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowActivated(WindowEvent e) {
//				miModelo.cargarTabla("foro");
//				table.setModel(miModelo.getTabla());
//			}
//		});
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}