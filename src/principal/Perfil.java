package principal;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class Perfil {

	private JFrame frame;
	private JPanel header;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil window = new Perfil();
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
	public Perfil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		frame.setBounds(100, 100, 850, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		header = new JPanel();
		header.setBorder(null);
		header.setBackground(new Color(57, 62, 70));
		header.setBounds(0, 0, 837, 100);
		frame.getContentPane().add(header);
		header.setLayout(null);
		
		lblNewLabel_1 = new JLabel("@DogueDrake");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(618, 28, 123, 28);
		header.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Luis Rodriguez Gonzalez");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(547, 52, 194, 28);
		header.add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/appppp-modified.png")));
		lblNewLabel.setBounds(736, 0, 101, 100);
		header.add(lblNewLabel);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/marker-free-icon-font (1) (1).png")));
		lblNewLabel_3.setBounds(84, 142, 27, 37);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
