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

public class Valoracion extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnPerfil, btnNewButton_2;
	private JLabel lblNewLabel_1, lblNewLabel_2, lblNewLabel_1_1, lblNewLabel_3, lblNewLabel_4, lblNewLabel_1_2,
			lblNewLabel_5, lblNewLabel_6, lblNewLabel_1_3, lblNewLabel_7, lblNewLabel_8, lblNewLabel_1_4;
	private JToggleButton tglbtnNewToggleButton_1;
	private JToggleButton tglbtnNewToggleButton;
	private JToggleButton tglbtnNewToggleButton_2;
	private JToggleButton tglbtnNewToggleButton_3;
	private JPanel panelHeader;
	private JButton btnFotoPerfil;
	private JButton btnPerfil_1;
	private JButton btnFAQs;
	private JButton btnLogo;

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

		JButton btnValoran = new JButton("Guardar");
		btnValoran.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValoran.setBorder(null);
		btnValoran.setForeground(Color.WHITE);
		btnValoran.setBackground(new Color(53, 187, 95));
		btnValoran.setBounds(691, 382, 120, 38);
		getContentPane().add(btnValoran);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(null);
		btnNewButton_2.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/arrow.png")));
		btnNewButton_2.setBounds(10, 106, 65, 37);
		getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Valora a tus compa\u00F1eros\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(75, 90, 705, 80);
		getContentPane().add(lblNewLabel);

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

		tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnNewToggleButton.setBounds(259, 169, 85, 92);
		tglbtnNewToggleButton.setOpaque(false);
		getContentPane().add(tglbtnNewToggleButton);

		tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnNewToggleButton_1.setOpaque(false);
		tglbtnNewToggleButton_1.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton_1.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton_1.setBounds(259, 282, 85, 92);
		getContentPane().add(tglbtnNewToggleButton_1);

		tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnNewToggleButton_2.setOpaque(false);
		tglbtnNewToggleButton_2.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton_2.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton_2.setBounds(594, 282, 85, 92);
		getContentPane().add(tglbtnNewToggleButton_2);

		tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/LikeYellow.png")));
		tglbtnNewToggleButton_3.setSelected(true);
		tglbtnNewToggleButton_3.setOpaque(false);
		tglbtnNewToggleButton_3.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton_3.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton_3.setBounds(594, 157, 85, 92);
		getContentPane().add(tglbtnNewToggleButton_3);
		
		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);
		
		btnFotoPerfil = new JButton("");
		btnFotoPerfil.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/appppp-modified.png")));
		btnFotoPerfil.setBorder(null);
		btnFotoPerfil.setBackground((Color) null);
		btnFotoPerfil.setBounds(718, 0, 99, 100);
		panelHeader.add(btnFotoPerfil);
		
		btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setToolTipText("");
		btnPerfil_1.setForeground(Color.WHITE);
		btnPerfil_1.setBorder(null);
		btnPerfil_1.setBackground((Color) null);
		btnPerfil_1.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil_1);
		
		btnFAQs = new JButton("FAQs");
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		
		btnLogo = new JButton("");
		btnLogo.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo);

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}