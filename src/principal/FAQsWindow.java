package principal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FAQsWindow {

	private JFrame frame;
	private JButton btnFAQs;
	private JButton btnPerfil;
	private JButton btnProfileIcon;
	private JButton btnHomeIcon;
	private JButton btnBackIcon;
	private JPanel panelMain;
	private JPanel panelHeader;

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
		btnHomeIcon.setIcon(new ImageIcon(FAQsWindow.class.getResource("/Imagenes/home-48.png")));
		btnHomeIcon.setBounds(20, 12, 58, 74);
		btnHomeIcon.setBackground(null);
		btnHomeIcon.setBorder(null);
		panelHeader.add(btnHomeIcon);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFAQs.setBorder(null);
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(null);
		btnFAQs.setBounds(519, 37, 85, 21);
		panelHeader.add(btnFAQs);
		
		btnPerfil = new JButton("Perfil");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBounds(614, 37, 85, 21);
		btnPerfil.setBackground(null);
		panelHeader.add(btnPerfil);

		btnProfileIcon = new JButton("");
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
			btnBackIcon.setBounds(0, 0, 50, 50);
			panelMain.add(btnBackIcon);
			btnBackIcon.setIcon(new ImageIcon("C:\\Users\\danie\\Downloads\\arrow.png"));
			btnBackIcon.setBackground(null);
			btnBackIcon.setBorder(null);

	}

}
