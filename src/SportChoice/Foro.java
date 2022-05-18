package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Foro extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtEscribeAqui;
	private JButton btnPerfil1, btnPerfil2, btnPerfil3, btnPerfil4, btnEnviar;
	private JPanel panel_1, panelFondo;

	public static void Foro() {
		Foro window = new Foro();
		window.setVisible(true);
	}

	public Foro() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		getContentPane().setLayout(null);
		setBounds(100, 100, 750, 480);
		setTitle("Sport Choice - Foro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(132, 10, 366, 39);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(5, 17);
			}
		});
		btnX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnX.setBounds(322, 6, 34, 27);
		panel_1.add(btnX);
		btnX.setBorder(null);
		btnX.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("PARTIDO FUTBOL COLEGAS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 4, 302, 20);
		panel_1.add(lblNewLabel_5);

		panelFondo = new JPanel();
		panelFondo.setBounds(132, 10, 364, 423);
		getContentPane().add(panelFondo);
		panelFondo.setLayout(null);

		txtEscribeAqui = new JTextField();
		txtEscribeAqui.setText("ESCRIBE AQUI...");
		txtEscribeAqui.setBounds(10, 374, 249, 39);
		panelFondo.add(txtEscribeAqui);
		txtEscribeAqui.setColumns(10);

		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setBounds(269, 380, 85, 27);
		panelFondo.add(btnEnviar);

		btnPerfil1 = new JButton("");
		btnPerfil1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil1.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnPerfil1.setBounds(10, 50, 52, 46);
		panelFondo.add(btnPerfil1);

		btnPerfil2 = new JButton("");
		btnPerfil2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil2.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnPerfil2.setBounds(10, 120, 52, 46);
		panelFondo.add(btnPerfil2);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 45, 364, 68);
		panelFondo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("18-05-2022 // 12:22");
		lblNewLabel.setBounds(253, 45, 101, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Hola, yo llevo la pelota");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(84, 19, 202, 23);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("@dogue_drake");
		lblNewLabel_7.setBounds(5, 52, 112, 13);
		panel.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(0, 116, 364, 68);
		panelFondo.add(panel_2);
		panel_2.setLayout(null);
				
				JLabel lblNewLabel_6_1 = new JLabel("Genial, gracias!!");
				lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel_6_1.setBounds(84, 23, 120, 23);
				panel_2.add(lblNewLabel_6_1);
				
				JLabel lblNewLabel_7_1 = new JLabel("@Juanito99");
				lblNewLabel_7_1.setBounds(10, 52, 62, 13);
				panel_2.add(lblNewLabel_7_1);
				
				JLabel lblNewLabel_1 = new JLabel("18-05-2022 // 12:35");
				lblNewLabel_1.setBounds(253, 45, 94, 13);
				panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(0, 188, 364, 74);
		panelFondo.add(panel_3);
		panel_3.setLayout(null);
		
				btnPerfil3 = new JButton("");
				btnPerfil3.setBounds(10, 7, 52, 46);
				panel_3.add(btnPerfil3);
				btnPerfil3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnPerfil3.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
						
						JLabel lblNewLabel_2 = new JLabel("18-05-2022 // 13:10");
						lblNewLabel_2.setBounds(253, 45, 101, 13);
						panel_3.add(lblNewLabel_2);
						
						JLabel lblNewLabel_6_1_1 = new JLabel("El tema de las equipaciones?");
						lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						lblNewLabel_6_1_1.setBounds(84, 18, 203, 23);
						panel_3.add(lblNewLabel_6_1_1);
						
						JLabel lblNewLabel_7_1_1 = new JLabel("@Pedro_ppr");
						lblNewLabel_7_1_1.setBounds(10, 57, 62, 13);
						panel_3.add(lblNewLabel_7_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(SystemColor.controlHighlight);
		panel_2_1.setBounds(0, 268, 364, 74);
		panelFondo.add(panel_2_1);
		panel_2_1.setLayout(null);
		
				btnPerfil4 = new JButton("");
				btnPerfil4.setBounds(10, 6, 52, 46);
				panel_2_1.add(btnPerfil4);
				btnPerfil4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnPerfil4.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));
						
						JLabel lblNewLabel_3 = new JLabel("18-05-2022  // 13:11");
						lblNewLabel_3.setBounds(253, 45, 101, 13);
						panel_2_1.add(lblNewLabel_3);
						
						JLabel lblNewLabel_6_1_1_1 = new JLabel("LLevamos camisetas azules y blancas");
						lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
						lblNewLabel_6_1_1_1.setBounds(84, 21, 259, 23);
						panel_2_1.add(lblNewLabel_6_1_1_1);
						
						JLabel lblNewLabel_7_1_1_1 = new JLabel("@Maria889");
						lblNewLabel_7_1_1_1.setBounds(10, 55, 62, 13);
						panel_2_1.add(lblNewLabel_7_1_1_1);
	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}