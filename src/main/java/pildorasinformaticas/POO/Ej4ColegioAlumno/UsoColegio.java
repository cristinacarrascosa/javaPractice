package pildorasinformaticas.POO.Ej4ColegioAlumno;

public class UsoColegio {
    public static void main(String[] args) {

        Colegio SanJavier = new Colegio("San Javier", 200);

        Colegio Cervantes = new Colegio("Cervantes", 300);

        SanJavier.nuevoAlumno("Juan",8.5);
        SanJavier.nuevoAlumno("Sara",9);

        //SanJavier.getDatosAlumno("Sara");

        Cervantes.nuevoAlumno("Ana", 5);
        Cervantes.nuevoAlumno("Cris",10);
        Cervantes.nuevoAlumno("Pepe",2);
        Cervantes.getTodosAlumnos();
        Cervantes.expulsaAlumno("Pepe");
        System.out.println("************************************");
        Cervantes.setNotaMedia("Ana",10);
        Cervantes.getTodosAlumnos();

    }
}
