package ud3.Ejercicios.BuclesBeta;

import javax.swing.*;

public class Ej6 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente"));
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado*base;
        }
        System.out.println("El nº"+base+" elevado a "+exponente+" es: "+resultado);

    }
}
