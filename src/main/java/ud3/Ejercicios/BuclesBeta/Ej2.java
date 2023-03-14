package ud3.Ejercicios.BuclesBeta;

public class Ej2 {
    public static void main(String[] args) {

        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("La suma es: "+suma+
                "\nEl producto es: "+producto);
    }
}
