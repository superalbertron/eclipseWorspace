package diagramasdeflujo;

import java.util.Scanner;

public class NumeroPerfecto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee el n�mero N desde la entrada del usuario
        System.out.print("Ingrese un n�mero N: ");
        int N = scanner.nextInt();

        // Verifica si el n�mero N es perfecto
        if (esNumeroPerfecto(N)) {
            System.out.println(N + " es un n�mero perfecto.");
        } else {
            System.out.println(N + " no es un n�mero perfecto.");
        }

        // Cierra el Scanner
        scanner.close();
    }

    // M�todo para verificar si un n�mero es perfecto
    public static boolean esNumeroPerfecto(int num) {
        // Inicializa la suma de los divisores
        int sumaDivisores = 0;

        // Itera sobre los posibles divisores hasta num/2
        for (int i = 1; i <= num / 2; i++) {
            // Si i es un divisor, lo suma a la sumaDivisores
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verifica si la suma de los divisores es igual al n�mero original
        return sumaDivisores == num;
    }
}
