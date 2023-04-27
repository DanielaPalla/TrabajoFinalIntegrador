package LibreriaVirtual;

import java.time.LocalDate;

public class Libro extends Producto {
	private String titulo;
	private String autorPrincipal;
	private String editorial;

	public Libro(int codigo, LocalDate fechaDePublicacion, boolean copiaFisica, double precioDeCompra, String titulo,
			String autorPrincipal, String editorial) {
		super(codigo, fechaDePublicacion, copiaFisica, precioDeCompra);
		this.titulo = titulo;
		this.autorPrincipal = autorPrincipal;
		this.editorial = editorial;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutorPrincipal() {
		return autorPrincipal;
	}

	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
