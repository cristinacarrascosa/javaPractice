package ud4.Ejercicios.Vectores;

import javax.swing.*;

public class Ej2 {
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int [] arrayNums= new int[10];

        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            arrayNums[i]=num;
            suma += num;
        }

        for (int i = 0; i < arrayNums.length; i++) {
            System.out.print(arrayNums[i]+", ");
        }
        System.out.println("Suma: "+suma);
    }
}
