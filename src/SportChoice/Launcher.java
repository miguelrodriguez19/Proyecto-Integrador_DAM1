package SportChoice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Launcher {

	private JFrame frame;

	public static void main(String[] args) {
		Launcher window = new Launcher();
		window.frame.setVisible(true);
	}

	public Launcher() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnMain = new JButton("MainPage");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage pantalla1 = new MainPage();
				pantalla1.MainPage();
			}
		});
		btnMain.setBounds(339, 108, 85, 21);
		frame.getContentPane().add(btnMain);

		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn pantalla2 = new LogIn();
				pantalla2.LogIn();
			}
		});
		btnLogIn.setBounds(0, 23, 85, 21);
		frame.getContentPane().add(btnLogIn);

		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register pantalla3 = new Register();
				pantalla3.Register();
			}
		});
		btnRegistro.setBounds(110, 23, 85, 21);
		frame.getContentPane().add(btnRegistro);

		JButton btnRecContrasena = new JButton("RecContrase\u00F1a");
		btnRecContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecuperarContrasena pantalla4 = new RecuperarContrasena();
				pantalla4.RecuperarContrasena();
			}
		});
		btnRecContrasena.setBounds(0, 64, 85, 21);
		frame.getContentPane().add(btnRecContrasena);

		JButton btnCambContrasena = new JButton("CambContra");
		btnCambContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiarContrasena pantalla5 = new CambiarContrasena();
				pantalla5.CambiarContrasena();
			}
		});
		btnCambContrasena.setBounds(339, 64, 85, 21);
		frame.getContentPane().add(btnCambContrasena);

		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Perfil pantalla6 = new Perfil();
				pantalla6.Perfil();
			}
		});
		btnPerfil.setBounds(110, 64, 85, 21);
		frame.getContentPane().add(btnPerfil);

		JButton btnHistorial = new JButton("Historial");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HistorialWindow pantalla8;
				try {
					pantalla8 = new HistorialWindow();
					pantalla8.HistorialWindow();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnHistorial.setBounds(0, 108, 85, 21);
		frame.getContentPane().add(btnHistorial);

		JButton btnFAQs = new JButton("FAQs");
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FAQsWindow pantalla9 = new FAQsWindow();
				pantalla9.FAQsWindow();
			}
		});
		btnFAQs.setBounds(229, 108, 85, 21);
		frame.getContentPane().add(btnFAQs);

		JButton btnMisEventos = new JButton("MisEventos");
		btnMisEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MisEventos pantalla22 = new MisEventos();
				pantalla22.MisEventos();
			}
		});
		btnMisEventos.setBounds(0, 149, 85, 21);
		frame.getContentPane().add(btnMisEventos);

		JButton btnCrearEvento = new JButton("CrearEvento");
		btnCrearEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearEvento pantalla11 = new crearEvento();
				pantalla11.crearEvento();
			}
		});
		btnCrearEvento.setBounds(110, 149, 85, 21);
		frame.getContentPane().add(btnCrearEvento);

		JButton btnUnirseEvento = new JButton("UnirseEvento");
		btnUnirseEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unirseEvento pantalla12 = new unirseEvento();
				pantalla12.unirseEvento();
			}
		});
		btnUnirseEvento.setBounds(339, 149, 85, 21);
		frame.getContentPane().add(btnUnirseEvento);

		JButton btnVerEvento = new JButton("VerEvento");
		btnVerEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verEvento pantalla13 = new verEvento();
				pantalla13.verEvento();
			}
		});
		btnVerEvento.setBounds(229, 149, 85, 21);
		frame.getContentPane().add(btnVerEvento);

		JButton btnModEvento = new JButton("ModEvento");
		btnModEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarEvento pantalla20 = new ModificarEvento();
				pantalla20.ModificarEvento();
			}
		});
		btnModEvento.setBounds(110, 181, 85, 21);
		frame.getContentPane().add(btnModEvento);

		JButton btnForo = new JButton("Foro");
		btnForo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Foro pantalla15 = new Foro();
				pantalla15.Foro();
			}
		});
		btnForo.setBounds(0, 181, 85, 21);
		frame.getContentPane().add(btnForo);

		JButton btnValoraciones = new JButton("Valoraciones");
		btnValoraciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valoracion pantalla16 = new Valoracion();
				pantalla16.Valoracion();
			}
		});
		btnValoraciones.setBounds(110, 108, 85, 21);
		frame.getContentPane().add(btnValoraciones);

		JButton btnEditarPerfil = new JButton("EditarPerfil");
		btnEditarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarPerfil pantalla7 = new editarPerfil();
				pantalla7.editarPerfil();
			}
		});
		btnEditarPerfil.setBounds(229, 64, 85, 21);
		frame.getContentPane().add(btnEditarPerfil);

		JButton btnNewButton_16 = new JButton("ConfCrearPerf");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfCrearPerfil pantalla17 = new ConfCrearPerfil();
				pantalla17.ConfCrearPerfil();
			}
		});
		btnNewButton_16.setBounds(231, 23, 85, 21);
		frame.getContentPane().add(btnNewButton_16);

		JButton btnNewButton = new JButton("ConfirmarRecMail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecuperarContrasenaV2 pantalla18 = new RecuperarContrasenaV2();
				pantalla18.RecuperarContrasena();
			}
		});
		btnNewButton.setBounds(339, 23, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}