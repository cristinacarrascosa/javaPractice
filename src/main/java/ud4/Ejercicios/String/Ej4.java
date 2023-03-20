package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej4 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String apellido1 = JOptionPane.showInputDialog("Introduce tu primer apellido");
        String apellido2 = JOptionPane.showInputDialog("Introduce tu segundo apellido");

        String codigo = nombre.substring(0,3).toUpperCase()+apellido1.substring(0,3).toUpperCase()+apellido2.substring(0,3).toUpperCase();


        System.out.println(codigo);
    }
}
