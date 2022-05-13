package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.*;

public class Foro extends JFrame{

	private JFrame frame;
	private JTextField txtGenialGracias, txtHolaYoLlevo, txtElTemaDe, txtLlevamosCamisetasAzules, txtAlliNosVemos,
			txtEscribeAqui, txtPartidoFutbolColegas;
	private JButton btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5, btnNewButton_6, btnEnviar;
	private JPanel panel_1, panelFondo;

	public static void Foro() {
		Foro window = new Foro();
		window.frame.setVisible(true);
	}

	public Foro() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 750, 480);
		frame.setTitle("Sport Choice - Foro");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnUnirse = new JButton("FORO");
		btnUnirse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53, 187, 95));
		btnUnirse.setBounds(553, 363, 157, 51);
		frame.getContentPane().add(btnUnirse);

		panel_1 = new JPanel();
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
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBounds(322, 6, 34, 27);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);

		panelFondo = new JPanel();
		panelFondo.setBounds(55, 10, 364, 404);
		frame.getContentPane().add(panelFondo);
		panelFondo.setLayout(null);

		txtHolaYoLlevo = new JTextField();
		txtHolaYoLlevo.setText("Hola, yo llevo la pelota");
		txtHolaYoLlevo.setBounds(69, 61, 141, 27);
		panelFondo.add(txtHolaYoLlevo);
		txtHolaYoLlevo.setColumns(10);

		txtGenialGracias = new JTextField();
		txtGenialGracias.setText("Genial, gracias!");
		txtGenialGracias.setBounds(131, 114, 161, 27);
		panelFondo.add(txtGenialGracias);
		txtGenialGracias.setColumns(10);

		txtElTemaDe = new JTextField();
		txtElTemaDe.setText("El tema de las equipaciones?");
		txtElTemaDe.setBounds(69, 166, 152, 27);
		panelFondo.add(txtElTemaDe);
		txtElTemaDe.setColumns(10);

		txtLlevamosCamisetasAzules = new JTextField();
		txtLlevamosCamisetasAzules.setText("Llevamos camisetas azules y blancas?");
		txtLlevamosCamisetasAzules.setBounds(69, 222, 202, 27);
		panelFondo.add(txtLlevamosCamisetasAzules);
		txtLlevamosCamisetasAzules.setColumns(10);

		txtAlliNosVemos = new JTextField();
		txtAlliNosVemos.setText("Alli nos vemos");
		txtAlliNosVemos.setBounds(190, 270, 103, 27);
		panelFondo.add(txtAlliNosVemos);
		txtAlliNosVemos.setColumns(10);

		txtEscribeAqui = new JTextField();
		txtEscribeAqui.setText("ESCRIBE AQUI...");
		txtEscribeAqui.setBounds(10, 355, 249, 39);
		panelFondo.add(txtEscribeAqui);
		txtEscribeAqui.setColumns(10);

		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setBounds(269, 361, 85, 27);
		panelFondo.add(btnEnviar);

		btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_2.setBounds(10, 48, 52, 46);
		panelFondo.add(btnNewButton_2);

		btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_3.setBounds(302, 106, 52, 46);
		panelFondo.add(btnNewButton_3);

		btnNewButton_4 = new JButton("");
		btnNewButton_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_4.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_4.setBounds(10, 154, 52, 46);
		panelFondo.add(btnNewButton_4);

		btnNewButton_5 = new JButton("");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_5.setBounds(10, 213, 52, 46);
		panelFondo.add(btnNewButton_5);

		btnNewButton_6 = new JButton("");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnNewButton_6.setBounds(303, 261, 52, 46);
		panelFondo.add(btnNewButton_6);
	}

	
}