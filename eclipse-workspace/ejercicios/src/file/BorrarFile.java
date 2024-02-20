package file;

import java.io.File;
import java.io.IOException;

public class BorrarFile {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		File fichero = new File("fichero.txt");
		try{
				 fichero.createNewFile();
			 }catch (IOException e){
				 e.printStackTrace();
			 }
		 
		if (fichero.delete())
		System.out.println("El fichero ha sido borrado satisfactoriamente");
		else
		System.out.println("El fichero no puede ser borrado");

	}

}
