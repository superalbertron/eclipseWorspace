package tutorialesprogramacionya;

import java.util.Scanner;
public class TablaMultiplicar {
    public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }
    
    public void calcular(int v) {
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
    }
    
    public static void main(String[] ar) {
        TablaMultiplicar tabla;
        tabla=new TablaMultiplicar();
        tabla.cargarValor();
    }
}