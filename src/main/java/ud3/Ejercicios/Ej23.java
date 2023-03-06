package ud3.Ejercicios;

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {
        double cuota = 200;
        double dtoMayores = 0.50;
        double dtoMenoresinPadres = 0.25;
        double dtoMenores = 0.35;
        double cuotaFinal;

        int edad;
        boolean padresSocios = false;

        Scanner listener = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = listener.nextInt();
        listener.nextLine();


        if( edad < 18){
            System.out.println("¿Son tus padres socios? s/n");
            char c = listener.nextLine().charAt(0);
            if( c == 's'){
                padresSocios = true;
            }
        }

        if( edad > 65) {
            System.out.println("Obtienes dto del 50%");
            cuotaFinal = cuota * dtoMayores;
        } else if ( edad < 18 && padresSocios) {
            System.out.println("Descuento del 35%");
            cuotaFinal = cuota * dtoMenores;
        } else if ( edad < 18 && !padresSocios) {
            System.out.println("Descuento del 25%");
            cuotaFinal = cuota * dtoMenoresinPadres;
        } else {
            System.out.println("Sin descuento");
            cuotaFinal = cuota;
        }

        System.out.println("Cuota a pagar: "+cuotaFinal);


    }
}
