package ficherostexto;

import java.io.File;

/**
 * Ejemplo de uso de la clase File Comprobaci�n de existencia y borrado de un
 * fichero
 *
 * @author Luis Jos� S�nchez
 */
public class CrearCarpeta {
	public static void main(String[] args) {
		String ruta="c:\\prueba\\";
		String carpeta = "ejercicio1";
		File fichero = new File(ruta+carpeta);
		fichero.mkdir();
		System.out.println("carpeta creada");
		
	}
	
}