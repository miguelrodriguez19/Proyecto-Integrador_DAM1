package SportChoice;

import java.awt.Container;
import java.awt.Cursor;
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
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AdministradorUsuarios extends JFrame {

	private JFrame frame;
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnEventos;
	private JButton btnUsuarios;
	private JLabel lblNewLabel;
	private JButton btnBanear;
	private JButton btnNewButton_1;
	private JTable table;
	private JButton btnSubirArchivo;
	private JButton btnSubirArchivo_1;
	private JButton btnBajarArchivo;
	private String UsuarioSeleccionado;

	/**
	 * Launch the application.
	 */
	public static void AdministradorUsuarios() {
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

		btnEventos = new JButton("EVENTOS");
		btnEventos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(19, 18);
			}
		});
		btnEventos.setSelected(true);
		btnEventos.setForeground(Color.WHITE);
		btnEventos.setBorder(null);
		btnEventos.setBackground(new Color(129, 136, 212));
		btnEventos.setBounds(174, 28, 244, 40);
		panel.add(btnEventos);

		btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(19, 18);
			}
		});
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setBorder(null);
		btnUsuarios.setBackground(new Color(156, 163, 219));
		btnUsuarios.setBounds(420, 28, 261, 40);
		panel.add(btnUsuarios);

		JScrollPane scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(174, 78, 507, 340);
		panel.add(scrollPaneEventos);

		table = new JTable();
		table.setRowHeight(55);
		scrollPaneEventos.setViewportView(table);
		table.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				UsuarioSeleccionado = table.getValueAt(table.getSelectedRow(), 0).toString();
				btnBanear.setEnabled(true);
			}
		});

<<<<<<< HEAD
		btnNewButton = new JButton("BANEAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(701, 386, 112, 30);
		panel.add(btnNewButton);
=======
		btnBanear = new JButton("Banear");
		btnBanear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.Banear(UsuarioSeleccionado);
			}
		});
		btnBanear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBanear.setEnabled(false);
		btnBanear.setForeground(Color.WHITE);
		btnBanear.setBorder(null);
		btnBanear.setBackground(Color.RED);
		btnBanear.setBounds(701, 386, 112, 30);
		panel.add(btnBanear);
>>>>>>> refs/remotes/origin/LuisRama2

		lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(AdministradorUsuarios.class.getResource("/Imagenes/logoSportChoice.png")));
		lblNewLabel.setBounds(30, 28, 109, 54);
		panel.add(lblNewLabel);

		btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(19, 7);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(156, 163, 219));
		btnNewButton_1.setBounds(701, 28, 109, 30);
		panel.add(btnNewButton_1);

		btnBajarArchivo = new JButton("UPLOAD");
		btnBajarArchivo.setIcon(
				new ImageIcon(AdministradorUsuarios.class.getResource("/Imagenes/upload-file-svgrepo-com (1).png")));
//		btnBajarArchivo.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				miModelo.cargar(rutaFichero);
//			}
//		});

		btnBajarArchivo.setBounds(701, 312, 112, 64);
		btnBajarArchivo.setBackground(null);
		panel.add(btnBajarArchivo);
		btnBajarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table = (JTable) miModelo.cargarObjeto(scrollPaneEventos);
				System.out.println("pat");
			}
		});

		btnSubirArchivo = new JButton("");
		btnSubirArchivo_1 = new JButton("SAVE");
		btnSubirArchivo_1.setIcon(
				new ImageIcon(AdministradorUsuarios.class.getResource("/Imagenes/download-file-svgrepo-com (1).png")));
		btnSubirArchivo_1.setBounds(701, 251, 112, 54);
		btnSubirArchivo_1.setBackground(null);
		panel.add(btnSubirArchivo_1);
		btnSubirArchivo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.guardarObjeto(table);
			}
		});

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miModelo.cargarTabla("usuariosAdministrador");
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

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}