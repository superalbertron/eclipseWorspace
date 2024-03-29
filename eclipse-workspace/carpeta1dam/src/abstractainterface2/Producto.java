package abstractainterface2;

abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public void MostrarInformacion() {
    	System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        
    };
    
    @Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

	public abstract void SuCompra();
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

	
}
