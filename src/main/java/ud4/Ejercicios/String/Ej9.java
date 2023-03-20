package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej9 {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce dos palabras separadas por un espacio");

        char [] arrayCadena = cadena.toCharArray();

        for (char element:
             arrayCadena) {
            if (element == ' '){
                System.out.println();
            } else System.out.print(element);
        }
    }
}
