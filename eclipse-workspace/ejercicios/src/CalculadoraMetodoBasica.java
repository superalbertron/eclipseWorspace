

public class CalculadoraMetodoBasica {
    
    double n1;
    double n2;
    double res;
    char operacion;

    
    public CalculadoraMetodoBasica(double n1, double n2, char operacion) {
        
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }
    
        
    public void mostrarResultado(){
        
        System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);
        
    }
}