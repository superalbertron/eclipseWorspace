import java.util.Scanner;

public class CalculadoraMetodo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer n�mero: ");                                             
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo n�mero: ");
        numero2 = sc.nextInt();
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    }

    //m�todo sumar
    public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }

}