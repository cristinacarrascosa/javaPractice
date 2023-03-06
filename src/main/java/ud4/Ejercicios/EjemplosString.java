package ud4.Ejercicios;

public class EjemplosString {
    public static void main(String[] args) {
        String s1 = "Prueba";
        char c1 = s1.charAt(0);

        String s2 = "Buenos días";
        String c2 = s2.substring(7,11);

         /*System.out.println(c1);
        System.out.println(c2);*/

        String s3 = "Queria decirte que quiero que te vayas";
        System.out.println(s3.indexOf("que"));// da la 1ª posición
        System.out.println(s3.indexOf("que", 16));// busca a partir de la posición 16 la palabra que

        System.out.println(s3.lastIndexOf("que"));//devuelve la última posición
        System.out.println(s3.endsWith("vayas"));//devuelve true si termina en ello
        System.out.println(s3.startsWith("decirte"));//devuelve true si empieza


    }
}
