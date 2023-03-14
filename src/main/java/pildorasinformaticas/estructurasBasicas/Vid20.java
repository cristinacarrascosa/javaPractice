package pildorasinformaticas.estructurasBasicas;

import java.util.Scanner;

public class Vid20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Introduce tu edad, por favor");

        int edad = sc.nextInt();// guarda el int el la variable

        System.out.println("Introduce tu nombre, por favor");

        sc.nextLine();// para que capture este intro y no finalice el programa

        String nombre = sc.nextLine();//


        System.out.println("Te llamas "+nombre+" y tienes "+edad+" años");

        sc.close();
    }
}
