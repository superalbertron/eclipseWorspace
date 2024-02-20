package segundotrimestre;
import java.util.ArrayList;

abstract class VehiculoEspacial{
	String nombre;
	String tipo;
	byte curvatura;
	public VehiculoEspacial(String nombre, String tipo, byte curvatura) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.curvatura = curvatura;
	}
	@Override
	public String toString() {
		return "VehículoEspacial [nombre=" + nombre + ", tipo=" + tipo + ", curvatura=" + curvatura + "]";
	}

}

class Nave extends VehiculoEspacial{

	public Nave(String nombre, String tipo, byte i) {
		super(nombre, tipo, i);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}



public class ArrayListAbstract4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<VehiculoEspacial> starship=new ArrayList();
		starship.add(new Nave("Entreprice","Galaxia",(byte) 9));
		starship.add(new Nave("Galileo","Lanzadera",(byte) 3));
		for (VehiculoEspacial vehi:starship) {
			System.out.println(vehi);
			
			
		}
		
		
		
	}

}
