package anobisiesto;

public class AnoBisiesto{
	public static void main (String args[]){ 
	
	
		
		
		int a�o = 2400;
	boolean bisiesto=false; //no tiene ning�n valor se puede borrar false
	bisiesto=(a�o%4==0)&&(a�o%100!=0) || (a�o%400==0);
	System.out.println(bisiesto); 
	if(bisiesto=true){ //va implicito el valor true, no hace falta poner true, se puede borrar
		System.out.println(a�o + " es bisiesto"); 
		}else{
			System.out.println(a�o + " no es bisiesto"); 
			} 
	} 
	}