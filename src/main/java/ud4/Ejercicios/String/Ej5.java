package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej5 {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce una cadena de caracteres").toLowerCase();

        int a=0, e=0, o=0, u=0, i=0;

        char [] arrayCadena = cadena.toCharArray();

        for (char letra:
             arrayCadena) {
            if (letra == 'a'){
                a++;
            }
            if (letra == 'e'){
                e++;
            }
            if (letra == 'i'){
                i++;
            }
            if (letra == 'o') {

                o++;
            }
            if (letra == 'u'){
                u++;
            }
        }
        System.out.println(cadena);
        System.out.println("Nº de A: "+a
        +"\nNº de E: "+e
        +"\nNº de I: "+i
        +"\nNº de O: "+o
        +"\nNº de U: "+u);

    }
}
