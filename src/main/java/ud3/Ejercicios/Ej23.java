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
        boolean padres;

        Scanner listener = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = listener.nextInt();
        System.out.println("----");

        if( edad < 18){
            System.out.println("¿Son tus padres socios?");
            padres = listener.hasNextBoolean();
            System.out.println();
            if( padres == true){
                System.out.println("Tu descuento es del 35%");
                cuotaFinal =cuota - cuota * dtoMenores;
            }else {
                System.out.println("Tu descuento es del 25%");
                cuotaFinal = cuota - cuota *dtoMenoresinPadres;
            }
            System.out.println("Tu cuota final es de: "+cuotaFinal);
        } else if ( edad > 65) {
            System.out.println("Tu descuento es del 50%");
            cuotaFinal = cuota - cuota * dtoMayores;
            System.out.println("Tu cuota final es de: "+cuotaFinal);
        } else {
            System.out.println("No tienes ningún descuento, tu cuota es de: "+cuota);
        }


    }
}
