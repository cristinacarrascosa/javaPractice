package ud3.Ejercicios;

import java.util.Scanner;

public class Ej11 {
    public enum DiasSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }
    public static void main(String[] args) {

        int dia;

        Scanner listener = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7");
        dia = listener.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
        }



    }
}
