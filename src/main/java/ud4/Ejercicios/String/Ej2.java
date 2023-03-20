package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej2 {
    public static void main(String[] args) {

        String cadena1 = JOptionPane.showInputDialog("Introduce texto 1").toLowerCase();
        String cadena2 = JOptionPane.showInputDialog("Introduce texto 2").toLowerCase();

        System.out.println(cadena1);
        System.out.println(cadena2);

        System.out.println("***********************");

        if (cadena2.equals(cadena1)){
            JOptionPane.showMessageDialog(null,"Los dos textos son iguales");
        } else {
            JOptionPane.showMessageDialog(null,"Los textos son diferentes");
        }
    }
}
