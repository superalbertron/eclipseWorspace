package segundotrimestre;

public class EjercicioMetodo2 {
    
       // M�todo para sumar dos n�meros y devolver el resultado
    public int sumarConReturn(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    // M�todo para restar dos n�meros y devolver el resultado
    public int restarConReturn(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static void main(String[] args) {
        EjercicioMetodo2 calculadora = new EjercicioMetodo2();
        
        // Llamada a los m�todos sin devolver valor
        
        // Llamada a los m�todos con devoluci�n de valor
        int resultadoSuma = calculadora.sumarConReturn(7, 2);
        int resultadoResta = calculadora.restarConReturn(15, 8);

        System.out.println("Resultado de la suma con return: " + resultadoSuma);
        System.out.println("Resultado de la resta con return: " + resultadoResta);
    }
}
