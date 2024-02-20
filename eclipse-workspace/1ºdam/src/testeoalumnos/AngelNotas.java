package testeoalumnos;

import java.util.Scanner;

public class AngelNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //definimos el array de las asignaturas
        String[] asignaturas = {"Entorno","Programacion","Sistemas","Base de datos","Marcas"} ;
        //ingresamos notas asignaturas
        int notas []=new int [asignaturas.length]; 
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("Ingrese la nota de la asignatura " + asignaturas[i] + ":");
            notas[i] = sc.nextInt();
        }

        String [] resultados = calcularNotas(notas);
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("La nota de la asignatura  es: " + asignaturas[i]+" "+resultados[i]);
        }           
    }
  // metodo array con argumento array
    public static String[] calcularNotas(int[] notas) {
    	String [] resultados=new String[notas.length];
    	 for (int i = 0; i < notas.length; i++) {
             if (notas[i] < 5) {
                 resultados[i] = "Suspenso";
             }else{
                 resultados[i] = "Aprobado";
             }
         }
        return resultados;
    }
}