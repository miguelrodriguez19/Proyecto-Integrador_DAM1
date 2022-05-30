package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
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
		panel_1.setBounds(20, 10, 706, 50);
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
		txtEscribeAqui.setText("Escribe aqui\r\n");
		txtEscribeAqui.setBounds(20, 360, 591, 57);
		getContentPane().add(txtEscribeAqui);
		txtEscribeAqui.setColumns(10);

		JButton btnNewButton = new JButton("Enviar\r\n");
		btnNewButton.setBounds(616, 360, 110, 57);
		getContentPane().add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 66, 706, 271);
		getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setRowHeight(50);
		table.setModel(new DefaultTableModel(
				new Object[][] { { "@Dogue_Drake", "Hola,yo llevo el balon", "18-05-2022ljohubdfkuhgshgdk" },
						{ "@Juanito99", "Genial gracias!", "18-05-2022" },
						{ "@Pedro_ppr", "El tema de las equipaciones?", "18-05-2022" },
						{ "@Maria889", "Llevamos camisetas azules y blancas", "18-05-2022" },
						{ "@Maria889", "Llevamos camisetas azules y blancas", "18-05-2022" },
						{ "@Maria889", "Llevamos camisetas azules y blancas", "18-05-2022" },
						{ "@Maria889", "Llevamos camisetas azules y blancas", "18-05-2022" }, },
				new String[] { "Nombre", "Mensaje", "Fecha" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(78);
		table.getColumnModel().getColumn(0).setMinWidth(78);
		table.getColumnModel().getColumn(1).setPreferredWidth(204);
		table.getColumnModel().getColumn(1).setMinWidth(59);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}