package pildorasinformaticas.POO.Ej3;

public class Uso_CuentaCorriente {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Cristina", 200);
        CuentaCorriente cuenta2 = new CuentaCorriente("Jose",400);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        CuentaCorriente.setTransferencia(cuenta1,cuenta2,100);
        System.out.println("Después de la Transferencia");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

    }
}
