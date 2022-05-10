package principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Foro {

	private JFrame frame;
	private JTextField txtGenialGracias;
	private JTextField txtHolaYoLlevo;
	private JTextField txtElTemaDe;
	private JTextField txtLlevamosCamisetasAzules;
	private JTextField txtAlliNosVemos;
	private JTextField txtEscribeAqui;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JTextField txtPartidoFutbolColegas;

	/**
	 * Launch the application.
	 */
	public static void Foro() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Foro window = new Foro();
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
	public Foro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34,40,49));
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 750, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnUnirse = new JButton("FORO");
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53, 187, 95));
		btnUnirse.setBounds(553, 363, 157, 51);
		frame.getContentPane().add(btnUnirse);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(55, 10, 366, 39);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtPartidoFutbolColegas = new JTextField();
		txtPartidoFutbolColegas.setBounds(10, 10, 311, 19);
		panel_1.add(txtPartidoFutbolColegas);
		txtPartidoFutbolColegas.setBackground(new Color(240, 240, 240));
		txtPartidoFutbolColegas.setText("PARTIDO FUTBOL COLEGAS");
		txtPartidoFutbolColegas.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setBounds(322, 6, 34, 27);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBounds(55, 10, 364, 404);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtHolaYoLlevo = new JTextField();
		txtHolaYoLlevo.setText("Hola, yo llevo la pelota");
		txtHolaYoLlevo.setBounds(69, 61, 141, 27);
		panel.add(txtHolaYoLlevo);
		txtHolaYoLlevo.setColumns(10);
		
		txtGenialGracias = new JTextField();
		txtGenialGracias.setText("Genial, gracias!");
		txtGenialGracias.setBounds(131, 114, 161, 27);
		panel.add(txtGenialGracias);
		txtGenialGracias.setColumns(10);
		
		txtElTemaDe = new JTextField();
		txtElTemaDe.setText("El tema de las equipaciones?");
		txtElTemaDe.setBounds(69, 166, 152, 27);
		panel.add(txtElTemaDe);
		txtElTemaDe.setColumns(10);
		
		txtLlevamosCamisetasAzules = new JTextField();
		txtLlevamosCamisetasAzules.setText("Llevamos camisetas azules y blancas?");
		txtLlevamosCamisetasAzules.setBounds(69, 222, 202, 27);
		panel.add(txtLlevamosCamisetasAzules);
		txtLlevamosCamisetasAzules.setColumns(10);
		
		txtAlliNosVemos = new JTextField();
		txtAlliNosVemos.setText("Alli nos vemos");
		txtAlliNosVemos.setBounds(190, 270, 103, 27);
		panel.add(txtAlliNosVemos);
		txtAlliNosVemos.setColumns(10);
		
		txtEscribeAqui = new JTextField();
		txtEscribeAqui.setText("ESCRIBE AQUI...");
		txtEscribeAqui.setBounds(10, 355, 249, 39);
		panel.add(txtEscribeAqui);
		txtEscribeAqui.setColumns(10);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.setBounds(269, 361, 85, 27);
		panel.add(btnNewButton);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_2.setBounds(10, 48, 52, 46);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_3.setBounds(302, 106, 52, 46);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_4.setBounds(10, 154, 52, 46);
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_5.setBounds(10, 213, 52, 46);
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_6.setBounds(303, 261, 52, 46);
		panel.add(btnNewButton_6);
	}
}
