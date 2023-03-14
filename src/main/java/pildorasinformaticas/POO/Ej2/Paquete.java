package pildorasinformaticas.POO.Ej2;

public class Paquete {
    private int ref;
    private double peso;
    private String dni;
    private int prioridadEnvio;
    private double precio = 0;

    public Paquete(int ref, double peso, String dni, int envio) {
        this.ref = ref;
        this.peso = peso;
        this.dni = dni;
        this.prioridadEnvio = envio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridadEnvio() {
        return prioridadEnvio;
    }

    public void setPrioridadEnvio(int prioridadEnvio) {
        this.prioridadEnvio = prioridadEnvio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "ref=" + ref +
                ", peso=" + peso +
                ", dni='" + dni + '\'' +
                ", prioridadEnvio=" + prioridadEnvio +
                ", precio=" + precio +
                '}';
    }
}
