package examen1�trimAccespADatos;

import java.io.File;
import java.util.Scanner;

public class GestorArchivos {
    private Scanner scanner = new Scanner(System.in);
    private String nombreArchivo = "";
    private String contenidoArchivo = null;

    public void ingresarNombreArchivo() {
        System.out.print("Ingrese el nombre de una carpeta o fichero: ");
        nombreArchivo = scanner.nextLine();
        if (esFichero()) {
            preguntarContenidoFichero();
        }
    }

    private boolean esFichero() {
        System.out.print("�Es un fichero? (S�/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        return respuesta.equals("s�") || respuesta.equals("si");
    }

    private void preguntarContenidoFichero() {
        System.out.print("�Desea introducir informaci�n en el fichero? (S�/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        if (respuesta.equals("s�") || respuesta.equals("si")) {
            System.out.print("Ingrese el contenido del fichero: ");
            contenidoArchivo = scanner.nextLine();
        }
    }

    public String obtenerInformacion() {
        return "Nombre del archivo: " + nombreArchivo + "\n" +
                "Contenido del archivo: " + (contenidoArchivo != null ? contenidoArchivo : "Vac�o");
    }
}