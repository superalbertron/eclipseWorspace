package segundotrimestre;
import java.util.ArrayList;
//clase abstracta

 class persona{
	 String nombre;

	public persona(String nombre) {
		super();
		this.nombre = nombre;
	}
 @Override
 public String toString() {
	 return " Heroe "+nombre;
 }
	
  }

//definimos clase heroe
 
 class superHeroe extends persona{

	public superHeroe(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	 	
	 
 } 


public class ArrayListAbstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<persona> heroeBueno=new ArrayList<>(); //estamos creando una nueva instancia de ArrayList y que 
	// se inicia como una lista vacia del tipo persona que es la clase abstracta
	heroeBueno.add(new superHeroe("Thor"));
	heroeBueno.add(new superHeroe("Superman"));
	
	for (persona superHeroe:heroeBueno) {
		System.out.println(superHeroe);
			
	}
		
	}

}