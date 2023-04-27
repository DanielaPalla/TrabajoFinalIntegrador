package LibreriaVirtual;

import java.util.ArrayList;

public class CarritoCompras {
	private ArrayList<ItemCarrito> items;

	public CarritoCompras() {
		this.items = new ArrayList<ItemCarrito>();
	}

	public void agregarItem(ItemCarrito ic) {
		this.items.add(ic);
	}

	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	public void mostrarCarrito() {
		for (ItemCarrito i : items) {
			i.mostrarItem();
		}
	}

	public void precioTotal() {
		double total = 0;
		for (ItemCarrito i : items) {
			total = total + i.precioItem();
		}
		System.out.println("Precio total: " + total);
	}
}

