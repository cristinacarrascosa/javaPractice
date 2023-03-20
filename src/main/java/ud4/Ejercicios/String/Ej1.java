package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej1 {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce un texto");

        JOptionPane.showMessageDialog(null, cadena.toUpperCase());
        JOptionPane.showMessageDialog(null,cadena.toLowerCase());
    }
}
