package LibreriaVirtual;

public class ItemCarrito {
	Producto producto;
	int cantidad;
	boolean copiaFisica;
	double precioItem;

	public ItemCarrito(Producto producto, int cantidad, boolean copiaFisica, double precioItem) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.copiaFisica = copiaFisica;
		this.precioItem = precioItem;
	}

	public double precioItem() {
		if (producto instanceof Libro) {
			if (copiaFisica) {
				return producto.getPrecioDeCompra() * 1.18 * cantidad;
			} else {
				return producto.getPrecioDeCompra() * 1.08 * cantidad;
			}
		} else {
			if (copiaFisica) {
				return producto.getPrecioDeCompra() * 1.22 * cantidad;
			} else {
				return producto.getPrecioDeCompra() * 1.12 * cantidad;
			}
		}
	}

	public void mostrarItem() {
			System.out.println("Codigo: " + producto.getCodigo() + " - cantidad: " + cantidad);
			System.out.println("Subtotal: " + precioItem());
	}
}
