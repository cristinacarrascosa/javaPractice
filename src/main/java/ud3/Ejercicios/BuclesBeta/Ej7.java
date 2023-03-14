package ud3.Ejercicios.BuclesBeta;

import javax.swing.*;

public class Ej7 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un nº positivo"));
        int factorial;
        while (num<0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Error, el nº introducido no es correcto"+"\nPrueba de nuevo!!"));

        }
        if(num>0){
            factorial = num;
            for (int i = num; i > 0; i--) {
                //System.out.println(factorial+"x"+i+"="+factorial*i);
                factorial = factorial*i;
                System.out.print(i+"x");

                //System.out.println(factorial+"x"+i+" = "+factorial*i);
            }
            System.out.println("="+factorial);
        }
    }
}
