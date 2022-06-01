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

/**
 * @author Pedro Camacho
 */
public class datosConexion extends JFrame {

	private JPanel panelPaginaPrincipal, panelHeader;
	private JTextField txtBillete, txtPremio;
	private JLabel lblInfo;
	private JButton btnGuardar, btnFlecha;
	private JButton btnBorrar;
	private JButton btnComprobar;
	
	private Controlador miControlador;
	private Modelo miModelo;

	public datosConexion() {
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

		JLabel lblBillete = new JLabel("Campo a cambiar:");
		lblBillete.setForeground(Color.WHITE);
		lblBillete.setBounds(250, 77, 114, 14);
		panelPaginaPrincipal.add(lblBillete);

		JLabel lblPremio = new JLabel("Nuevo contenido:");
		lblPremio.setForeground(Color.WHITE);
		lblPremio.setBounds(250, 117, 104, 14);
		panelPaginaPrincipal.add(lblPremio);

		txtBillete = new JTextField();
		txtBillete.setBounds(387, 75, 86, 20);
		panelPaginaPrincipal.add(txtBillete);
		txtBillete.setColumns(10);

		txtPremio = new JTextField();
		txtPremio.setBounds(387, 115, 86, 20);
		panelPaginaPrincipal.add(txtPremio);
		txtPremio.setColumns(10);

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
		
		JLabel lblRes3 = new JLabel("Resultado:");
		lblRes3.setForeground(Color.WHITE);
		lblRes3.setBounds(263, 197, 75, 14);
		panelPaginaPrincipal.add(lblRes3);
		
		// Etiqueta para mostrar los resultados
		lblInfo = new JLabel("");
		lblInfo.setBounds(95, 197, 159, 14);
		panelPaginaPrincipal.add(lblInfo);

	}

	public void setMiControlador(Controlador miControlador) {
		this.miControlador=miControlador;
	}
	public void setMiModelo (Modelo miModelo){
		this.miModelo = miModelo;
	}

	public String getBillete (){
		return txtBillete.getText();
	}
	
	public String getPremio (){
		return txtPremio.getText();
	}
	
	public void actualizar () {
		lblInfo.setText(miModelo.getRespuesta());
	}
	
}
