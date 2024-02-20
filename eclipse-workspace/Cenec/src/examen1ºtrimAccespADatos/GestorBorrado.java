package examen1�trimAccespADatos;

import java.io.File;
import java.util.Scanner;

class GestorBorrado {
    private Scanner scanner = new Scanner(System.in);

    public void realizarBorrado() {
        System.out.println("Men� Borrar:");
        System.out.println("1. Borrar Carpeta");
        System.out.println("2. Borrar Fichero");
        System.out.println("3. Volver al Men� Principal");
        System.out.print("Seleccione una opci�n: ");

        switch (scanner.nextInt()) {
            case 1:
                borrarCarpeta();
                break;
            case 2:
                borrarFichero();
                break;
            case 3:
                System.out.println("Volviendo al Men� Principal");
                break;
            default:
                System.out.println("Opci�n no v�lida");
        }
    }

    private void borrarCarpeta() {
        System.out.print("Ingrese el nombre de la carpeta a borrar: ");
        String nombreCarpeta = scanner.next();

        File carpeta = new File(nombreCarpeta);
        if (carpeta.exists() && carpeta.isDirectory() && carpeta.listFiles() != null && carpeta.listFiles().length == 0) {
            carpeta.delete();
            System.out.println("La carpeta " + nombreCarpeta + " ha sido borrada exitosamente.");
        } else {
            System.out.println("La carpeta no existe, no es v�lida o no est� vac�a.");
        }
    }

    private void borrarFichero() {
        System.out.print("Ingrese el nombre del fichero a borrar: ");
        String nombreFichero = scanner.next();

        File fichero = new File(nombreFichero);
        if (fichero.exists() && fichero.isFile()) {
            fichero.delete();
            System.out.println("El fichero " + nombreFichero + " ha sido borrado exitosamente.");
        } else {
            System.out.println("El fichero no existe o no es v�lido.");
        }
    }
}