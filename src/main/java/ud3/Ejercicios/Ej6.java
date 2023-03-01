package ud3.Ejercicios;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int a,b;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce a");
        a = lector.nextInt();
        System.out.println("Introduce b");
        b = lector.nextInt();

        if( a == b ){
            System.out.println("Los dos números son igules");
        } else if ( a > b) {
            System.out.println(a+ " es mayor que "+b);
        }else {
            System.out.println(b+" es mayor que "+a);
        }
    }
}
