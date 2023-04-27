package LibreriaVirtual;

import java.time.LocalDate;

public abstract class Producto {
	private int codigo;
	private LocalDate fechaDePublicacion;
	private boolean copiaFisica;
	private double precioDeCompra;

	public Producto(int codigo, LocalDate fechaDePublicacion, boolean copiaFisica, double precioDeCompra) {
		this.codigo = codigo;
		this.fechaDePublicacion = fechaDePublicacion;
		this.copiaFisica = copiaFisica;
		this.precioDeCompra = precioDeCompra;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public boolean getCopiaFisica() {
		return copiaFisica;
	}

	public void setCopiaFisica(boolean copiaFisica) {
		this.copiaFisica = copiaFisica;
	}

	public double getPrecioDeCompra() {
		return precioDeCompra;
	}

	public void setPrecioDeCompra(double precioDeCompra) {
		this.precioDeCompra = precioDeCompra;
	}

}
