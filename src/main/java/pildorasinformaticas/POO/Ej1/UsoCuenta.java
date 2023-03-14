package pildorasinformaticas.POO.Ej1;

public class UsoCuenta {
    public static void main(String[] args) {

        Cuenta Cuenta1 = new Cuenta("Cristina", 14000);

        Cuenta Cuenta2 = new Cuenta("Jose", 2000);

        System.out.println(Cuenta1.getDatos());
        System.out.println(Cuenta2.getDatos());
        System.out.println("---------------");

        Cuenta.setTransferencia(Cuenta1,Cuenta2, 200);


        System.out.println(Cuenta1.getSaldo());
        System.out.println(Cuenta2.getSaldo());


    }
}
