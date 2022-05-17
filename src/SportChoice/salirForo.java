package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.SystemColor;

public class salirForo extends JFrame{
	private Controlador miControlador;
	private Modelo miModelo;
	private JTextField txtestaSeguroQue;
	private JButton btnSiSalir, btnNoSalir, btnX, btnNewButton;

	public static void main(String[] args) {
		salirForo window = new salirForo();
		window.setVisible(true);
	}

	public salirForo() {
		initialize();
	}

	private void initialize() {
		setBounds(100, 100, 850, 480);
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(148, 107, 460, 164);
		getContentPane().add(panel);
		panel.setLayout(null);

		txtestaSeguroQue = new JTextField();
		txtestaSeguroQue.setBackground(new Color(230, 230, 250));
		txtestaSeguroQue.setHorizontalAlignment(SwingConstants.CENTER);
		txtestaSeguroQue.setToolTipText("");
		txtestaSeguroQue.setText("¿Esta seguro que desea salir del evento?");
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
		getContentPane().add(btnNewButton);

		btnX = new JButton("X");
		btnX.setBorder(null);
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(416, 10, 34, 27);
		panel.add(btnX);
	}

	

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
}
