
import javax.swing.JOptionPane;

public class StringConsola{
	
	
	public static void main(String[] args) {
		String Nombre;
	
	               
		String[][] Alumnos = {
	                              {"Federico", "14 a�os"},
	                              {"Rodrigo", "15 a�os"},
	                              {"Pedro", "20 a�os"},
	                              {"Federico", "18 a�os"},
	                              {"Pedro", "23 a�os"},
	                              {"Federico", "15 a�os"},
	                              {"Pedro", "10 a�os"}
	                         };
	  Nombre = JOptionPane.showInputDialog("Que alumnos Busca");
	    // System.out.println(Nombre); * DEBUG *
	
	   
	    for (int i=0; i<Alumnos.length; i++){
		//	System.out.println(Nombre);  * DEBUG *    	
	    		    	
	    	if (Alumnos[i][0].equals(Nombre)) {
	    	   	//	System.out.println(Nombre);
				System.out.println(Alumnos[i][0] + " " + Alumnos[i][1]);
				
	    	}
		}        
	}
}