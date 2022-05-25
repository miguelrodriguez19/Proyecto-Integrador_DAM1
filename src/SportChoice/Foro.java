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

public class Foro extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtMensaje;
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
		panel_1.setBounds(132, 10, 366, 50);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnX = new JButton("");
		btnX.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/x.png")));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(5, 17);
			}
		});
		btnX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnX.setBounds(330, 15, 20, 20);
		panel_1.add(btnX);
		btnX.setBorder(null);
		btnX.setBackground(null);

		JLabel lblNewLabel_5 = new JLabel("PARTIDO FUTBOL COLEGAS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 15, 302, 20);
		panel_1.add(lblNewLabel_5);

		panelFondo = new JPanel();
		panelFondo.setBounds(132, 10, 364, 423);
		getContentPane().add(panelFondo);
		panelFondo.setLayout(null);

		txtMensaje = new JTextField();
		txtMensaje.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMensaje.setHorizontalAlignment(SwingConstants.LEFT);
		txtMensaje.setForeground(Color.GRAY);
		txtMensaje.setText("Escribe aqui...");
		txtMensaje.setBounds(10, 374, 249, 39);
		panelFondo.add(txtMensaje);
		txtMensaje.setColumns(10);

		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBorder(null);
		btnEnviar.setBackground(new Color(129, 136, 212));
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setBounds(269, 380, 85, 27);
		panelFondo.add(btnEnviar);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 58, 364, 68);
		panelFondo.add(panel);
		panel.setLayout(null);

		JLabel lblFechaHoraMsj1 = new JLabel("18-05-2022 // 12:22");
		lblFechaHoraMsj1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaHoraMsj1.setBounds(245, 50, 115, 15);
		panel.add(lblFechaHoraMsj1);

		JLabel lblTextUsuario = new JLabel("Hola, yo llevo la pelota");
		lblTextUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextUsuario.setBounds(80, 20, 270, 23);
		panel.add(lblTextUsuario);

		JLabel lblUsuario1 = new JLabel("@dogue_drake");
		lblUsuario1.setBounds(5, 53, 115, 13);
		panel.add(lblUsuario1);

		btnPerfil1 = new JButton("");
		btnPerfil1.setBounds(15, 5, 48, 48);
		panel.add(btnPerfil1);
		btnPerfil1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil1.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 204));
		panel_2.setBounds(0, 133, 364, 68);
		panelFondo.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblTextUsuario2 = new JLabel("Genial, gracias!!");
		lblTextUsuario2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextUsuario2.setBounds(80, 20, 270, 23);
		panel_2.add(lblTextUsuario2);

		JLabel lblUsuario2 = new JLabel("@Juanito99");
		lblUsuario2.setBounds(5, 53, 115, 13);
		panel_2.add(lblUsuario2);

		JLabel lblFechaHoraMsj2 = new JLabel("18-05-2022 // 12:35");
		lblFechaHoraMsj2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaHoraMsj2.setBounds(245, 50, 115, 15);
		panel_2.add(lblFechaHoraMsj2);

		btnPerfil2 = new JButton("");
		btnPerfil2.setBounds(15, 5, 48, 48);
		panel_2.add(btnPerfil2);
		btnPerfil2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil2.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(0, 208, 364, 68);
		panelFondo.add(panel_3);
		panel_3.setLayout(null);

		btnPerfil3 = new JButton("");
		btnPerfil3.setBounds(15, 5, 48, 48);
		panel_3.add(btnPerfil3);
		btnPerfil3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil3.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));

		JLabel lblFechaHoraMsj3 = new JLabel("18-05-2022 // 13:10");
		lblFechaHoraMsj3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaHoraMsj3.setBounds(245, 50, 115, 15);
		panel_3.add(lblFechaHoraMsj3);

		JLabel lblTextUsuario3 = new JLabel("El tema de las equipaciones?");
		lblTextUsuario3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextUsuario3.setBounds(80, 20, 270, 23);
		panel_3.add(lblTextUsuario3);

		JLabel lblUsuario3 = new JLabel("@Pedro_ppr");
		lblUsuario3.setBounds(5, 53, 115, 13);
		panel_3.add(lblUsuario3);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(204, 204, 204));
		panel_2_1.setBounds(0, 283, 364, 68);
		panelFondo.add(panel_2_1);
		panel_2_1.setLayout(null);

		btnPerfil4 = new JButton("");
		btnPerfil4.setBounds(15, 5, 48, 48);
		panel_2_1.add(btnPerfil4);
		btnPerfil4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil4.setIcon(new ImageIcon(Foro.class.getResource("/Imagenes/usuario-de-perfil.png")));

		JLabel lblFechaHoraMsj4 = new JLabel("18-05-2022  // 13:11");
		lblFechaHoraMsj4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaHoraMsj4.setBounds(245, 50, 115, 15);
		panel_2_1.add(lblFechaHoraMsj4);

		JLabel lblTextUsuario4 = new JLabel("LLevamos camisetas azules y blancas");
		lblTextUsuario4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTextUsuario4.setBounds(84, 20, 270, 23);
		panel_2_1.add(lblTextUsuario4);

		JLabel lblUsuario4 = new JLabel("@Maria889");
		lblUsuario4.setBounds(5, 53, 115, 13);
		panel_2_1.add(lblUsuario4);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 361, 364, 2);
		panelFondo.add(separator);
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}