package ficherostexto;

import java.io.File;

/**
 * Ejemplo de uso de la clase File Comprobaci�n de existencia y borrado de un
 * fichero
 *
 * @author Luis Jos� S�nchez
 */
public class ExisteFile {
	public static void main(String[] args) {
				String nombreFichero = "c:\\prueba\\malaga.txt";
		File fichero = new File(nombreFichero);
		if (fichero.exists()) {
			fichero.delete();
			System.out.println("El fichero se ha borrado correctamente.");
		} else {
			System.out.println("El fichero " + nombreFichero + " no existe.");
		}
	}
}