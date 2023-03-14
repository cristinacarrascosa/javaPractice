package pildorasinformaticas.estructurasBasicas;

import java.util.Random;

public class Ej3Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        int num[] = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i]= random.nextInt(100)+1;
        }

        for (int element:num) {
            System.out.print(element+", ");
        }

    }
}
