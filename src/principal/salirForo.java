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
	private JButton btnSiSalir;
	private JButton btnNoSalir;
	private JButton btnX;
	private JButton btnNewButton;

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
		frame.getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
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
		
		btnSiSalir = new JButton("SI");
		btnSiSalir.setBorder(null);
		btnSiSalir.setBackground(new Color(53, 187, 95));
		btnSiSalir.setBounds(95, 86, 105, 39);
		panel.add(btnSiSalir);
		
		btnNoSalir = new JButton("NO");
		btnNoSalir.setBackground(Color.RED);
		btnNoSalir.setBorder(null);
		btnNoSalir.setBounds(261, 86, 100, 39);
		panel.add(btnNoSalir);
		
		btnNewButton = new JButton("SALIR DEL EVENTO\r\n");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(622, 355, 157, 51);
		frame.getContentPane().add(btnNewButton);
		
		btnX = new JButton("X");
		btnX.setBorder(null);
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(416, 10, 34, 27);
		panel.add(btnX);
	}

}
