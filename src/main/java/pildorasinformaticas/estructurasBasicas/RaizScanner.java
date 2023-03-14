package pildorasinformaticas.estructurasBasicas;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº");

        double res = Math.sqrt(sc.nextInt());

        System.out.println("La raíz es = "+res);

        sc.close();
    }
}
