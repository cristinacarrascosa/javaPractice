package ud2.Ejercicios;

public class Ej6 {

    public static void main(String[] args) {
        double precio = 85;
        double rebaja = 15;
        double total = precio - (precio * (rebaja/100));

        System.out.println("El precio original de las zapatillas es: "+precio+ ", " +
                "se le aplica una rebaja del: "+rebaja+"%. Por lo que el total de" +
                "las zapatillas es de: "+total);
    }
}
