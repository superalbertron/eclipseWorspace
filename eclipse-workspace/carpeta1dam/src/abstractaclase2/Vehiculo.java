package abstractaclase2;

public abstract class Vehiculo {
	private String modelo;
	private String color;
	
	
	//metodo constructor
	public Vehiculo(String modelo, String color) {
		super();
		this.modelo = modelo;
		this.color = color;
	}
	//metodo getter y setter de modelo y color
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//metodo abstracto
	public void MostrarDatos() {
		
	}
	

}
