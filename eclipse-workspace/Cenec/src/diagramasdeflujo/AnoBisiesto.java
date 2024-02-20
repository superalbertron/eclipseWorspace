package diagramasdeflujo;

import java.util.Scanner;

public class AnoBisiesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee el a�o desde la entrada del usuario
        System.out.print("Ingrese un a�o: ");
        int year = scanner.nextInt();

        // Verifica si el a�o es bisiesto
        if (esBisiesto(year)) {
            System.out.println(year + " es un a�o bisiesto.");
        } else {
            System.out.println(year + " no es un a�o bisiesto.");
        }

        // Cierra el Scanner
        scanner.close();
    }

    // M�todo para verificar si un a�o es bisiesto
    public static boolean esBisiesto(int year) {
        // Condici�n para a�os bisiestos
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
