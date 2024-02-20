package file;

import java.io.File;

public class CrearFile {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		 
		try {
		 
			// Desde esta opci�n encapsulamos el fichero
		 
			File fichero = new File("c:\\prueba\\myfile.txt");
		 
			// Creamos el fichero desde el objeto 
		 
			if (fichero.createNewFile())
		                  	System.out.println("El fichero se ha creado ok");
			else
		  		System.out.println("Error en la creaci�n del fichero");
		 
		} catch (Exception e) {
		 
		    	 System.out.println(e.getMessage());   		
		}

	}

}
