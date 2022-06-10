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
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class AdministradorEventos extends JFrame {

	private JFrame frame;
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnEventos;
	private JButton btnUsuarios;
	private JButton btnlogOut;
	private JButton btnBorrar;
	private JLabel lblNewLabel;
	private JTable table;
	private JButton btnBajarArchivo;
	private JButton btnSubirArchivos;
	private JScrollPane scrollPaneEventos;

	/**
	 * Launch the application.
	 */
	public static void AdministradorEventos() {
		AdministradorEventos window = new AdministradorEventos();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public AdministradorEventos() {
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

		btnEventos = new JButton("Eventos");
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(18, 18);
			}
		});
		btnEventos.setSelected(true);
		btnEventos.setForeground(Color.WHITE);
		btnEventos.setBorder(null);
		btnEventos.setBackground(new Color(156, 163, 219));
		btnEventos.setBounds(174, 28, 244, 40);
		panel.add(btnEventos);

		btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(18, 19);
			}
		});
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setBorder(null);
		btnUsuarios.setBackground(new Color(129, 136, 212));
		btnUsuarios.setBounds(420, 28, 261, 40);
		panel.add(btnUsuarios);

		scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(174, 78, 507, 340);
		panel.add(scrollPaneEventos);
		
		table = new JTable();
		table.setRowHeight(55);
		scrollPaneEventos.setViewportView(table);
		
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBorrar.setEnabled(false);
		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setBorder(null);
		btnBorrar.setBackground(Color.RED);
		btnBorrar.setBounds(701, 386, 112, 30);
		panel.add(btnBorrar);

		lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(AdministradorEventos.class.getResource("/Imagenes/logoSportChoice.png")));
		lblNewLabel.setBounds(30, 28, 109, 54);
		panel.add(lblNewLabel);

		btnlogOut = new JButton("LogOut");
		btnlogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnlogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(18, 7);
			}
		});
		btnlogOut.setForeground(Color.WHITE);
		btnlogOut.setBorder(null);
		btnlogOut.setBackground(new Color(156, 163, 219));
		btnlogOut.setBounds(701, 28, 112, 30);
		panel.add(btnlogOut);
		
		btnBajarArchivo = new JButton("");
		btnBajarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
//		btnBajarArchivo.setIcon(new ImageIcon(AdministradorEventos.class.getResource("/Imagenes/folder-download-free-icon-font (1).png.png")));
		btnBajarArchivo.setBounds(701, 355, 85, 21);
		btnBajarArchivo.setBackground(null);
		panel.add(btnBajarArchivo);
		btnBajarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(miModelo.cargarObjeto(scrollPaneEventos));
				System.out.println("Settear tabla desde fichero");
			}
		});
		
		btnSubirArchivos = new JButton("");
		btnSubirArchivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.guardarObjeto(table);
			}
		});
//		btnSubirArchivos.setIcon(new ImageIcon(AdministradorEventos.class.getResource("/Imagenes/folder-upload-free-icon-font (1).png")));
		btnSubirArchivos.setBounds(701, 324, 85, 21);
		btnSubirArchivos.setBackground(null);
		panel.add(btnSubirArchivos);

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				miModelo.cargarTabla("eventosAdministrador");
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
