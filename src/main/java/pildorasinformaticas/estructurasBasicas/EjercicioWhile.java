package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class EjercicioWhile {
    public static void main(String[] args) {

        int random =(int) (Math.random()*100)+1;
        int num = 0;
        int cont =0;

        while ( !(random == num)){
            num = Integer.parseInt(JOptionPane.showInputDialog("Adivina el nº entre el 1 y el 100"));
            if(  random > num ){
                System.out.println("El nº introducido es menor ");
            } else if ( random < num ){
                System.out.println("El nº introducido es mayor ");
            }
            cont ++;
        }

        System.out.println("Correcto!!, has hecho "+cont+" intentos"+" El nº introducido es el: "+num+" y el random es: "+random);
    }
}
