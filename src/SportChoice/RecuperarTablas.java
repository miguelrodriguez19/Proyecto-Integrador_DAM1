package SportChoice;

import java.io.Serial;
import java.io.Serializable;

import javax.swing.table.DefaultTableModel;

public class RecuperarTablas implements Serializable {
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modeloTabla;

	public RecuperarTablas(DefaultTableModel modelo) {
		super();
		this.modeloTabla = modelo;
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public void setModeloTabla(DefaultTableModel modelo) {
		this.modeloTabla = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
