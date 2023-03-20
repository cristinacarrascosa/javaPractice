package ud4.Ejercicios.String;

import javax.swing.*;

public class eJ3 {
    public static void main(String[] args) {
        String cadena1 = JOptionPane.showInputDialog("Introduce el texto 1");
        String cadena2 = JOptionPane.showInputDialog("Introduce el texto2");

        /*El método compareTo() devuelve un valor entero que indica la
        posición relativa de las dos cadenas en orden lexicográfico.
        Si la primera cadena es menor que la segunda,
        el valor devuelto será negativo.
        Si las dos cadenas son iguales, el valor devuelto será 0.
        Y si la primera cadena es mayor que la segunda,
        el valor devuelto será positivo.*/

        if(cadena1.compareTo(cadena2) < 0){
            JOptionPane.showMessageDialog(null,cadena1+" viene antes que "+cadena2);
        } else if (cadena1.compareTo(cadena2) > 0) {
            JOptionPane.showMessageDialog(null,cadena2+" viene antes que "+cadena1);
        }else {
            JOptionPane.showMessageDialog(null,"Los dos textos son iguales");
        }
    }
}
