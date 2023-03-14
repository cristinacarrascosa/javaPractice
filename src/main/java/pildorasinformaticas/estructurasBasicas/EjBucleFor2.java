package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class EjBucleFor2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un nº"));

        long factorial = num;

        for (int i = num-1; i > 0; i--) {
           factorial=factorial*i;

        }
        System.out.println("El factorial de "+num+" es "+factorial);
    }
}
