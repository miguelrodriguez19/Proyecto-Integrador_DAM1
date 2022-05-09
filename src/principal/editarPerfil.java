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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;

public class editarPerfil {

	private JFrame frame;
	private JPanel header;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField txtNuevaLocalidad;
	private JTextField txtNuevoSexo;
	private JTextField txtNuevoDeporte;
	private JTextArea txtrModificarDescripcion;
	private JTextField txtNuevoNombreDe;
	private JTextField txtNuevoNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editarPerfil window = new editarPerfil();
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
	public editarPerfil() {
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
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/image-modified-modified.png")));
		lblNewLabel.setBounds(736, 0, 101, 100);
		header.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(57, 62, 70));
		btnNewButton_1.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/home-48.png")));
		btnNewButton_1.setBounds(10, 10, 85, 70);
		header.add(btnNewButton_1);
		
		txtNuevoNombreDe = new JTextField();
		txtNuevoNombreDe.setForeground(Color.LIGHT_GRAY);
		txtNuevoNombreDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoNombreDe.setText("Nuevo nombre de usuario...");
		txtNuevoNombreDe.setBounds(523, 27, 203, 23);
		header.add(txtNuevoNombreDe);
		txtNuevoNombreDe.setColumns(10);
		
		txtNuevoNombre = new JTextField();
		txtNuevoNombre.setForeground(Color.LIGHT_GRAY);
		txtNuevoNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoNombre.setText("Nuevo nombre...");
		txtNuevoNombre.setBounds(523, 56, 203, 23);
		header.add(txtNuevoNombre);
		txtNuevoNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(34, 40, 49));
		btnNewButton.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/arrow.png")));
		btnNewButton.setBounds(20, 99, 59, 52);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/marker-free-icon-font (1) (1) (1) (1).png")));
		lblNewLabel_3.setBounds(79, 129, 33, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/venus-mars-free-icon-font (1).png")));
		lblNewLabel_4.setBounds(79, 172, 33, 33);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/calendar-free-icon-font (1).png")));
		lblNewLabel_5.setBounds(299, 129, 33, 33);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/basketball-free-icon-font (1).png")));
		lblNewLabel_6.setBounds(299, 172, 33, 33);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/thumbs-up-free-icon-font (1).png")));
		lblNewLabel_7.setBounds(505, 129, 33, 33);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(editarPerfil.class.getResource("/Imagenes/document-free-icon-font (1).png")));
		lblNewLabel_8.setBounds(79, 215, 33, 33);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_11 = new JLabel("19 a\u00F1os");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(336, 129, 145, 33);
		frame.getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_13 = new JLabel("125");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(542, 129, 145, 33);
		frame.getContentPane().add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Descripcion");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(111, 215, 145, 33);
		frame.getContentPane().add(lblNewLabel_14);
		
		btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(53, 187, 95));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(642, 382, 133, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		txtNuevaLocalidad = new JTextField();
		txtNuevaLocalidad.setForeground(Color.LIGHT_GRAY);
		txtNuevaLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevaLocalidad.setText("Nueva localidad...");
		txtNuevaLocalidad.setBounds(111, 138, 145, 24);
		frame.getContentPane().add(txtNuevaLocalidad);
		txtNuevaLocalidad.setColumns(10);
		
		txtNuevoSexo = new JTextField();
		txtNuevoSexo.setForeground(Color.LIGHT_GRAY);
		txtNuevoSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoSexo.setText("Nuevo sexo...");
		txtNuevoSexo.setBounds(111, 181, 145, 24);
		frame.getContentPane().add(txtNuevoSexo);
		txtNuevoSexo.setColumns(10);
		
		txtNuevoDeporte = new JTextField();
		txtNuevoDeporte.setForeground(Color.LIGHT_GRAY);
		txtNuevoDeporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNuevoDeporte.setText("Nuevo deporte...");
		txtNuevoDeporte.setBounds(336, 181, 145, 24);
		frame.getContentPane().add(txtNuevoDeporte);
		txtNuevoDeporte.setColumns(10);
		
		txtrModificarDescripcion = new JTextArea();
		txtrModificarDescripcion.setForeground(Color.LIGHT_GRAY);
		txtrModificarDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrModificarDescripcion.setText("Modificar descripcion...");
		txtrModificarDescripcion.setBounds(111, 246, 550, 105);
		frame.getContentPane().add(txtrModificarDescripcion);
	}
}