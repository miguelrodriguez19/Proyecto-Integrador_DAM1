package SportChoice;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Administrador extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Administrador window = new Administrador();
		window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public Administrador() {
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Mis eventos");
		contenedor.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 40, 49));
		panel.setBounds(0, 0, 888, 864);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnEventos = new JButton("Eventos");
		btnEventos.setSelected(true);
		btnEventos.setForeground(Color.WHITE);
		btnEventos.setBorder(null);
		btnEventos.setBackground(new Color(129, 136, 212));
		btnEventos.setBounds(108, 69, 310, 40);
		panel.add(btnEventos);

		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setForeground(Color.WHITE);
		btnUsuarios.setBorder(null);
		btnUsuarios.setBackground(new Color(156, 163, 219));
		btnUsuarios.setBounds(420, 69, 310, 40);
		panel.add(btnUsuarios);

		JScrollPane scrollPaneEventos = new JScrollPane();
		scrollPaneEventos.setBounds(108, 120, 622, 238);
		panel.add(scrollPaneEventos);

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}
