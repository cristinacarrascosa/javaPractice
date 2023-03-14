package pildorasinformaticas.POO.Ej1;

public class Cuenta {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public Cuenta(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = (long) (Math.random()* Long.MAX_VALUE);
    }

    public String getSaldo() {
        return "El saldo de la cuenta es: " + saldo;
    }

    public String getDatos() {
        return "Titular: "+nombreTitular+"\nNum. Cuenta: "+numeroCuenta+"\nSaldo: "+saldo;
    }

    public void setIngreso( double ingreso){
        if(ingreso < 0) System.out.println("No se permiten ingresos negativos");
        else saldo += ingreso;
    }

    public void setReintegro ( double reintegro){
        saldo -= reintegro;
    }

    public static void setTransferencia ( Cuenta titu1, Cuenta titu2, double cantidad){
        titu1.saldo -= cantidad;
        titu2.saldo += cantidad;
    }
}
