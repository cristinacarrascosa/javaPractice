package pildorasinformaticas.POO.Ej3;

public class CuentaCorriente {

    private String titular;
    private double saldo;
    private Long numCuenta;

    public CuentaCorriente( String nombre, double saldo){
        this.titular = nombre;
        this.saldo = saldo;
        this.numCuenta = (long)(Math.random() * Long.MAX_VALUE);
    }

    public  void setIngreso ( double ingreso){
        if ( ingreso < 0) System.out.println("No se permiten ingresos negativos");
        else saldo += ingreso;
    }

    public void setReintegro ( double reintegro){
        if ( reintegro < 0 ) System.out.println("No se permiten ingresos negativos");
        else saldo -= reintegro;
    }

    public String getSaldo(){
        return "El saldo de la cuenta es: "+saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numCuenta=" + numCuenta +
                '}';
    }

    public static void setTransferencia( CuentaCorriente titu1, CuentaCorriente titu2, double cantidad){
        titu1.saldo -= cantidad;
        titu2.saldo += cantidad;
    }
}
