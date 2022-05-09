package principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;

public class HistorialWindow {

	private JFrame frame;
	private JList list;
	private JButton btnFAQs;
	private JButton btnPerfil;
	private JLabel lblHistorialTitle;
	private JLabel lblProfileIcon;
	private JLabel lblHomeIcon;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		HistorialWindow window = null;
		try {
			window = new HistorialWindow();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		window.frame.setVisible(true);
	}

	public HistorialWindow() throws IOException {

		frame = new JFrame();
		frame.setBounds(100, 100, 850, 480);
		frame.setMaximizedBounds(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setLayout(null);

		JPanel panelHeader = new JPanel();
		panelHeader.setForeground(Color.WHITE);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		frame.getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		btnFAQs = new JButton("FAQs");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFAQs.setBorder(null);
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setBackground(new Color(57, 62, 70));
		btnFAQs.setBounds(496, 37, 85, 21);
		panelHeader.add(btnFAQs);

		btnPerfil = new JButton("Perfil");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBounds(614, 37, 85, 21);
		btnPerfil.setBackground(new Color(57, 62, 70));
		panelHeader.add(btnPerfil);

		lblProfileIcon = new JLabel("");
		lblProfileIcon.setFont(new Font("Tahoma", Font.PLAIN, 96));
		lblProfileIcon.setIcon(new ImageIcon("C:\\Users\\danie\\Downloads\\usuario-de-perfil.png"));
		lblProfileIcon.setBounds(709, 10, 73, 76);
		panelHeader.add(lblProfileIcon);

		lblHomeIcon = new JLabel("");
		lblHomeIcon.setForeground(new Color(0, 0, 0));
		lblHomeIcon.setBounds(20, 12, 58, 74);
		panelHeader.add(lblHomeIcon);
		lblHomeIcon.setIcon(new ImageIcon("C:\\Users\\danie\\Downloads\\icons8-home-48.png"));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\danie\\Downloads\\icons8-back-50 (1).png"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(17, 108, 50, 50);
		frame.getContentPane().add(lblNewLabel_1);

		JPanel panelMain = new JPanel();
		panelMain.setBackground(new Color(34, 40, 59));
		panelMain.setBounds(0, 100, 836, 343);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);

		lblHistorialTitle = new JLabel("Historial");
		lblHistorialTitle.setBounds(365, 10, 139, 48);
		panelMain.add(lblHistorialTitle);
		lblHistorialTitle.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblHistorialTitle.setForeground(new Color(238, 238, 238));

		table = new JTable();
		table.setBounds(97, 68, 709, 265);
		panelMain.add(table);

	}
}