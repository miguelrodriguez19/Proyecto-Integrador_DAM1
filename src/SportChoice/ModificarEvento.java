package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import com.toedter.calendar.JCalendar;

public class ModificarEvento extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panelHeader;
	private JTextField txtNombre, txtLocalizacion;
	private JRadioButton rdbtnPublico, rdbtnPrivado;
	private JComboBox comboBox_deporte;
	private JLabel lblNombreEvento, lblDeporteFutbol, lblTipoEvento,
			lblFechaEvento, lblDescripcin, lblLocalizacion, lblCrearEvento;
	private JButton btnPerfil, btnCrear, btnEliminar, btnLogo, btnPerfil_1, btnFAQs;
	private JButton btnLogo_1;
	private JButton btnAtras;

	public static void ModificarEvento() {

		ModificarEvento window = new ModificarEvento();
		window.setVisible(true);

	}

	public ModificarEvento() {
		initialize();
	}
		
	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor =getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Modificar evento");
		getContentPane().setLayout(null);

		lblNombreEvento = new JLabel("NOMBRE");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(40, 143, 94, 23);
		getContentPane().add(lblNombreEvento);

		txtNombre = new JTextField();
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setText("Partido Futbol");
		txtNombre.setColumns(10);
		txtNombre.setBounds(110, 144, 214, 25);
		getContentPane().add(txtNombre);

		lblDeporteFutbol = new JLabel("DEPORTE");
		lblDeporteFutbol.setForeground(Color.WHITE);
		lblDeporteFutbol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteFutbol.setBounds(40, 178, 101, 23);
		getContentPane().add(lblDeporteFutbol);

		comboBox_deporte = new JComboBox();
		comboBox_deporte.setModel(new DefaultComboBoxModel(new String[] { "Deportes", "Futbol", "Baloncesto", "Tenis" }));
		comboBox_deporte.setBounds(162, 179, 162, 21);
		getContentPane().add(comboBox_deporte);

		lblTipoEvento = new JLabel("VISIBILIDAD");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(40, 208, 94, 23);
		getContentPane().add(lblTipoEvento);

		lblFechaEvento = new JLabel("FECHA");
		lblFechaEvento.setForeground(Color.WHITE);
		lblFechaEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaEvento.setBounds(40, 242, 94, 23);
		getContentPane().add(lblFechaEvento);

		rdbtnPublico = new JRadioButton("PUBLICO");
		rdbtnPublico.setSelected(true);
		rdbtnPublico.setForeground(Color.WHITE);
		rdbtnPublico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPublico.setBackground((Color) null);
		rdbtnPublico.setBounds(162, 212, 88, 21);
		getContentPane().add(rdbtnPublico);

		rdbtnPrivado = new JRadioButton("PRIVADO");
		rdbtnPrivado.setEnabled(false);
		rdbtnPrivado.setForeground(Color.WHITE);
		rdbtnPrivado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnPrivado.setBackground((Color) null);
		rdbtnPrivado.setBounds(252, 212, 88, 21);
		getContentPane().add(rdbtnPrivado);

		lblDescripcin = new JLabel("DESCRIPCION");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcin.setBounds(387, 199, 101, 23);
		getContentPane().add(lblDescripcin);

		txtLocalizacion = new JTextField();
		txtLocalizacion.setText("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		txtLocalizacion.setForeground(Color.GRAY);
		txtLocalizacion.setColumns(10);
		txtLocalizacion.setBounds(387, 155, 426, 25);
		getContentPane().add(txtLocalizacion);

		lblLocalizacion = new JLabel("LOCALIZACION");
		lblLocalizacion.setForeground(Color.WHITE);
		lblLocalizacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacion.setBounds(387, 133, 113, 23);
		getContentPane().add(lblLocalizacion);

		lblCrearEvento = new JLabel("MODIFICAR EVENTO");
		lblCrearEvento.setForeground(Color.WHITE);
		lblCrearEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrearEvento.setBounds(76, 110, 287, 23);
		getContentPane().add(lblCrearEvento);

		btnEliminar = new JButton("CANCELAR");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 17);
			}
		});
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEliminar.setBorder(null);
		btnEliminar.setBackground(new Color(204, 0, 0));
		btnEliminar.setBounds(387, 372, 113, 40);
		getContentPane().add(btnEliminar);

		JTextPane txtPanelDescripcion = new JTextPane();
		txtPanelDescripcion.setForeground(Color.GRAY);
		txtPanelDescripcion.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos\r\nsuficientes. \r\nNecesitas llevar una botella de agua propia y dos camisetas, \r\nuna roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n\r\n");
		txtPanelDescripcion.setBounds(387, 225, 426, 135);
		getContentPane().add(txtPanelDescripcion);

		btnCrear = new JButton("CONFIRMAR");
		btnCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.actualizarEvento(txtNombre.getText(), comboBox_deporte.getSelectedItem().toString(), txtLocalizacion.getText(), txtPanelDescripcion.getText(), miModelo.getEventoSeleccionado());
				miControlador.actualizar(9, 17);
			}
		});
		btnCrear.setForeground(Color.WHITE);
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCrear.setBorder(null);
		btnCrear.setBackground(new Color(53, 187, 95));
		btnCrear.setBounds(700, 372, 113, 40);
		getContentPane().add(btnCrear);

		
		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 10);
			}
		});
		btnLogo.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);

		btnPerfil_1 = new JButton("PERFIL");
		btnPerfil_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPerfil_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 10);
			}
		});
		btnPerfil_1.setToolTipText("");
		btnPerfil_1.setForeground(Color.WHITE);
		btnPerfil_1.setBorder(null);
		btnPerfil_1.setBackground((Color) null);
		btnPerfil_1.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil_1);

		btnFAQs = new JButton("FAQS");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 4);
			}
		});
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		btnLogo_1 = new JButton("");
		btnLogo_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo_1.setIcon(new ImageIcon(ModificarEvento.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo_1);
		
		btnLogo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 11);
			}
		});
		
		btnAtras = new JButton("");
		btnAtras.setBorder(null);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(9, 17);
			}
		});
		btnAtras.setBackground(null);
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBounds(10, 100, 56, 39);
		getContentPane().add(btnAtras);
		
		JCalendar calendar = new JCalendar();
		calendar.setEnabled(false);
		calendar.setBounds(162, 249, 168, 111);
		getContentPane().add(calendar);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				String datos[] = miModelo.cargarDatosEvento(miModelo.getEventoSeleccionado());
				txtNombre.setText(datos[1]);
				txtLocalizacion.setText(datos[5]);
				txtPanelDescripcion.setText(datos[7]);
				switch (datos[4]) {
				case "Futbol":
					comboBox_deporte.setSelectedItem("Futbol");
					break;
				case "Baloncesto":
					comboBox_deporte.setSelectedItem("Baloncesto");
					break;
				case "Tenis":
					comboBox_deporte.setSelectedItem("Tenis");
					break;
				default:
					comboBox_deporte.setSelectedItem("Deportes");
					break;
				}
			
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