package ud3.Ejercicios;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        int a,b;

        Scanner listen = new Scanner(System.in);

        System.out.println("Introduce A");
        a = listen.nextInt();
        System.out.println("Introduce B");
        b = listen.nextInt();

        if ( a % b == 0){
            System.out.println(a+" es divisible por "+b);
        } else if ( b % a == 0) {
            System.out.println(b+" es divisible por "+a);
        } else {
            System.out.println("No son divisibles");
        }
    }
}
