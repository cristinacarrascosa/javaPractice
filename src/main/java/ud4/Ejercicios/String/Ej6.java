package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej6 {
    public static void main(String[] args) {
        String f = JOptionPane.showInputDialog("Introduce una frase");
        String p = JOptionPane.showInputDialog("Introduce una palabra");

        if (f.startsWith(p)){
            System.out.println("La frase: "+ f+"\nempieza por: "+p);
        } else if (f.endsWith(p)) {
            System.out.println("La frase: "+ f+"\nacaba por: "+p);
        } else if (f.indexOf(p) != -1) {
            System.out.println("La frase: "+ f+"\ncontiene: "+p);
        } else System.out.println("La frase: "+ f+"\nNO CONTIENE: "+p);
    }
}
