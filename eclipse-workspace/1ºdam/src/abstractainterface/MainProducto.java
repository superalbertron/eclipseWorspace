package abstractainterface;



public class MainProducto {

	public static void main(String[] args) {
		Producto libro = new Libro("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
	    Producto electrodomestico = new Electrodomestico("Refrigerador", "Refrigerador de marca LG", 500, "LG");
	   
	    Libro libro1=new Libro("El señor de los anillos", "Novela de aventura", 30.00, "Tolkien");
	    Electrodomestico electro=new Electrodomestico("Refrigerador", "Refrigerador de marca LG", 500, "LG");
	    
	    libro1.mostrarInformacion();
	    System.out.println();
	    electro.mostrarInformacion();
	
	}

}
