package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FAQsWindow extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel panelMain, panelHeader;
	private JLabel lblFAQsTitle;
	private JTextPane txtpnPregunta1, txtpnPregunta2, txtpnPregunta3;
	private JScrollBar scrollBar;
	private JButton btnLogo,  btnPerfil, btnFotoPerfil, btnFAQs, btnBackIcon,btnPregunta1,btnPregunta2,btnPregunta3;

	public static void FAQsWindow() {
		FAQsWindow window = new FAQsWindow();
		window.setVisible(true);
	}

	public FAQsWindow() {
		initialize();
	}

	private void initialize() {
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Eventos recientes");
		contenedor.setLayout(null);

		panelHeader = new JPanel();
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);
		panelHeader.setLayout(null);


		btnPerfil = new JButton("Perfil");
		btnPerfil.setBorder(null);
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBackground(null);
		btnPerfil.setToolTipText("");
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(4, 10);
			}
		});
		btnFAQs = new JButton("FAQs");
		btnFAQs.setBorder(null);
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(4, 4);
			}
		});
		btnLogo = new JButton("");
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.setBorder(null);
		btnLogo.setBackground(null);
		btnLogo.setIcon(new ImageIcon(MainPage.class.getResource("/Imagenes/logoSportChoice.png")));
		btnLogo.setBounds(29, 18, 114, 68);
		panelHeader.add(btnLogo);
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(4, 11);
			}
		});
		
		btnFotoPerfil = new JButton("");
		btnFotoPerfil.setIcon(new ImageIcon(HistorialWindow.class.getResource("/Imagenes/appppp-modified.png")));
		btnFotoPerfil.setBorder(null);
		btnFotoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFotoPerfil.setBackground((Color) null);
		btnFotoPerfil.setBounds(718, 0, 99, 100);
		panelHeader.add(btnFotoPerfil);
		btnFotoPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(4, 10);
			}
		});
		

		panelMain = new JPanel();
		panelMain.setBackground(new Color(34, 40, 59));
		panelMain.setBounds(0, 100, 836, 343);
		getContentPane().add(panelMain);
		panelMain.setLayout(null);

		btnBackIcon = new JButton("");
		btnBackIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(4, 11);
			}
		});
		btnBackIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBackIcon.setBounds(0, 0, 50, 50);
		btnBackIcon.setIcon(new ImageIcon(FAQsWindow.class.getResource("/Imagenes/arrow.png")));
		btnBackIcon.setBackground(null);
		btnBackIcon.setBorder(null);
		panelMain.add(btnBackIcon);

		lblFAQsTitle = new JLabel("Preguntas Frecuentes", SwingConstants.CENTER);
		lblFAQsTitle.setForeground(new Color(255, 255, 255));
		lblFAQsTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFAQsTitle.setBounds(157, 10, 524, 55);
		panelMain.add(lblFAQsTitle);

		btnPregunta1 = new JButton("�Como cambi� mi constrase�a si se me ha olvidado?");
		btnPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta1.setBorder(null);
		btnPregunta1.setForeground(Color.WHITE);
		btnPregunta1.setBackground(new Color(53, 187, 95));
		btnPregunta1.setBounds(157, 64, 524, 55);

		btnBackIcon.setBackground(null);
		btnBackIcon.setBorder(null);
		panelMain.add(btnPregunta1);

		txtpnPregunta1 = new JTextPane();
		txtpnPregunta1.setText(
				"A la hora de iniciar sesi�n, le da a he olvidado mi contase�a, y tiene que escribir el c�digo que le llegue al e-mail, y su nueva contrase�a"
						+ "\nSi esto no resuelve sus dudas no dude en contactar a nuestro soporte");
		txtpnPregunta1.setBackground(new Color(57, 62, 70));
		txtpnPregunta1.setForeground(Color.WHITE);
		txtpnPregunta1.setBounds(157, 128, 524, 60);
		panelMain.add(txtpnPregunta1);
		txtpnPregunta1.setVisible(false);

		btnPregunta2 = new JButton("�Hay que pagar algo para usar esta aplicaci�n?");
		btnPregunta2.setBorder(null);
		btnPregunta2.setForeground(Color.WHITE);
		btnPregunta2.setBackground(new Color(53, 187, 95));
		btnPregunta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta2.setBounds(157, 128, 524, 50);
//			btnPregunta2.setBounds(157, 188, 524, 55);
		panelMain.add(btnPregunta2);

		txtpnPregunta2 = new JTextPane();
		txtpnPregunta2.setBackground(new Color(57, 62, 70));
		txtpnPregunta2.setForeground(Color.WHITE);
		txtpnPregunta2.setText(
				"No, est� es totalmente gratuita, pretendemos obtener beneficio de la aplicaci�n mediante anuncios que molesten lo menos posible");
		txtpnPregunta2.setBounds(157, 188, 524, 50);
		panelMain.add(txtpnPregunta2);
		txtpnPregunta2.setVisible(false);

		scrollBar = new JScrollBar();
		scrollBar.setBounds(750, 71, 17, 231);
		panelMain.add(scrollBar);

		btnPregunta3 = new JButton("\u00BFTiene alguna pregunta m\u00E1s?: Soporte T�cnico");
		btnPregunta3.setBorder(null);
		btnPregunta3.setForeground(Color.WHITE);
		btnPregunta3.setBackground(new Color(53, 187, 95));
		btnPregunta3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta3.setBounds(157, 188, 524, 50);
		panelMain.add(btnPregunta3);

		txtpnPregunta3 = new JTextPane();
		txtpnPregunta3.setBackground(new Color(57, 62, 70));
		txtpnPregunta3.setForeground(Color.WHITE);
		txtpnPregunta3.setText("Contactenos:" + "\nV�a e-mail: soporte@sports-choice.com"
				+ "\nLlamando a este n�mero: 633 456" + "\nO en nuestras oficinas localizadas en Toledo");
		txtpnPregunta3.setBounds(157, 240, 524, 70);
		panelMain.add(txtpnPregunta3);
		txtpnPregunta3.setVisible(false);

		btnPregunta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnPregunta2.setVisible(false);
				txtpnPregunta3.setVisible(false);
				if (txtpnPregunta1.isVisible()) {
					txtpnPregunta1.setVisible(false);
					btnPregunta3.setBounds(157, 188, 524, 50);
					btnPregunta2.setBounds(157, 128, 524, 50);
				} else {
					txtpnPregunta1.setVisible(true);
					btnPregunta2.setBounds(157, 198, 524, 50);
					btnPregunta3.setBounds(157, 258, 524, 50);
				}
			}
		});

		btnPregunta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnPregunta1.setVisible(false);
				txtpnPregunta3.setVisible(false);
				btnPregunta2.setBounds(157, 128, 524, 50);
				btnPregunta3.setBounds(157, 188, 524, 50);
				if (txtpnPregunta2.isVisible()) {
					txtpnPregunta2.setVisible(false);
					btnPregunta3.setBounds(157, 188, 524, 50);
				} else {
					txtpnPregunta2.setVisible(true);
					btnPregunta3.setBounds(157, 248, 524, 50);
				}
			}
		});

		btnPregunta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnPregunta1.setVisible(false);
				txtpnPregunta2.setVisible(false);
				btnPregunta2.setBounds(157, 128, 524, 50);
				btnPregunta3.setBounds(157, 188, 524, 50);
				if (txtpnPregunta3.isVisible())
					txtpnPregunta3.setVisible(false);
				else
					txtpnPregunta3.setVisible(true);
			}
		});

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}