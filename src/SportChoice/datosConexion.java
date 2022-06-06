package SportChoice;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

/**
 * @author Pedro Camacho
 */
public class datosConexion extends JFrame {

	private JPanel panelPaginaPrincipal, panelHeader;
	private JTextField txtPwdConexion, txtUsuarioConexion, txtUrlConexion;
	private JLabel lblInfo;
	private JButton btnGuardar, btnFlecha;
	private JButton btnBorrar;
	private JButton btnComprobar;
	private String strBillete;
	private String[] claves = { "Usr", "Pwd", "URL" };

	public String[] getClaves() {
		return claves;
	}

	public void setClaves(String[] claves) {
		this.claves = claves;
	}

	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnDefault;

	public datosConexion() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				txtUsuarioConexion.setText(miModelo.getDatosConexion().getProperty("Usr"));
				txtPwdConexion.setText(miModelo.getDatosConexion().getProperty("pwd"));
				txtUrlConexion.setText(miModelo.getDatosConexion().getProperty("URL"));
			}
		});
		setResizable(false);
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sport Choice - Datos Conexión");
		contenedor.setLayout(null);

		panelHeader = new JPanel();
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);
		panelHeader.setLayout(null);

		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34, 40, 49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);

		JLabel lblCampo = new JLabel("Contraseña:");
		lblCampo.setForeground(Color.WHITE);
		lblCampo.setBounds(24, 133, 114, 14);
		panelPaginaPrincipal.add(lblCampo);

		JLabel lblDato = new JLabel("Usuario:");
		lblDato.setForeground(Color.WHITE);
		lblDato.setBounds(24, 79, 92, 14);
		panelPaginaPrincipal.add(lblDato);

		txtUrlConexion = new JTextField();

		txtUrlConexion.setBounds(23, 212, 321, 23);
		panelPaginaPrincipal.add(txtUrlConexion);
		txtUrlConexion.setColumns(10);

		txtPwdConexion = new JTextField();

		txtPwdConexion.setBounds(24, 157, 184, 21);
		panelPaginaPrincipal.add(txtPwdConexion);
		txtPwdConexion.setColumns(10);

		txtUsuarioConexion = new JTextField();
		txtUsuarioConexion.setBounds(24, 103, 184, 20);
		panelPaginaPrincipal.add(txtUsuarioConexion);
		txtUsuarioConexion.setColumns(10);

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.guardar();
			}
		});
		btnGuardar.setBounds(690, 283, 114, 32);
		btnGuardar.setBackground(new Color(53, 187, 95));
		btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelPaginaPrincipal.add(btnGuardar);

		JLabel lblRes3 = new JLabel("URL de la Base de Datos:");
		lblRes3.setForeground(Color.WHITE);
		lblRes3.setBounds(24, 188, 230, 14);
		panelPaginaPrincipal.add(lblRes3);

		// Etiqueta para mostrar los resultados
		lblInfo = new JLabel("");
		lblInfo.setBounds(95, 197, 159, 14);
		panelPaginaPrincipal.add(lblInfo);

		btnFlecha = new JButton("");
		btnFlecha.setBounds(24, 7, 55, 68);
		panelPaginaPrincipal.add(btnFlecha);
		btnFlecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(20, 7);
			}
		});
		btnFlecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFlecha.setBorder(null);
		btnFlecha.setBackground(null);
		btnFlecha.setIcon(new ImageIcon(datosConexion.class.getResource("/Imagenes/arrow.png")));

		JLabel lblNewLabel = new JLabel("EDITAR DATOS DE LA CONEXIÓN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(86, 21, 504, 36);
		panelPaginaPrincipal.add(lblNewLabel);

		btnDefault = new JButton("DATOS POR DEFECTO");
		btnDefault.setBackground(new Color(156, 163, 219));
		btnDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsuarioConexion.setText("root\r\n");
				txtPwdConexion.setText("");
				txtUrlConexion.setText("jdbc:mysql://localhost/ProyectoIntegrador");

			}
		});
		btnDefault.setForeground(Color.BLACK);
		btnDefault.setBounds(24, 283, 159, 34);
		btnDefault.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelPaginaPrincipal.add(btnDefault);

	}

	public JTextField getTxtPwdConexion() {
		return txtPwdConexion;
	}

	public void setTxtPwdConexion(JTextField txtPwdConexion) {
		this.txtPwdConexion = txtPwdConexion;
	}

	public JTextField getTxtUsuarioConexion() {
		return txtUsuarioConexion;
	}

	public void setTxtUsuarioConexion(JTextField txtUsuarioConexion) {
		this.txtUsuarioConexion = txtUsuarioConexion;
	}

	public JTextField getTxtUrlConexion() {
		return txtUrlConexion;
	}

	public void setTxtUrlConexion(JTextField txtUrlConexion) {
		this.txtUrlConexion = txtUrlConexion;
	}

	public Controlador getMiControlador() {
		return miControlador;
	}

	public Modelo getMiModelo() {
		return miModelo;
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void actualizar() {
		lblInfo.setText(miModelo.getRespuesta());
	}
}
