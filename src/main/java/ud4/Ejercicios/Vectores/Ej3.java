package ud4.Ejercicios.Vectores;

import javax.swing.*;

public class Ej3 {
    public static void main(String[] args) {
        int num = 0;


        int [] arrayNums = new int[10];

        for (int i = 0; i < arrayNums.length; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            arrayNums[i] = num;


        }

        int max = arrayNums[0];

        int min = arrayNums[0];

        for (int i = 0; i < arrayNums.length; i++) {
            if (arrayNums[i] < min) {
                min = arrayNums[i];
            }
            if (arrayNums[i] > max) {
                max = arrayNums[i];
            }
        }
        System.out.println("El núm más pequeño es: "+min);
        System.out.println("El núm más grande es: "+max);
    }
}
