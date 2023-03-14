package ud3.Ejercicios.BuclesAlpha;

public class Ej5 {
    /*
    * Escribe un programa que muestre los números enteros de A a B (valores que se le
        piden al usuario) en orden inverso y en pasos de 2. Por ejemplo, si A=20 y B=-10,
        entonces mostrará 20, 18, 16… hasta -10.
    * */
    public static void main(String[] args) {
        int a = 20;
        int b = -10;

        for (int i = a; i > b; i-=2) {
            System.out.println(i);
        }
    }
}
