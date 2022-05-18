package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Valoracion extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnPerfil;
	private JLabel lblNewLabel_1, lblNewLabel_2, lblNewLabel_1_1, lblNewLabel_3, lblNewLabel_4, lblNewLabel_1_2,
			lblNewLabel_5, lblNewLabel_6, lblNewLabel_1_3, lblNewLabel_7, lblNewLabel_8, lblNewLabel_1_4;
	private JToggleButton tglbtnLikeUsr3;
	private JToggleButton tglbtnLikeUsr1;
	private JToggleButton tglbtnLikeUsr4;
	private JToggleButton tglbtnLikeUsr2;
	private JPanel panelHeader;
	private JButton btnFotoPerfil;
	private JButton btnPerfil_1;
	private JButton btnFAQs;
	private JButton btnLogo;
	private JButton btnValoran;
	private JButton btnNewButton;
	private JButton btnAtras;
	private JLabel lblTitulo;

	public static void Valoracion() {
		Valoracion window = new Valoracion();
		window.setVisible(true);
	}

	public Valoracion() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setTitle("Sport Choice - Valoraciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contenedor.setLayout(null);

		btnValoran = new JButton("Guardar");
		btnValoran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(16, 6);
			}
		});
		btnValoran.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValoran.setBorder(null);
		btnValoran.setForeground(Color.WHITE);
		btnValoran.setBackground(new Color(53, 187, 95));
		btnValoran.setBounds(691, 382, 120, 38);
		getContentPane().add(btnValoran);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(30, 180, 85, 64);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(99, 181, 161, 33);
		getContentPane().add(lblNewLabel_2);

		lblNewLabel_1_1 = new JLabel("@Username\r\n");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(99, 217, 106, 13);
		getContentPane().add(lblNewLabel_1_1);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.RED);
		lblNewLabel_3.setBounds(30, 310, 85, 64);
		getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(99, 311, 161, 33);
		getContentPane().add(lblNewLabel_4);

		lblNewLabel_1_2 = new JLabel("@Username\r\n");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(99, 347, 106, 13);
		getContentPane().add(lblNewLabel_1_2);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBackground(Color.RED);
		lblNewLabel_5.setBounds(371, 180, 85, 64);
		getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(440, 181, 161, 33);
		getContentPane().add(lblNewLabel_6);

		lblNewLabel_1_3 = new JLabel("@Username\r\n");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(440, 217, 106, 13);
		getContentPane().add(lblNewLabel_1_3);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBackground(Color.RED);
		lblNewLabel_7.setBounds(371, 310, 85, 64);
		getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(440, 311, 161, 33);
		getContentPane().add(lblNewLabel_8);

		lblNewLabel_1_4 = new JLabel("@Username\r\n");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(440, 347, 106, 13);
		getContentPane().add(lblNewLabel_1_4);

		tglbtnLikeUsr1 = new JToggleButton("");
		tglbtnLikeUsr1.setBorderPainted(false);
		tglbtnLikeUsr1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnLikeUsr1.setBorder(null);
		tglbtnLikeUsr1.setBackground(null);
		tglbtnLikeUsr1.setSelectedIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/LikeYellow.png")));
		tglbtnLikeUsr1.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnLikeUsr1.setBounds(259, 169, 85, 92);
		getContentPane().add(tglbtnLikeUsr1);

		tglbtnLikeUsr2 = new JToggleButton("");
		tglbtnLikeUsr2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnLikeUsr2.setSelectedIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/LikeYellow.png")));
		tglbtnLikeUsr2.setBorder(null);
		tglbtnLikeUsr2.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnLikeUsr2.setBackground(null);
		tglbtnLikeUsr2.setBounds(594, 169, 85, 92);
		getContentPane().add(tglbtnLikeUsr2);

		tglbtnLikeUsr3 = new JToggleButton("");
		tglbtnLikeUsr3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnLikeUsr3.setSelectedIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/LikeYellow.png")));
		tglbtnLikeUsr3.setBorder(null);
		tglbtnLikeUsr3.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnLikeUsr3.setBackground(null);
		tglbtnLikeUsr3.setBounds(259, 294, 85, 92);
		getContentPane().add(tglbtnLikeUsr3);

		tglbtnLikeUsr4 = new JToggleButton("");
		tglbtnLikeUsr4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tglbtnLikeUsr4.setSelectedIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/LikeYellow.png")));
		tglbtnLikeUsr4.setBorder(null);
		tglbtnLikeUsr4.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnLikeUsr4.setBackground(null);
		tglbtnLikeUsr4.setBounds(594, 294, 85, 92);
		getContentPane().add(tglbtnLikeUsr4);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnFotoPerfil = new JButton("");
		btnFotoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFotoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(16, 10);
			}
		});
		btnFotoPerfil.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/appppp-modified.png")));
		btnFotoPerfil.setBorder(null);
		btnFotoPerfil.setBackground((Color) null);
		btnFotoPerfil.setBounds(718, 0, 99, 100);
		panelHeader.add(btnFotoPerfil);

		btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(16, 10);
			}
		});
		btnPerfil_1.setToolTipText("");
		btnPerfil_1.setForeground(Color.WHITE);
		btnPerfil_1.setBorder(null);
		btnPerfil_1.setBackground((Color) null);
		btnPerfil_1.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil_1);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(16, 4);
			}
		});
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);

		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(16, 11);
			}
		});
		btnLogo.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo);

		btnAtras = new JButton("");
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(16, 6);
			}
		});
		btnAtras.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBorder(null);
		btnAtras.setBackground((Color) null);
		btnAtras.setBounds(10, 111, 56, 39);
		getContentPane().add(btnAtras);

		lblTitulo = new JLabel("Valora a tus compañeros");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(71, 118, 385, 23);
		getContentPane().add(lblTitulo);

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}