package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class EjemploDoWhile {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres \n"+
                "Para terminar introduce la palabra salir");

        String texto;

        do {
            texto = JOptionPane.showInputDialog("Introduce el texto");
            if(!texto.equals("salir")){
            System.out.println("El texto introducito tiene "+texto.length()+" caracteres");
            }
        }while (!texto.equals("salir"));

        System.out.println("Hasta luego!! ;) ");
    }
}
