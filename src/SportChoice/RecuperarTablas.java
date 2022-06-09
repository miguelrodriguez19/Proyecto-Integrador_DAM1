package SportChoice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class RecuperarTablas extends JFrame {
	private JPanel contentPane;
	private JTextField txtRutaFichero;
	private JLabel lblResultado;
	private JTextArea txtaTexto;

	
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
	
	public void backup(DefaultTableModel d) {
		
	}



	
}
