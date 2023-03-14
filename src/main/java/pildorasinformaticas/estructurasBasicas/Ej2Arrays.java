package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class Ej2Arrays {
    public static void main(String[] args) {

        int [] numeros = new int[10];
        int cont = 0, suma = 0;
        double total = 0;


        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº"));

            //System.out.print(i+":"+numeros[i]+", ");

            if (i % 2 == 0 && i != 0) {
                System.out.print(i+"."+numeros[i]+", ");
                suma = numeros[i] +suma;
                cont ++;
            }
        }
        System.out.println();
        total = suma/cont;
        System.out.println("La media de los números introducidos en las posiciones pares es: "+total);

    }
}
