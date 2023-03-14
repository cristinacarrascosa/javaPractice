package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class EjemploWhile1 {
    public static void main(String[] args) {
        String clave = "cris";

        String intro = "";



        while ( !intro.equals(clave)){
            intro = JOptionPane.showInputDialog("Introduce la clave");

            if (!intro.equals(clave)){
                System.out.println("Clave incorrecta");
            }
        }

        System.out.println("Bienvenido! :)");
    }
}
