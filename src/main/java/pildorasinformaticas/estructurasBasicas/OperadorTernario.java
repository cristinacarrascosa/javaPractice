package pildorasinformaticas.estructurasBasicas;

import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {

        /*double salario1=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu primer salario"));

        double salario2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));

        double salarioMayor;

        salarioMayor = (salario1>salario2)?salario1:salario2;

        System.out.println("El salario mayor es: "+salarioMayor);*/

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

        String mayor = (edad > 18)?"Eres mayor de edad":"Todavía eres menor de edad";

        System.out.println(mayor);


    }
}
