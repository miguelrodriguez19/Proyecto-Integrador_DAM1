package SportChoice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import java.awt.Insets;

public class verEvento extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JButton btnSalirEvento, btnForo, btnLogo, btnPerfil, btnFAQs;
	private JTextArea txtAreaDescripcionVariable;
	private JLabel lblDescripcion, lblVerEvento, lblNombre, lblNombreEvento, lblDeporteVariable, lblDeporte,
			lblParticipantes, lblParticipantesVariable, lblTipoEvento, lblTipoEventoVariable, lblFecha,
			lblFechaVariable, lblLocalizacionVariable, lblLocalizacion;
	private JPanel panelHeader;
	private JButton btnLogo_1;
	private JButton btnAtras;
	private JButton btnEditar;

	public static void verEvento() {
		verEvento window = new verEvento();
		window.setVisible(true);
	}

	public verEvento() {
		initialize();
	}

	private void initialize() {
		getContentPane().setBackground(new Color(34, 40, 49));
		Container contenedor = getContentPane();
		setBounds(100, 100, 850, 480);
		setTitle("Sport Choice - Ver evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txtAreaDescripcionVariable = new JTextArea();
		txtAreaDescripcionVariable.setWrapStyleWord(true);
		txtAreaDescripcionVariable.setLineWrap(true);
		txtAreaDescripcionVariable.setEditable(false);
		txtAreaDescripcionVariable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAreaDescripcionVariable.setTabSize(0);
		txtAreaDescripcionVariable.setText(
				"Organizamos un partido de futbol unos amigos y yo pero no somos suficientes. Buscamos a 5 personas.\r\nNecesitas llevar una botella de agua propia y dos camisetas,  una roja y otra verde para poder cambiarnos y jugar todos con todos.\r\nLugar: Polideportivo de Moralzarzal, a las 17:30, el dia 25 de mayo\r\nAPUNTAROS!\r\n");
		txtAreaDescripcionVariable.setBounds(366, 237, 441, 130);
		getContentPane().add(txtAreaDescripcionVariable);

		btnForo = new JButton("FORO");
		btnForo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnForo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 5);
			}
		});
		btnForo.setBounds(697, 378, 110, 35);
		btnForo.setBorder(null);
		btnForo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnForo.setForeground(Color.WHITE);
		btnForo.setBackground(new Color(53, 187, 95));
		getContentPane().add(btnForo);
		btnSalirEvento = new JButton("ABANDONAR");
		btnSalirEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalirEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miModelo.abandonarEvento(miModelo.getEventoSeleccionado());
				miControlador.actualizar(17, 8);
			}
		});
		btnSalirEvento.setBounds(366, 378, 110, 35);
		btnSalirEvento.setForeground(Color.WHITE);
		btnSalirEvento.setBorder(null);
		btnSalirEvento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalirEvento.setBackground(Color.RED);
		getContentPane().add(btnSalirEvento);

		lblDescripcion = new JLabel("DESCRIPCION");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setBounds(366, 208, 95, 23);
		getContentPane().add(lblDescripcion);

		lblVerEvento = new JLabel("VER EVENTO");
		lblVerEvento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVerEvento.setForeground(Color.WHITE);
		lblVerEvento.setBounds(70, 123, 248, 23);
		getContentPane().add(lblVerEvento);

		lblNombre = new JLabel("NOMBRE EVENTO:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(25, 169, 135, 23);
		getContentPane().add(lblNombre);

		lblNombreEvento = new JLabel("Partido Futbol ");
		lblNombreEvento.setForeground(Color.WHITE);
		lblNombreEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEvento.setBounds(170, 169, 125, 23);
		getContentPane().add(lblNombreEvento);

		lblDeporteVariable = new JLabel("Futbol ");
		lblDeporteVariable.setForeground(Color.WHITE);
		lblDeporteVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporteVariable.setBounds(170, 237, 125, 23);
		getContentPane().add(lblDeporteVariable);

		lblDeporte = new JLabel("DEPORTE:");
		lblDeporte.setForeground(Color.WHITE);
		lblDeporte.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeporte.setBounds(25, 237, 125, 23);
		getContentPane().add(lblDeporte);

		lblParticipantes = new JLabel("PARTICIPANTES");
		lblParticipantes.setForeground(Color.WHITE);
		lblParticipantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantes.setBounds(25, 271, 125, 23);
		getContentPane().add(lblParticipantes);

		lblParticipantesVariable = new JLabel("10/14");
		lblParticipantesVariable.setForeground(Color.WHITE);
		lblParticipantesVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParticipantesVariable.setBounds(170, 271, 125, 23);
		getContentPane().add(lblParticipantesVariable);

		lblTipoEvento = new JLabel("TIPO EVENTO:");
		lblTipoEvento.setForeground(Color.WHITE);
		lblTipoEvento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEvento.setBounds(25, 305, 125, 23);
		getContentPane().add(lblTipoEvento);

		lblTipoEventoVariable = new JLabel("P\u00FAblico");
		lblTipoEventoVariable.setForeground(Color.WHITE);
		lblTipoEventoVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoEventoVariable.setBounds(170, 304, 125, 23);
		getContentPane().add(lblTipoEventoVariable);

		lblFecha = new JLabel("FECHA:");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFecha.setBounds(25, 203, 125, 23);
		getContentPane().add(lblFecha);

		lblFechaVariable = new JLabel("25 / 05 / 2022");
		lblFechaVariable.setForeground(Color.WHITE);
		lblFechaVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaVariable.setBounds(170, 203, 125, 23);
		getContentPane().add(lblFechaVariable);

		lblLocalizacionVariable = new JLabel("C/ CRUZ DE MAYO, 8, Moralzarzal, Madrid, 28411");
		lblLocalizacionVariable.setForeground(Color.WHITE);
		lblLocalizacionVariable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacionVariable.setBounds(475, 175, 332, 23);
		getContentPane().add(lblLocalizacionVariable);

		lblLocalizacion = new JLabel("LOCALIZACION:");
		lblLocalizacion.setForeground(Color.WHITE);
		lblLocalizacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocalizacion.setBounds(366, 175, 110, 23);
		getContentPane().add(lblLocalizacion);

		panelHeader = new JPanel();
		panelHeader.setLayout(null);
		panelHeader.setBackground(new Color(57, 62, 70));
		panelHeader.setBounds(0, 0, 834, 100);
		getContentPane().add(panelHeader);

		btnLogo = new JButton("");
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 10);
			}
		});
		btnLogo.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/appppp-modified.png")));
		btnLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo.setBorder(null);
		btnLogo.setBackground((Color) null);
		btnLogo.setBounds(718, 0, 99, 100);
		panelHeader.add(btnLogo);
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 10);
			}
		});

		btnPerfil = new JButton("PERFIL");
		btnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 10);
			}
		});
		btnPerfil.setToolTipText("");
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setBorder(null);
		btnPerfil.setBackground((Color) null);
		btnPerfil.setBounds(644, 43, 64, 23);
		panelHeader.add(btnPerfil);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 10);
			}
		});

		btnFAQs = new JButton("FAQS");
		btnFAQs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 4);
			}
		});
		btnFAQs.setForeground(Color.WHITE);
		btnFAQs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFAQs.setBorder(null);
		btnFAQs.setBackground((Color) null);
		btnFAQs.setBounds(587, 43, 64, 23);
		panelHeader.add(btnFAQs);
		btnFAQs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 4);
			}
		});
		
		btnLogo_1 = new JButton("");
		btnLogo_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogo_1.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/logoSportChoice.png")));

		btnLogo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 11);
			}
		});
		btnLogo_1.setBorder(null);
		btnLogo_1.setBackground((Color) null);
		btnLogo_1.setBounds(30, 15, 114, 68);
		panelHeader.add(btnLogo_1);
		
		btnAtras = new JButton("");
		btnAtras.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtras.setBorder(null);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 11);
			}
		});
		btnAtras.setBackground(null);
		btnAtras.setIcon(new ImageIcon(verEvento.class.getResource("/Imagenes/arrow.png")));
		btnAtras.setBounds(10, 115, 56, 39);
		getContentPane().add(btnAtras);
		
		btnEditar = new JButton("EDITAR");
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.actualizar(17, 9);
			}
		});
		btnEditar.setForeground(Color.WHITE);
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEditar.setBorder(null);
		btnEditar.setBackground(new Color(129, 136, 212));
		btnEditar.setBounds(530, 378, 110, 35);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				String datos[] = miModelo.cargarDatosEvento(miModelo.getEventoSeleccionado());
				lblNombreEvento.setText(datos[1]);
				lblFechaVariable.setText(datos[2]);
				lblParticipantesVariable.setText(datos[3]);
				lblDeporteVariable.setText(datos[4]);
				lblLocalizacionVariable.setText(datos[5]);
				lblTipoEventoVariable.setText(datos[6]);
				txtAreaDescripcionVariable.setText(datos[7]);
				
				if (miModelo.validarUsuarioCreador(miModelo.getEventoSeleccionado())) {
					getContentPane().add(btnEditar);
				}else {
					getContentPane().remove(btnEditar);
				}
			}
		});
		
		
	}

	
	public void setMiControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setMiModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public JTextArea getTxtAreaDescripcionVariable() {
		return txtAreaDescripcionVariable;
	}

	public void setTxtAreaDescripcionVariable(JTextArea txtAreaDescripcionVariable) {
		this.txtAreaDescripcionVariable = txtAreaDescripcionVariable;
	}

	public JLabel getLblNombreEvento() {
		return lblNombreEvento;
	}

	public void setLblNombreEvento(JLabel lblNombreEvento) {
		this.lblNombreEvento = lblNombreEvento;
	}

	public JLabel getLblDeporteVariable() {
		return lblDeporteVariable;
	}

	public void setLblDeporteVariable(JLabel lblDeporteVariable) {
		this.lblDeporteVariable = lblDeporteVariable;
	}

	public JLabel getLblParticipantesVariable() {
		return lblParticipantesVariable;
	}

	public void setLblParticipantesVariable(JLabel lblParticipantesVariable) {
		this.lblParticipantesVariable = lblParticipantesVariable;
	}

	public JLabel getLblTipoEventoVariable() {
		return lblTipoEventoVariable;
	}

	public void setLblTipoEventoVariable(JLabel lblTipoEventoVariable) {
		this.lblTipoEventoVariable = lblTipoEventoVariable;
	}

	public JLabel getLblFechaVariable() {
		return lblFechaVariable;
	}

	public void setLblFechaVariable(JLabel lblFechaVariable) {
		this.lblFechaVariable = lblFechaVariable;
	}

	public JLabel getLblLocalizacionVariable() {
		return lblLocalizacionVariable;
	}

	public void setLblLocalizacionVariable(JLabel lblLocalizacionVariable) {
		this.lblLocalizacionVariable = lblLocalizacionVariable;
	}
}
