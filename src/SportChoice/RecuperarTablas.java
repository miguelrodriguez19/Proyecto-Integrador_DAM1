package SportChoice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RecuperarTablas extends JFrame {
	private JPanel contentPane;
	private JTextField txtRutaFichero;
	private JLabel lblResultado;
	private JTextArea txtaTexto;

	public RecuperarTablas() {
		setTitle("Lectura de Ficheros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		txtRutaFichero = new JTextField();
		txtRutaFichero.setToolTipText("Inserta la ruta del fichero");
		txtRutaFichero.setBounds(141, 11, 277, 20);
		contentPane.add(txtRutaFichero);
		txtRutaFichero.setColumns(10);

		JButton btnSeleccionar = new JButton("Selecciona");
		btnSeleccionar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSeleccionar.setBounds(20, 11, 111, 23);
		contentPane.add(btnSeleccionar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 45, 299, 185);
		contentPane.add(scrollPane);

		txtaTexto = new JTextArea();
		scrollPane.setViewportView(txtaTexto);

		JButton btnLeer1 = new JButton("Leer 1");
		btnLeer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				metodo1();
			}
		});
		btnLeer1.setBounds(329, 42, 89, 23);
		contentPane.add(btnLeer1);

		lblResultado = new JLabel("");
		lblResultado.setForeground(Color.RED);
		lblResultado.setBounds(20, 241, 299, 14);
		contentPane.add(lblResultado);

		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionaFichero();
			}
		});
	}

	private void seleccionaFichero() {
		File rutaProyecto = new File(System.getProperty("user.dir"));
		JFileChooser fc = new JFileChooser(rutaProyecto);
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt");
		fc.setFileFilter(filtro);
		int seleccion = fc.showOpenDialog(contentPane);
		if (seleccion == JFileChooser.APPROVE_OPTION) {
			File fichero = fc.getSelectedFile();
			txtRutaFichero.setText(fichero.getName());
			System.out.println(txtRutaFichero);
		}
	}

	private void metodo1() {
		lblResultado.setText("");
		int i;
		InputStream miFichero;
		String texto = "";
		File file = new File(txtRutaFichero.getText());
		if (file.exists()) {
			txtaTexto.setText("");
			try {
				miFichero = new FileInputStream(file);
				i = miFichero.read();
				while (i != -1) {
					texto += (char) i;
					i = miFichero.read();
				}
				txtaTexto.setText(texto);
				miFichero.close();
			} catch (IOException e) {
				lblResultado.setText("Error de Entrada/Salida");
			}
		} else
			lblResultado.setText("El fichero no existe");
	}



}
