package ud4.Ejercicios.Vectores;

import javax.swing.*;

public class Ej7 {
    public static void main(String[] args) {
         int numP = Integer.parseInt(JOptionPane.showInputDialog("Introduce el num. P"));

         int numQ = Integer.parseInt(JOptionPane.showInputDialog("Introduce el num. Q"));

         int tamanyoArray = numQ - numP;
         int [] arrayNums = new int[tamanyoArray];

         int pos = 0;

        for (int i = numP; i < numQ ; i++) {

            //System.out.println(numP);

            arrayNums[pos]= i;
            pos++;

        }

        System.out.println("tamaño array:"+tamanyoArray);
        for (int numeros:
             arrayNums) {
            System.out.print(numeros+", ");
        }

        System.out.println("tamanyoArray: "+tamanyoArray);
        System.out.println();
        System.out.println("P: "+numP);
        System.out.println("Q: "+numQ);

    }
}
