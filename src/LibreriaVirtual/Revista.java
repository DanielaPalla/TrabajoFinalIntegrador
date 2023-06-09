package LibreriaVirtual;

import java.time.LocalDate;

public class Revista extends Producto {
	private String nombre;
	private String editor;

	public Revista(int codigo, LocalDate fechaDePublicacion, boolean copiaFisica, double precioDeCompra, String nombre, String editor) {
		super(codigo, fechaDePublicacion, copiaFisica, precioDeCompra);
		this.nombre = nombre;
		this.editor = editor;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

}
