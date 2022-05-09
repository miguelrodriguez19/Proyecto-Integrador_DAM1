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

public class Foro {

	private JFrame frame;
	private JTextField txtGenialGracias;
	private JTextField txtHolaYoLlevo;
	private JTextField txtElTemaDe;
	private JTextField txtLlevamosCamisetasAzules;
	private JTextField txtAlliNosVemos;
	private JTextField txtEscribeAqui;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(57, 10, 364, 404);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtHolaYoLlevo = new JTextField();
		txtHolaYoLlevo.setText("Hola, yo llevo la pelota");
		txtHolaYoLlevo.setBounds(58, 61, 141, 27);
		panel.add(txtHolaYoLlevo);
		txtHolaYoLlevo.setColumns(10);
		
		txtGenialGracias = new JTextField();
		txtGenialGracias.setText("Genial, gracias!");
		txtGenialGracias.setBounds(143, 111, 161, 27);
		panel.add(txtGenialGracias);
		txtGenialGracias.setColumns(10);
		
		txtElTemaDe = new JTextField();
		txtElTemaDe.setText("El tema de las equipaciones?");
		txtElTemaDe.setBounds(58, 166, 152, 27);
		panel.add(txtElTemaDe);
		txtElTemaDe.setColumns(10);
		
		txtLlevamosCamisetasAzules = new JTextField();
		txtLlevamosCamisetasAzules.setText("Llevamos camisetas azules y blancas?");
		txtLlevamosCamisetasAzules.setBounds(58, 223, 202, 27);
		panel.add(txtLlevamosCamisetasAzules);
		txtLlevamosCamisetasAzules.setColumns(10);
		
		txtAlliNosVemos = new JTextField();
		txtAlliNosVemos.setText("Alli nos vemos");
		txtAlliNosVemos.setBounds(201, 271, 103, 27);
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
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(320, 6, 34, 27);
		panel.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(70, 130, 180));
		textField.setBounds(0, 0, 364, 39);
		panel.add(textField);
		textField.setColumns(10);
		frame.setBounds(100, 100, 750, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnUnirse = new JButton("FORO");
		btnUnirse.setBorder(null);
		btnUnirse.setForeground(Color.WHITE);
		btnUnirse.setBackground(new Color(53, 187, 95));
		btnUnirse.setBounds(553, 363, 157, 51);
		frame.getContentPane().add(btnUnirse);
	}
}
