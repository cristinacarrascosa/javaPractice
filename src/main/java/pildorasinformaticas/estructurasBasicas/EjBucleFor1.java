package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class EjBucleFor1 {
    public static void main(String[] args) {


        String email = "";
        boolean correcto = false;

        boolean contienePunto = false;
        //boolean igualOMasDe4 = false;

        do {
            email = JOptionPane.showInputDialog("Introduce un email válido");
            int contArrobas = 0;

            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i) == '@'){
                    contArrobas ++;
                }
                if (email.charAt(i) == '.'){
                    contienePunto = true;
                }
            }

            if ( contArrobas == 1 && contienePunto && email.length()>=4){

                correcto = true;
            }

        }while ((!correcto));
        System.out.println("Email correcto!: "+email);
    }
}
