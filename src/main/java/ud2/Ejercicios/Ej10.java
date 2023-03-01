package ud2.Ejercicios;

public class Ej10 {

    public static void main(String[] args) {
         int a = 2;
         int b = 4;
        int resul;

        resul = -a + 5 % b - a * a;
        System.out.println("-a + 5 % b - a * a = " + resul);
        // (-a) + (5 % b) - (a * a);

        resul = 5 + 3 % 7 * b * a - b % a;
        System.out.println("5 + 3 % 7 * b * a - b % a= 0"+resul);

        resul = (a+1) * (b + 1) - b/a;
        System.out.println("(a+1) * (b + 1) - b/a)= "+resul);
    }
}
