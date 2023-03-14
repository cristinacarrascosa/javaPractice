package pildorasinformaticas.POO.Ej2;

public class Sucursal {
    private int numSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numSucursal, String direccion, String ciudad) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setPrecio(Paquete paquete){
        if(paquete.getPrioridadEnvio() == 1) {
            paquete.setPrecio(10);
        }
        if (paquete.getPrioridadEnvio() == 2 ){
            paquete.setPrecio(20);
        }
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "numSucursal=" + numSucursal +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
