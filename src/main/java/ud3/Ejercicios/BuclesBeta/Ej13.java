package ud3.Ejercicios.BuclesBeta;

import javax.swing.*;

public class Ej13 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un nº"));
        int suma = 0;

        /*
        *   // Bucle que calcula la suma de las cifras de n
        while (n > 0) {
            // Sumamos la cifra más a la derecha
            suma += (n % 10);
            // Quitamos la cifra más a la derecha
            n = n / 10;
        }
        * */
        for (; num != 0 ; num/= 10) {
            suma += num % 10;
            //System.out.print(suma);
        }
        System.out.println("La suma de las cifras es: "+suma);
    }
}
