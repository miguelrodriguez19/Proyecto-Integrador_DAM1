package principal;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Valoracion {

	private JFrame frame;
	private JButton btnHome;
	private JButton btnPerfil;
	private JButton btnNewButton_2;
	private JButton btnFaqs;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_1_4;
	private JToggleButton tglbtnNewToggleButton_1;
	private JToggleButton tglbtnNewToggleButton_2;
	private JToggleButton tglbtnNewToggleButton_3;

	/**
	 * Launch the application.
	 */
	public static void Valoracion() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valoracion window = new Valoracion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Valoracion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = frame.getContentPane();
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contenedor.setLayout(null);

		Panel panel = new Panel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnValoran = new JButton("Valorar");
		btnValoran.setBorder(null);
		btnValoran.setForeground(Color.WHITE);
		btnValoran.setBackground(new Color(53, 187, 95));
		btnValoran.setBounds(687, 370, 120, 38);
		frame.getContentPane().add(btnValoran);

		btnHome = new JButton("");
		btnHome.setBorderPainted(false);
		btnHome.setBackground(null);
		btnHome.setBorder(null);
		btnHome.setToolTipText("");
		btnHome.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/home-48.png")));
		btnHome.setBounds(36, 18, 85, 70);
		panel.add(btnHome);

		btnPerfil = new JButton("");
		btnPerfil.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnPerfil.setBounds(726, 18, 85, 70);
		btnPerfil.setBackground(null);
		btnPerfil.setBorder(null);
		panel.add(btnPerfil);

		btnFaqs = new JButton("FAQS");
		btnFaqs.setBorder(null);
		btnFaqs.setBackground(null);
		btnFaqs.setForeground(Color.WHITE);
		btnFaqs.setBounds(516, 43, 85, 21);
		panel.add(btnFaqs);

		btnPerfil = new JButton("PERFIL");
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground(null);
		btnPerfil.setBounds(631, 43, 85, 21);
		panel.add(btnPerfil);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(null);
		btnNewButton_2.setIcon(new ImageIcon(crearEvento.class.getResource("/Imagenes/arrow.png")));
		btnNewButton_2.setBounds(10, 106, 65, 37);
		frame.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Valora a tus compa\u00F1eros\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 50));
		lblNewLabel.setBounds(75, 90, 705, 80);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(30, 180, 85, 64);
		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(99, 181, 161, 33);
		frame.getContentPane().add(lblNewLabel_2);

		lblNewLabel_1_1 = new JLabel("@Username\r\n");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(99, 217, 106, 13);
		frame.getContentPane().add(lblNewLabel_1_1);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.RED);
		lblNewLabel_3.setBounds(30, 310, 85, 64);
		frame.getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(99, 311, 161, 33);
		frame.getContentPane().add(lblNewLabel_4);

		lblNewLabel_1_2 = new JLabel("@Username\r\n");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(99, 347, 106, 13);
		frame.getContentPane().add(lblNewLabel_1_2);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBackground(Color.RED);
		lblNewLabel_5.setBounds(371, 180, 85, 64);
		frame.getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(440, 181, 161, 33);
		frame.getContentPane().add(lblNewLabel_6);

		lblNewLabel_1_3 = new JLabel("@Username\r\n");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(440, 217, 106, 13);
		frame.getContentPane().add(lblNewLabel_1_3);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/usuario-de-perfil.png")));
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBackground(Color.RED);
		lblNewLabel_7.setBounds(371, 310, 85, 64);
		frame.getContentPane().add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Nombre Apellido\r\n");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(440, 311, 161, 33);
		frame.getContentPane().add(lblNewLabel_8);

		lblNewLabel_1_4 = new JLabel("@Username\r\n");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(440, 347, 106, 13);
		frame.getContentPane().add(lblNewLabel_1_4);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(30);
		scrollBar.setBounds(790, 157, 17, 203);
		frame.getContentPane().add(scrollBar);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnNewToggleButton.setBounds(259, 169, 85, 92);
		tglbtnNewToggleButton.setOpaque(false);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnNewToggleButton_1.setOpaque(false);
		tglbtnNewToggleButton_1.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton_1.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton_1.setBounds(259, 282, 85, 92);
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/Like.png")));
		tglbtnNewToggleButton_2.setOpaque(false);
		tglbtnNewToggleButton_2.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton_2.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton_2.setBounds(594, 282, 85, 92);
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setIcon(new ImageIcon(Valoracion.class.getResource("/Imagenes/LikeYellow.png")));
		tglbtnNewToggleButton_3.setSelected(true);
		tglbtnNewToggleButton_3.setOpaque(false);
		tglbtnNewToggleButton_3.setForeground(new Color(255, 99, 71));
		tglbtnNewToggleButton_3.setBackground(new Color(139, 0, 0));
		tglbtnNewToggleButton_3.setBounds(594, 157, 85, 92);
		frame.getContentPane().add(tglbtnNewToggleButton_3);

	}
}
