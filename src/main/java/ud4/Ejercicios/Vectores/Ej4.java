package ud4.Ejercicios.Vectores;

import javax.swing.*;

public class Ej4 {
    public static void main(String[] args) {
        int num;
        int [] arrayNums = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;

        for (int i = 0; i < arrayNums.length; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            arrayNums[i] = num;
        }

        for (int numero:
             arrayNums) {
            System.out.print(numero+", ");
            if (numero > 0) {
                sumaPos = numero + sumaPos;
            }
            if (numero < 0) {
                sumaNeg = numero + sumaNeg;
            }
        }
        System.out.println();
        System.out.println("la suma de num. positivos es: "+sumaPos);
        System.out.println("La suma de los num. negativos es: "+sumaNeg);
    }
}
