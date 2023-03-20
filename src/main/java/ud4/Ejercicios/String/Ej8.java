package ud4.Ejercicios.String;

import javax.swing.*;

public class Ej8 {
    public static void main(String[] args) {

        String f = JOptionPane.showInputDialog("Introduce una frase");
        String p = JOptionPane.showInputDialog("Introduce la palabra que quieres buscar");

        int cont = 0;
        int caracteresP = p.length();
        int posicion = 0;

        if (f.contains(p)) {
            //posicion = f.indexOf(p) + caracteresP;
            for (int i = posicion; i < f.length(); i++) {
                f = f.substring(posicion);
                    if(f.contains(p)) {
                        posicion = f.indexOf(p)+caracteresP;
                        cont++;
                    }

            }
            System.out.println("La palabra"+p+" está "+cont+" veces");
        } else {
            System.out.println("El texto no contiene la palabra: "+p);
        }


    }
}
