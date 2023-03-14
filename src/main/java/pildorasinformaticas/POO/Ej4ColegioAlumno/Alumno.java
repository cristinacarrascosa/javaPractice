package pildorasinformaticas.POO.Ej4ColegioAlumno;

public class Alumno {

    private String nombreAlumno;

    private double notaAlumno;

    private int Id;

    private static int IdSiguiente = 1;

    private Colegio nombrecolegio;

    public Alumno(Colegio nombrecolegio,String nombreAlumno, double notaAlumno) {
        this.nombrecolegio = nombrecolegio;
        this.nombreAlumno = nombreAlumno;
        this.notaAlumno = notaAlumno;
        Id = IdSiguiente;

        IdSiguiente ++;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getNombreColegioAlumno(){
        return this.nombrecolegio.getNombreColegio();
    }

    public double getNotaAlumno() {
        return notaAlumno;
    }

    public void setNotaAlumno(double notaAlumno) {
        this.notaAlumno = notaAlumno;
    }

    public int getId() {
        return Id;
    }
    
    public String toString(){
        return "Nombre alumno: "+nombreAlumno
                +"\nColegio: "+this.getNombreColegioAlumno()
                +"\nNº Alumno"+Id
                +"\nNota media: "+notaAlumno;
    }
}
