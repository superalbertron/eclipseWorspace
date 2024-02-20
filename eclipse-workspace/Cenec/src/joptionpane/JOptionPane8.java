package joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPane8 {
    public static void main(String[] args) {
        // Configura los textos de los botones en espa�ol
        UIManager.put("OptionPane.yesButtonText", "S�");
        UIManager.put("OptionPane.noButtonText", "No");
        

        // Crea un JOptionPane con los botones en espa�ol
        int opcion = JOptionPane.showConfirmDialog(null, "�Quieres continuar?", 
        		"Confirmar", JOptionPane.YES_NO_OPTION);

        // Maneja la opci�n seleccionada
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Has elegido S�.");
        } else if (opcion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Has elegido No.");
        }
    }
}
