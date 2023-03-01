package ud2.Ejercicios;

import java.util.Scanner;

public interface Ej16 {
    public static void main(String[] args) {

        int segundos;

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce los segundos");
         segundos = lector.nextInt();

        int minutos = segundos /60;
        int horas = minutos /60;
        int dias = horas / 24;


        System.out.println(segundos+" son: "+minutos+" minutos");
        System.out.println(minutos+" minutos son: "+horas+" horas");
        System.out.println(horas+" horas son: "+dias+" dias");


    }
}
