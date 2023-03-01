package ud2.Ejercicios;

public class Ej11 {

    public static void main(String[] args) {
        int h = 15, w = 25;

        int perimetro = (2*h) + (2*w);

        int area = h*w;

        if( h > w || h == w){
            System.out.println("La longítud es = "+h);
        } else {
            System.out.println("La longitud es = "+w);
        }

        System.out.println("El perímetro es = "+perimetro);
        System.out.println("El área es = "+area);
    }
}
