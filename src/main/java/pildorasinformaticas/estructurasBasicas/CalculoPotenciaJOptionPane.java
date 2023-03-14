package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class CalculoPotenciaJOptionPane {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
        double exponente = Double.parseDouble(JOptionPane.showInputDialog("Introduce el exponente"));
        int baseEntero = (int)Math.round(base);
        double res = Math.pow(base,exponente);




        System.out.println("El resultado es "+res);
    }
}
