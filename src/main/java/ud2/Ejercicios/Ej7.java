package ud2.Ejercicios;

public class Ej7 {
    public static void main(String[] args) {
        double cantidadIni = 2000;
        double plazoFijo = 2.75;
        double plazoFijoMensual = 2.75/12;
        double beneficio = cantidadIni*(plazoFijoMensual*6);
        double interesesHacineda = 0.18;
        double intereses = beneficio*interesesHacineda;
        double beneficioNeto = beneficio - intereses;

        System.out.println("Cantidad inicial: "+cantidadIni);
        System.out.println("Beneficios plazo fijo: "+beneficio);
        System.out.println("Intereses: "+ intereses);
        System.out.println("Total: "+beneficioNeto);
    }
}
