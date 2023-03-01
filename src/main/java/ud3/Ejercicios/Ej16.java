package ud3.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {

        int num;
        Scanner listener = new Scanner(System.in);

        System.out.println("Adivina el número del 1 al 6");
        num = listener.nextInt();

        Random rand = new Random();
        int dado = rand.nextInt(6)+1;
        //System.out.println(dado);

        if( num == dado){
            System.out.println("Felicidades!! has adivinado el número");
        } else {
            System.out.println("Sorry, el número era: "+dado);
        }
    }
}
