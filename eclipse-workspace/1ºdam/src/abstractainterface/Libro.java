package abstractainterface;



class Libro extends Producto {
    private String autor;
    
    public Libro(String nombre, String descripcion, double precio, String autor) {
        super(nombre, descripcion, precio);
        this.autor = autor;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripcion: " + getDescripcion());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Autor: " + autor);
    }
}

