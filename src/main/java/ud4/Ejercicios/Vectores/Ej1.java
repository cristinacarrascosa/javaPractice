package ud4.Ejercicios.Vectores;

import javax.swing.*;
import java.util.Scanner;

public class Ej1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        int [] arrayNums= new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número");
            num = sc.nextInt();
             arrayNums[i] = num;

        }

        for (int element:
             arrayNums) {
            System.out.println(element);
        }
    }
}
