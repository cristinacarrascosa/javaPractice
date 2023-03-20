package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej7 {
    public static void main(String[] args) {
        String f = JOptionPane.showInputDialog("Introduce una frase");
        String p1 = JOptionPane.showInputDialog("Introduce la palabra que quieres sustituir");
        String p2 = JOptionPane.showInputDialog("Introduce la palabra sustituta");

        System.out.println(f.replaceAll(p1,p2));
    }
}
