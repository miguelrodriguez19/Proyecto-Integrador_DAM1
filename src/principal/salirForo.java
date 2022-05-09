package principal;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class salirForo {

	private JFrame frame;
	private JTextField txtestaSeguroQue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salirForo window = new salirForo();
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
	public salirForo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 480);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));
		panel.setBounds(148, 107, 460, 164);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtestaSeguroQue = new JTextField();
		txtestaSeguroQue.setBackground(new Color(230, 230, 250));
		txtestaSeguroQue.setHorizontalAlignment(SwingConstants.CENTER);
		txtestaSeguroQue.setToolTipText("");
		txtestaSeguroQue.setText("\u00BFEsta seguro que desea salir del evento?");
		txtestaSeguroQue.setBounds(95, 26, 266, 39);
		panel.add(txtestaSeguroQue);
		txtestaSeguroQue.setColumns(10);
		
		JButton btnSiSalir = new JButton("SI");
		btnSiSalir.setBorder(null);
		btnSiSalir.setBackground(new Color(34, 139, 34));
		btnSiSalir.setBounds(95, 86, 105, 39);
		panel.add(btnSiSalir);
		
		JButton btnNoSalir = new JButton("NO");
		btnNoSalir.setBackground(new Color(255, 0, 0));
		btnNoSalir.setBorder(null);
		btnNoSalir.setBounds(261, 86, 100, 39);
		panel.add(btnNoSalir);
		
		JButton btnNewButton_2 = new JButton("SALIR DEL EVENTO\r\n");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(622, 355, 157, 51);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnX = new JButton("X");
		btnX.setBorder(null);
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(416, 10, 34, 27);
		panel.add(btnX);
	}

}
