package ud3.Ejercicios.BuclesBeta;

import javax.swing.*;

public class Ej1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº"));

        for (int i = 0; i < 10; i++) {
            System.out.println(i+"x"+num+" = "+i*num);
        }
    }
}
