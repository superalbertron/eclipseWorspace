package diagramasdeflujo;

import java.util.Scanner;

public class CajaRegistradoraSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        while (true) {
            // Men� de opciones
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Total");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opci�n: ");

            // Leer la opci�n seleccionada por el usuario
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Opci�n "Agregar Producto"
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    total += precioProducto;
                    System.out.println(nombreProducto + " agregado al total.");
                    break;
                case 2:
                    // Opci�n "Mostrar Total"
                    System.out.println("Total en la caja registradora: $" + total);
                    break;
                case 3:
                    // Opci�n "Salir"
                    System.out.println("Saliendo de la caja registradora.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opci�n no v�lida. Int�ntelo de nuevo.");
            }
        }
    }
}
