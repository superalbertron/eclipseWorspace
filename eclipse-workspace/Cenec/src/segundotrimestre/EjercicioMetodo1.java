package segundotrimestre;

public class EjercicioMetodo1 {
    
    // M�todo para sumar dos n�meros y no devolver ning�n valor
    public void sumar(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("Suma: " + resultado);
    }

    // M�todo para restar dos n�meros y no devolver ning�n valor
    public void restar(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("Resta: " + resultado);
    }
    

    public static void main(String[] args) {
        EjercicioMetodo1 calculadora = new EjercicioMetodo1();
        
        // Llamada a los m�todos sin devolver valor
        calculadora.sumar(5, 3);
        calculadora.restar(10, 4);
        
    }
}

