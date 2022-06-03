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
	
	private Controlador miControlador;
	private Modelo miModelo;

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
		
		btnFlecha = new JButton("");
		btnFlecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(20, 7);
			}
		});
		btnFlecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFlecha.setBorder(null);
		btnFlecha.setBackground(null);
		btnFlecha.setIcon(new ImageIcon(datosConexion.class.getResource("/Imagenes/arrow.png")));
		btnFlecha.setBounds(30, 15, 114, 68);
		panelHeader.add(btnFlecha);

		panelPaginaPrincipal = new JPanel();
		panelPaginaPrincipal.setBackground(new Color(34, 40, 49));
		panelPaginaPrincipal.setBounds(0, 100, 834, 341);
		getContentPane().add(panelPaginaPrincipal);
		panelPaginaPrincipal.setLayout(null);

		JLabel lblCampo = new JLabel("Contraseña:");
		lblCampo.setForeground(Color.WHITE);
		lblCampo.setBounds(250, 117, 114, 14);
		panelPaginaPrincipal.add(lblCampo);

		JLabel lblDato = new JLabel("Usuario:");
		lblDato.setForeground(Color.WHITE);
		lblDato.setBounds(244, 77, 92, 14);
		panelPaginaPrincipal.add(lblDato);
		
		
		txtUrlConexion = new JTextField();
		
		txtUrlConexion.setBounds(345, 161, 139, 23);
		panelPaginaPrincipal.add(txtUrlConexion);
		txtUrlConexion.setColumns(10);
		
		txtPwdConexion = new JTextField();
		
		txtPwdConexion.setBounds(346, 115, 138, 21);
		panelPaginaPrincipal.add(txtPwdConexion);
		txtPwdConexion.setColumns(10);

		txtUsuarioConexion = new JTextField();
		txtUsuarioConexion.setBounds(346, 75, 138, 20);
		panelPaginaPrincipal.add(txtUsuarioConexion);
		txtUsuarioConexion.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.guardar();
			}
		});
		btnGuardar.setBounds(520, 71, 104, 23);
		panelPaginaPrincipal.add(btnGuardar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.borrar();
			}
		});
		btnBorrar.setBounds(520, 113, 104, 23);
		panelPaginaPrincipal.add(btnBorrar);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.comprobar();
			}
		});
		btnComprobar.setBounds(520, 161, 104, 23);
		panelPaginaPrincipal.add(btnComprobar);
		
		JLabel lblRes3 = new JLabel("URL:");
		lblRes3.setForeground(Color.WHITE);
		lblRes3.setBounds(279, 165, 75, 14);
		panelPaginaPrincipal.add(lblRes3);
		
		// Etiqueta para mostrar los resultados
		lblInfo = new JLabel("");
		lblInfo.setBounds(95, 197, 159, 14);
		panelPaginaPrincipal.add(lblInfo);

	}

	public JTextField getTxtBillete() {
		return txtPwdConexion;
	}

	public void setTxtBillete(String txtBillete) {
		this.txtPwdConexion.setText(txtBillete);
	}

	public JTextField getTxtPremio() {
		return txtUsuarioConexion;
	}

	public void setTxtPremio(JTextField txtPremio) {
		this.txtUsuarioConexion = txtPremio;
	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador=miControlador;
	}
	public void setMiModelo (Modelo miModelo){
		this.miModelo = miModelo;
	}

	public String getBillete (){
		return txtPwdConexion.getText();
	}
	
	public String getPremio (){
		return txtUsuarioConexion.getText();
	}
	
	public void actualizar () {
		lblInfo.setText(miModelo.getRespuesta());
	}
	
}
