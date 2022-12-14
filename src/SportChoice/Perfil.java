package SportChoice;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Perfil extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel header;
	private JLabel lblUsername, lblNombre, lblFotoPerfil, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6,
			lblNewLabel_7, lblNewLabel_8, lblUbicacion, lblSexo, lblEdad, lblDeporte, lblLikes,
			lblDescripcion;
	private JTextArea txtDescripcion;
	private JButton btnLogo, btnEditarPerfil, btnHistorial, btnPuntitos, btnLogOut, btnFAQs;
	private JLabel lblPerfil_1;
	private String usuario = "";
	private JLabel lblUsuarioArroba;

	public static void Perfil() {
		Perfil window = new Perfil();
		window.setVisible(true);
	}

	public Perfil() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Perfil");
		getContentPane().setLayout(null);

		header = new JPanel();
		header.setBorder(null);
		header.setBackground(new Color(57, 62, 70));
		header.setBounds(0, 0, 837, 100);
		getContentPane().add(header);
		header.setLayout(null);
		
		lblUsername = new JLabel("INVITADO");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBounds(618, 28, 123, 28);
		header.add(lblUsername);

		lblNombre = new JLabel("Luis Rodriguez Gonzalez");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(547, 52, 194, 28);
		header.add(lblNombre);

		lblFotoPerfil = new JLabel("");
		lblFotoPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoPerfil.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/appppp-modified.png")));
		lblFotoPerfil.setBounds(736, 0, 101, 100);
		header.add(lblFotoPerfil);

		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBorder(null);
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(30, 15, 114, 68);
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 11);
				esconderPuntitos();
			}
		});
		header.add(btnLogo);
		
		lblUsuarioArroba = new JLabel("@");
		lblUsuarioArroba.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioArroba.setForeground(new Color(255, 255, 255));
		lblUsuarioArroba.setBounds(594, 28, 17, 28);
		header.add(lblUsuarioArroba);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(
				new ImageIcon(Perfil.class.getResource("/Imagenes/marker-free-icon-font (1) (1) (1) (1).png")));
		lblNewLabel_3.setBounds(55, 147, 33, 33);
		getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/venus-mars-free-icon-font (1).png")));
		lblNewLabel_4.setBounds(55, 190, 33, 33);
		getContentPane().add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/calendar-free-icon-font (1).png")));
		lblNewLabel_5.setBounds(258, 147, 33, 33);
		getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/basketball-free-icon-font (1).png")));
		lblNewLabel_6.setBounds(258, 190, 33, 33);
		getContentPane().add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/thumbs-up-free-icon-font (1).png")));
		lblNewLabel_7.setBounds(454, 147, 33, 33);
		getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/document-free-icon-font (1).png")));
		lblNewLabel_8.setBounds(55, 233, 33, 33);
		getContentPane().add(lblNewLabel_8);

		lblUbicacion = new JLabel("ESPA\u00D1A, MADRID");
		lblUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUbicacion.setForeground(Color.WHITE);
		lblUbicacion.setBackground(null);
		lblUbicacion.setBounds(89, 147, 145, 33);
		getContentPane().add(lblUbicacion);

		lblSexo = new JLabel("HOMBRE");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setBounds(89, 190, 145, 33);
		getContentPane().add(lblSexo);

		lblEdad = new JLabel("19 anos");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEdad.setBounds(299, 147, 145, 33);
		getContentPane().add(lblEdad);

		lblDeporte = new JLabel("BALONCESTO");
		lblDeporte.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDeporte.setForeground(Color.WHITE);
		lblDeporte.setBounds(299, 190, 145, 33);
		getContentPane().add(lblDeporte);

		lblLikes = new JLabel("125");
		lblLikes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLikes.setForeground(Color.WHITE);
		lblLikes.setBounds(497, 147, 145, 33);
		getContentPane().add(lblLikes);

		lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(89, 233, 145, 33);
		getContentPane().add(lblDescripcion);

		txtDescripcion = new JTextArea();
		txtDescripcion.setEditable(false);
		txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescripcion.setForeground(Color.WHITE);
		txtDescripcion.setText(
				"Soy una persona un tanto egocentrica, me gusta la perfeccion en todos los ambitos posibles.En\r\ncuanto a los deprotes me considero un jugador con una deportividad ejemplar, no destaco\r\nen ningun deporte sinembargo, tento en baloncesto como en padel considero que estoy por\r\nencima de la media.\r\nMe uno a esta app para encontrar compa\u00F1eros con los que poder jugar partidos y porque \r\nno entablar alguna que otra amistad.");
		txtDescripcion.setBackground(new Color(34, 40, 49));
		txtDescripcion.setBounds(55, 276, 593, 113);
		getContentPane().add(txtDescripcion);

		btnPuntitos = new JButton("");
		btnPuntitos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPuntitos.setBounds(741, 110, 85, 41);
		getContentPane().add(btnPuntitos);
		btnPuntitos.setBorder(null);
		btnPuntitos.setBackground(null);
		btnPuntitos.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/puntitos32.png")));

		btnEditarPerfil = new JButton("EDITAR PERFIL");
		btnEditarPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditarPerfil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEditarPerfil.setForeground(Color.WHITE);
		btnEditarPerfil.setBackground(new Color(156, 163, 219));
		btnEditarPerfil.setBorder(null);
		btnEditarPerfil.setBounds(697, 161, 123, 33);
		getContentPane().add(btnEditarPerfil);
		btnEditarPerfil.setVisible(false);
		btnEditarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 3);
				esconderPuntitos();
			}
		});

		btnHistorial = new JButton("HISTORIAL");
		btnHistorial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHistorial.setForeground(Color.WHITE);
		btnHistorial.setBorder(null);
		btnHistorial.setBackground(new Color(156, 163, 219));
		btnHistorial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHistorial.setBounds(697, 204, 123, 33);
		getContentPane().add(btnHistorial);
		btnHistorial.setVisible(false);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 6);
				esconderPuntitos();
			}
		});

		btnLogOut = new JButton("LOG OUT");
		btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBorder(null);
		btnLogOut.setBackground(new Color(156, 163, 219));
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogOut.setBounds(697, 290, 123, 33);
		getContentPane().add(btnLogOut);
		btnLogOut.setVisible(false);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 7);
				esconderPuntitos();
			}
		});

		btnFAQs = new JButton("FAQS");
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground(new Color(156, 163, 219));
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFAQs.setBounds(697, 247, 123, 33);
		getContentPane().add(btnFAQs);

		lblPerfil_1 = new JLabel("PERFIL");
		lblPerfil_1.setForeground(Color.WHITE);
		lblPerfil_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPerfil_1.setBounds(39, 111, 248, 33);
		getContentPane().add(lblPerfil_1);
		btnFAQs.setVisible(false);
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 4);
				esconderPuntitos();
			}
		});

		btnPuntitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHistorial.isVisible() && btnEditarPerfil.isVisible() && btnLogOut.isVisible()) {
					esconderPuntitos();
				} else {
					btnHistorial.setVisible(true);
					btnEditarPerfil.setVisible(true);
					btnFAQs.setVisible(true);
					btnLogOut.setVisible(true);
				}

			}
		});
		
		 /*
		 * usr, nombre, apellido, email, pwd, Fecha_nac, FotoPerfil,
		 * descripcion, DeporteFav, valoraciones, cod_recuperacion, rol
		 */
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				lblUsername.setText(miModelo.getDatosUsuario().get("usr"));
				lblNombre.setText(miModelo.getDatosUsuario().get("nombre") + " " + miModelo.getDatosUsuario().get("apellido"));
				txtDescripcion.setText(miModelo.getDatosUsuario().get("descripcion"));
				lblLikes.setText(miModelo.getDatosUsuario().get("valoraciones"));
				lblDeporte.setText(miModelo.getDatosUsuario().get("DeporteFav"));
				lblEdad.setText(miModelo.getDatosUsuario().get("Fecha_nac"));
				lblSexo.setText(miModelo.getDatosUsuario().get("genero"));
				lblUbicacion.setText(miModelo.getDatosUsuario().get("localidad"));
//				lblFotoPerfil.setText(miModelo.getDatosUsuario().get("FotoPerfil"));
			}
		});
		
		
	}

	private void esconderPuntitos() {
		btnHistorial.setVisible(false);
		btnEditarPerfil.setVisible(false);
		btnFAQs.setVisible(false);
		btnLogOut.setVisible(false);
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

}