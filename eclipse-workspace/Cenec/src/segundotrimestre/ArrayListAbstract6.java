package segundotrimestre;
import java.util.ArrayList;

abstract class Contabilidad{
	String descripcion;
	int precio, unidades;
	public Contabilidad(String descripcion, int precio, int unidades) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidades = unidades;
	}
	
	
	public int getPrecio() {
		return precio;
	}


	public int getUnidades() {
		return unidades;
	}

    public abstract int totalUnidades();
	public abstract double iva();
	public abstract double total();
		
	@Override
	public String toString() {
		return "contabilidad [descripcion=" + descripcion + ", precio=" + precio + ", unidades=" + unidades + "]";
	}
	
	
	
}

class Factura extends Contabilidad{

	public Factura(String descripcion, int precio, int unidades) {
		super(descripcion, precio, unidades);
		// TODO Auto-generated constructor stub
	}
	
	
	public double iva() {
		return (totalUnidades()*0.21);		
		
	}
	public double total() {
		return totalUnidades()+iva();		
		
	}
	
	public int totalUnidades() {
		// TODO Auto-generated method stub
		return getPrecio()*getUnidades();
	}
}



public class ArrayListAbstract6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contabilidad> countMoney=new ArrayList();
		countMoney.add(new Factura("Tablet",100,2));
		countMoney.add(new Factura("Portatil",1000,2));
		for (Contabilidad listCont:countMoney) {
			System.out.println(listCont+" "+" total unidades "+listCont.totalUnidades()+
					" iva "+listCont.iva()+" total importe "+listCont.total());
			
			
		}
	}

}