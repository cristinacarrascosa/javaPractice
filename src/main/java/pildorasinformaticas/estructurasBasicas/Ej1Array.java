package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class Ej1Array {
    public static void main(String[] args) {

        int [] numeros = new int[10];

        int negativos = 0, positivos = 0, ceros = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº"));
            if (numeros[i] < 0) {
                negativos ++;
            }
            if (numeros[i] == 0) ceros ++;
            if (numeros[i] > 0) positivos++;

            System.out.print(numeros[i]+", ");
        }
        System.out.println();
        System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos+"\nCeros: "+ceros);

    }
}
