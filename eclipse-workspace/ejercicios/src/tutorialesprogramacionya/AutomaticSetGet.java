package tutorialesprogramacionya;

public class AutomaticSetGet {
	static String nombre;
	static String edad;
	
	
	public AutomaticSetGet() {
		
		// TODO Esbozo de constructor generado autom�ticamente
	
	
	
	}


	public  String getNombre() {
		return nombre;
	}


	public  void setNombre(String nombre) {
		AutomaticSetGet.nombre = nombre;
	}


	public  String getEdad() {
		return edad;
	}


	public  void setEdad(String edad) {
		AutomaticSetGet.edad = edad;
	}


	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		AutomaticSetGet a= new  AutomaticSetGet();
		a.setEdad("54");
		a.setNombre("Alberto");
		a.getEdad();
		System.out.println(a.getEdad());
		System.out.println(a.getNombre());
	}

}
