package abstractavehiculo3;

public class Coche extends Vehiculo{

	public Coche(String modelo, String color,String motor) {
		super(modelo, color, motor);
		// TODO Esbozo de constructor generado automáticamente
	}
	
	@Override
	public void MostrarDatos() {
		   System.out.println(" El modelo del coche es "+getModelo()+ " el color es "
				   +getColor()+ "l motor es "+getMotor()+ "l motor es "+getMotor());
		   
	   }
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Esperamos que su próximo coche, lo compre con nosostros");
		
	}
	
	
	
	
}
