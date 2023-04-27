package LibreriaVirtual;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		//	public Libro(int codigo, LocalDate fechaDePublicacion, boolean copiaFisica, double precioDeCompra, 
		//String titulo, String autorPrincipal, String editorial)
		
		Libro libro1 = new Libro (0001, LocalDate.of(1965, 01, 01), true, 6000.00, "Don Quijote de la Mancha", "Miguel de Cervantes", "Eudeba");
		Libro libro2 = new Libro (0002, LocalDate.of(1813, 05, 01), false, 4000.00, "Orgullo y prejuicio", "Jane Austen", "Alma");
		Libro libro3 = new Libro (0003, LocalDate.of(1609, 04, 01), true, 7000.00, "Otelo", "William Shakespeare", "Colihue");
		
		//public Revista(int codigo, LocalDate fechaDePublicacion, boolean copiaFisica, double precioDeCompra, 
		//String nombre, String editor)
		
		Revista revista4 = new Revista (0004, LocalDate.of(2023, 01, 01), false, 1400.00, "Gente", "Atlantida");
		Revista revista5 = new Revista (0005, LocalDate.of(2023, 02, 01), true, 1200.00, "Caras", "Perfil");
		Revista revista6 = new Revista (0006, LocalDate.of(2023, 03, 01), false, 1000.00, "Pronto", "Fernando Cerolini");

		
		//CREO EL CARRITO DE COMPRAS
		CarritoCompras c = new CarritoCompras();
		
		//GENERAR ITEMS
		ItemCarrito i1 = new ItemCarrito(libro1, 2, true, 6000);
		ItemCarrito i2 = new ItemCarrito(libro2, 3, false, 4000);
		ItemCarrito i3 = new ItemCarrito(libro3, 4, true, 7000);
		ItemCarrito i4 = new ItemCarrito(revista4, 1, false, 1400);
		ItemCarrito i5 = new ItemCarrito(revista5, 2, true, 1200);
		ItemCarrito i6 = new ItemCarrito(revista6, 1, false, 1000);
		
		
		//AGREGO ITEMS AL CARRITO
		c.agregarItem(i1);
		c.agregarItem(i2);
		c.agregarItem(i3);
		c.agregarItem(i4);
		c.agregarItem(i5);
		c.agregarItem(i6);
		
		//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
		c.mostrarCarrito();
		
		//
		c.precioTotal();

	}

}
