package segundotrimestre;
public class EjercicioMetodo3 {
    
    // M�todo para sumar dos n�meros y no devolver ning�n valor
  
    public static void main(String[] args) {
             
        // Llamada a los m�todos sin devolver valor
 
       
       EjercicioMetodo3.sumar(12, 2); 
       EjercicioMetodo3.restar(4, 3); 
    }
    //M�todo para sumar dos n�mreos y no devolver ning�n valor
    // con static no necesitamos crear una instancia
    
    public static void sumar(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("Suma: " + resultado);
    }

    // M�todo para restar dos n�meros y no devolver ning�n valor
    public static void restar(int num1, int num2) {
        int resultado = num1 - num2;
        System.out.println("Resta: " + resultado);
    }
}