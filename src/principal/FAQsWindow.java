package principal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class FAQsWindow {

	private JFrame frame;
	private JButton btnHomeIcon;
	private JButton btnFAQs;
	private JButton btnPerfil;
	private JButton btnProfileIcon;
	private JButton btnBackIcon;
	private JPanel panelMain;
	private JPanel panelHeader;
	private JLabel lblFAQsTitle;
	private JButton btnPregunta1;
	private JTextPane txtpnPregunta1;
	private JButton btnPregunta2;
	private JTextPane txtpnPregunta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAQsWindow window = new FAQsWindow();
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
	public FAQsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 480);
		frame.setMaximizedBounds(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		panelHeader = new JPanel();
		panelHeader.setForeground(Color.WHITE);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 849, 100);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		btnHomeIcon = new JButton("");
		btnHomeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHomeIcon.setIcon(new ImageIcon(FAQsWindow.class.getResource("/Imagenes/home-48.png")));
		btnHomeIcon.setBounds(20, 12, 58, 74);
		btnHomeIcon.setBackground(null);
		btnHomeIcon.setBorder(null);
		panelHeader.add(btnHomeIcon);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFAQs.setBorder(null);
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(519, 37, 85, 21);
		panelHeader.add(btnFAQs);

		btnPerfil = new JButton("Perfil");
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBounds(614, 37, 85, 21);
		btnPerfil.setBackground(null);
		panelHeader.add(btnPerfil);

		btnProfileIcon = new JButton("");
		btnProfileIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProfileIcon.setIcon(new ImageIcon(FAQsWindow.class.getResource("/Imagenes/usuario-de-perfil.png")));
		btnProfileIcon.setBounds(722, 12, 73, 76);
		btnProfileIcon.setBackground(null);
		btnProfileIcon.setBorder(null);
		panelHeader.add(btnProfileIcon);

		panelMain = new JPanel();
		panelMain.setBackground(new Color(34, 40, 59));
		panelMain.setBounds(0, 100, 836, 343);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);

		btnBackIcon = new JButton("");
		btnBackIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBackIcon.setBounds(0, 0, 50, 50);
		btnBackIcon.setIcon(new ImageIcon(FAQsWindow.class.getResource("/Imagenes/arrow.png")));
		btnBackIcon.setBackground(null);
		btnBackIcon.setBorder(null);
		panelMain.add(btnBackIcon);

		lblFAQsTitle = new JLabel("Preguntas Frecuentes");
		lblFAQsTitle.setForeground(new Color(255, 255, 255));
		lblFAQsTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFAQsTitle.setBounds(311, 10, 254, 55);
		panelMain.add(lblFAQsTitle);

		btnPregunta1 = new JButton(
				"\u00BFPor qu\u00E9 no funciona correctamente el tabulador para moverse entre botones?");
		btnPregunta1.setForeground(new Color(0, 0, 255));
		btnPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPregunta1.setBounds(157, 64, 524, 55);
		btnBackIcon.setBackground(null);
		btnBackIcon.setBorder(null);
		panelMain.add(btnPregunta1);

		txtpnPregunta1 = new JTextPane();
		txtpnPregunta1.setText("Lorem ipsum dolor sit amet consectetum patata");
		txtpnPregunta1.setBounds(157, 128, 524, 50);
		panelMain.add(txtpnPregunta1);
		txtpnPregunta1.setVisible(false);

		btnPregunta2 = new JButton("\u00BFPor qu\u00E9 x?");
		btnPregunta2.setForeground(Color.BLUE);
		btnPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta2.setBounds(157, 128, 524, 50);
//			btnPregunta2.setBounds(157, 188, 524, 55);
		panelMain.add(btnPregunta2);

		txtpnPregunta2 = new JTextPane();
		txtpnPregunta2.setText("Porque si");
		txtpnPregunta2.setBounds(157, 252, 524, 50);
		panelMain.add(txtpnPregunta2);
		txtpnPregunta2.setVisible(false);

		btnPregunta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtpnPregunta1.isVisible()) {
					btnPregunta2.setBounds(157, 128, 524, 50);
					txtpnPregunta2.setBounds(157, 188, 524, 55);
					txtpnPregunta1.setVisible(false);
				} else {
					btnPregunta2.setBounds(157, 188, 524, 55);
					txtpnPregunta1.setVisible(true);
					if (txtpnPregunta2.isVisible())
						txtpnPregunta2.setBounds(157, 252, 524, 50);
				}
			}
		});

		btnPregunta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtpnPregunta1.isVisible())
					txtpnPregunta2.setBounds(157, 252, 524, 50);
				else
					txtpnPregunta2.setBounds(157, 188, 524, 55);
				if (txtpnPregunta2.isVisible())
					txtpnPregunta2.setVisible(false);
				else
					txtpnPregunta2.setVisible(true);

			}
		});

	}
}
