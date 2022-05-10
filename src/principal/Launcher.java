package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Launcher {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
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
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMain = new JButton("MainPage");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage pantalla1 =new MainPage();
				pantalla1.MainPage();
			}
		});
		btnMain.setBounds(0, 23, 85, 21);
		frame.getContentPane().add(btnMain);
		
		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn pantalla2=new LogIn();
				pantalla2.LogIn();
			}
		});
		btnLogIn.setBounds(112, 23, 85, 21);
		frame.getContentPane().add(btnLogIn);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register pantalla3=new Register();
				pantalla3.Register();
			}
		});
		btnRegistro.setBounds(231, 23, 85, 21);
		frame.getContentPane().add(btnRegistro);
		
		JButton btnRecContraseña = new JButton("RecContrase\u00F1a");
		btnRecContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecuperarContraseña pantalla4=new RecuperarContraseña();
				pantalla4.RecuperarContraseña();
			}
		});
		btnRecContraseña.setBounds(341, 23, 85, 21);
		frame.getContentPane().add(btnRecContraseña);
		
		JButton btnCambContraseña = new JButton("CambContra");
		btnCambContraseña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiarContraseña pantalla5=new CambiarContraseña();
				pantalla5.CambiarContraseña();
			}
		});
		btnCambContraseña.setBounds(0, 67, 85, 21);
		frame.getContentPane().add(btnCambContraseña);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Perfil pantalla6=new Perfil();
				pantalla6.Perfil();
			}
		});
		btnPerfil.setBounds(112, 67, 85, 21);
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
		
		btnHistorial.setBounds(341, 67, 85, 21);
		frame.getContentPane().add(btnHistorial);
		
		JButton btnFAQs = new JButton("FAQs");
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FAQsWindow pantalla9=new FAQsWindow();
				pantalla9.FAQsWindow();
			}
		});
		btnFAQs.setBounds(0, 109, 85, 21);
		frame.getContentPane().add(btnFAQs);
		
		JButton btnMisEventos = new JButton("MisEventos");
		btnMisEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MisEventos pantalla22 =new MisEventos();
				pantalla22.MisEventos();
			}
		});
		btnMisEventos.setBounds(112, 109, 85, 21);
		frame.getContentPane().add(btnMisEventos);
		
		JButton btnCrearEvento = new JButton("CrearEvento");
		btnCrearEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearEvento pantalla11=new crearEvento();
				pantalla11.crearEvento();
			}
		});
		btnCrearEvento.setBounds(231, 109, 85, 21);
		frame.getContentPane().add(btnCrearEvento);
		
		JButton btnUnirseEvento = new JButton("UnirseEvento");
		btnUnirseEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unirseEvento pantalla12=new unirseEvento();
				pantalla12.unirseEvento();
			}
		});
		btnUnirseEvento.setBounds(341, 109, 85, 21);
		frame.getContentPane().add(btnUnirseEvento);
		
		JButton btnVerEvento = new JButton("VerEvento");
		btnVerEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verEvento pantalla13 =new verEvento();
				pantalla13.verEvento();
			}
		});
		btnVerEvento.setBounds(0, 154, 85, 21);
		frame.getContentPane().add(btnVerEvento);
		
		JButton btnModEvento = new JButton("ModEvento");
		btnModEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarEvento pantalla20= new ModificarEvento();
				pantalla20.ModificarEvento();
			}
		});
		btnModEvento.setBounds(112, 154, 85, 21);
		frame.getContentPane().add(btnModEvento);
		
		JButton btnForo = new JButton("Foro");
		btnForo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Foro pantalla15= new Foro();
				pantalla15.Foro();
			}
		});
		btnForo.setBounds(231, 154, 85, 21);
		frame.getContentPane().add(btnForo);
		
		JButton btnValoraciones = new JButton("Valoraciones");
		btnValoraciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valoracion pantalla16 =new Valoracion();
				pantalla16.Valoracion();
			}
		});
		btnValoraciones.setBounds(341, 154, 85, 21);
		frame.getContentPane().add(btnValoraciones);
		
		JButton btnEditarPerfil = new JButton("EditarPerfil");
		btnEditarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarPerfil pantalla7=new editarPerfil();
				pantalla7.editarPerfil();
			}
		});
		btnEditarPerfil.setBounds(231, 67, 85, 21);
		frame.getContentPane().add(btnEditarPerfil);
		
		JButton btnNewButton_16 = new JButton("ConfCrearPerf");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfCrearPerfil pantalla17=new ConfCrearPerfil();
				pantalla17.ConfCrearPerfil();
			}
		});
		btnNewButton_16.setBounds(0, 200, 85, 21);
		frame.getContentPane().add(btnNewButton_16);
	}
}