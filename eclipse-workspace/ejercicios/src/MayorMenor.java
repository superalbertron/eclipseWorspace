
import javax.swing.*;
public class MayorMenor {

	
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	
		int max, min;
	
		int [] vector1= {1,1,2,3,4};
		
		//max=min=vector[5];

		
		for (int i = 0; i < vector1.length; i++) {
		              
		        if(vector1[i]>max){
		        
		            max=vector1[i];
		            
		        }
		        
		        if(vector1[i]<min){
		        
		            min=vector1[i];
		            
		        }
		      
		}

		JOptionPane.showMessageDialog(null, "Valor M�ximo = "+max+"\n Valor M�nimo = "+min);
	

}
}
