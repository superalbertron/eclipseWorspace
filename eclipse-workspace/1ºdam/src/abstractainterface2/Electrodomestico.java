package abstractainterface2;



class Electrodomestico extends Producto {
    private String marca;
    
    public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
        super(nombre, descripcion, precio);
        this.marca = marca;
    }
    
    @Override
    public void MostrarInformacion() {
    	super.MostrarInformacion();
        System.out.println("Marca: " + marca);
    }

	@Override
	public void SuCompra() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Ha comprado un electrodomestico, gracias");
	}
}
