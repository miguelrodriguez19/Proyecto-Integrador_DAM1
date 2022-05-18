package SportChoice;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Perfil extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel header;
	private JLabel lblNewLabel_1, lblNewLabel_2, lblNewLabel, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5,
			lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12,
			lblNewLabel_13, lblNewLabel_14;
	private JTextArea txtrFdsfsd;
	private JButton btnHome, btnEditarPerfil, btnHistorial, btnPuntitos, btnLogOut;

	
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

		lblNewLabel_1 = new JLabel("@DogueDrake");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(618, 28, 123, 28);
		header.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Luis Rodriguez Gonzalez");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(547, 52, 194, 28);
		header.add(lblNewLabel_2);

		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/appppp-modified.png")));
		lblNewLabel.setBounds(736, 0, 101, 100);
		header.add(lblNewLabel);

		btnHome = new JButton("");
		btnHome.setBorder(null);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBackground(new Color(57, 62, 70));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/home-48.png")));
		btnHome.setBounds(10, 10, 85, 70);
		header.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 11);
			}
		});

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(
				new ImageIcon(Perfil.class.getResource("/Imagenes/marker-free-icon-font (1) (1) (1) (1).png")));
		lblNewLabel_3.setBounds(55, 134, 33, 33);
		getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/venus-mars-free-icon-font (1).png")));
		lblNewLabel_4.setBounds(55, 177, 33, 33);
		getContentPane().add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/calendar-free-icon-font (1).png")));
		lblNewLabel_5.setBounds(258, 134, 33, 33);
		getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/basketball-free-icon-font (1).png")));
		lblNewLabel_6.setBounds(258, 177, 33, 33);
		getContentPane().add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/thumbs-up-free-icon-font (1).png")));
		lblNewLabel_7.setBounds(454, 134, 33, 33);
		getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/document-free-icon-font (1).png")));
		lblNewLabel_8.setBounds(55, 220, 33, 33);
		getContentPane().add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("Espa\u00F1a, Madid");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBackground(Color.GREEN);
		lblNewLabel_9.setBounds(89, 134, 145, 33);
		getContentPane().add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("Hombre");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(89, 177, 145, 33);
		getContentPane().add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("19 a\u00F1os");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(299, 134, 145, 33);
		getContentPane().add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("Padel, Baloncesto");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(299, 177, 145, 33);
		getContentPane().add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("125");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(497, 134, 145, 33);
		getContentPane().add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("Descripcion");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(89, 220, 145, 33);
		getContentPane().add(lblNewLabel_14);

		txtrFdsfsd = new JTextArea();
		txtrFdsfsd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrFdsfsd.setForeground(Color.WHITE);
		txtrFdsfsd.setText(
				"Soy una persona un tanto egocentrica, me gusta la perfeccion en todos los ambitos posibles.En\r\ncuanto a los deprotes me considero un jugador con una deportividad ejemplar, no destaco\r\nen ningun deporte sinembargo, tento en baloncesto como en padel considero que estoy por\r\nencima de la media.\r\nMe uno a esta app para encontrar compa\u00F1eros con los que poder jugar partidos y porque \r\nno entablar alguna que otra amistad.");
		txtrFdsfsd.setBackground(new Color(34, 40, 49));
		txtrFdsfsd.setBounds(55, 263, 593, 113);
		getContentPane().add(txtrFdsfsd);


		
		btnPuntitos = new JButton("");
		btnPuntitos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPuntitos.setBounds(741, 110, 85, 41);
		getContentPane().add(btnPuntitos);
		btnPuntitos.setBorder(null);
		btnPuntitos.setBackground(null);
		btnPuntitos.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/puntitos32.png")));
		
		btnEditarPerfil = new JButton("Editar perfil");
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
			}
		});
		
		btnHistorial = new JButton("Historial");
		btnHistorial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHistorial.setForeground(Color.WHITE);
		btnHistorial.setBorder(null);
		btnHistorial.setBackground(new Color(156, 163, 219));
		btnHistorial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHistorial.setBounds(697, 214, 123, 33);
		getContentPane().add(btnHistorial);
		btnHistorial.setVisible(false);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 6);
			}
		});
		
		btnLogOut = new JButton("LogOut");
		btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setBorder(null);
		btnLogOut.setBackground(new Color(156, 163, 219));
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogOut.setBounds(697, 267, 123, 33);
		getContentPane().add(btnLogOut);
		btnLogOut.setVisible(false);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(10, 6);
			}
		});
		
		btnPuntitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHistorial.isVisible() && btnEditarPerfil.isVisible() && btnLogOut.isVisible()) {
					btnHistorial.setVisible(false);
					btnEditarPerfil.setVisible(false);
					btnLogOut.setVisible(false);
				} else {
					btnHistorial.setVisible(true);
					btnEditarPerfil.setVisible(true);
					btnLogOut.setVisible(true);
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