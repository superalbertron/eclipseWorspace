package ficherostexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero01 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("c:\\prueba\\ciudades.txt"));
			String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
			System.out.println("No se encuentra el fichero ciudades.txt");
		} catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
			System.out.println("No se puede leer el fichero ciudades.txt");
		}
	}
}