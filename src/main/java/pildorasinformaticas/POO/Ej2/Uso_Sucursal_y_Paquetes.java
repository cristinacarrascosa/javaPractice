package pildorasinformaticas.POO.Ej2;

import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nº de sucursal");
        int numSucursal = sc.nextInt();
        System.out.println("Introduce la dirección de la sucursal");
        sc.nextLine();
        String direccion = sc.nextLine();
        System.out.println("Introduce la ciudad de la sucursal");
        String ciudad = sc.nextLine();
        System.out.println("Introduce el nº de paquetes a enviar");
        int numPaquetes = sc.nextInt();

        Paquete [] paquetes = new Paquete[numPaquetes];

        Sucursal sucursal1 = new Sucursal(numSucursal,direccion,ciudad);

        for (int i = 0; i < numPaquetes; i++) {
            System.out.println("Introduce la referencia del envío");
            int refEnvio = sc.nextInt();
            System.out.println("Introduce el DNI del remitente");
            sc.nextLine();
            String dni = sc.nextLine();
            System.out.println("Introduce el peso del paquete");
            double peso = sc.nextDouble();
            System.out.println("Introduce la prioridad de envio 0=Nomal, 1=Alta, 2=Urgente");
            int prioridad = sc.nextInt();

            paquetes[i] = new Paquete(refEnvio,peso,dni,prioridad);

        }

        System.out.println(sucursal1.toString());
        for (Paquete paquete:paquetes
             ) {
            System.out.println(paquete.toString());
        }
    }


}
