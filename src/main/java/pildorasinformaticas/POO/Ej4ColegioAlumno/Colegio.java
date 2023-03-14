package pildorasinformaticas.POO.Ej4ColegioAlumno;

public class Colegio {

    private String nombreColegio;
    private int posicionArray = 0;

    private Alumno [] arrayAlumnos;


    public Colegio( String nombreColegio, int numAlumnos){
        this.nombreColegio = nombreColegio;
        arrayAlumnos= new Alumno[numAlumnos];
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    private Alumno getAlumno( int nAlumno ){
        return arrayAlumnos[nAlumno];
    }

    public void nuevoAlumno( String nombreAlumno, double notaAlumno){
        Alumno nuevoAlumno = new Alumno(this, nombreAlumno, notaAlumno);
        arrayAlumnos[posicionArray]=nuevoAlumno;
        posicionArray ++;
    }

    public void expulsaAlumno ( String nombreAlumno ){
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if ( this.getAlumno(i) != null){
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)){
                    arrayAlumnos[i]=null;
                }
            }
        }
    }

    public void setNotaMedia( String nombreAlumno, double nuevaNotaMedia){
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null){
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)){
                    arrayAlumnos[i].setNotaAlumno(nuevaNotaMedia);
                }
            }
        }
    }

    public void getTodosAlumnos(){
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null){
                System.out.println(this.getAlumno(i));
                System.out.println();
            }
        }
    }

    public void getDatosAlumno(String nombreAlumno){
        for (int i = 0; i < arrayAlumnos.length; i++) {
            if (this.getAlumno(i) != null){
                if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)){
                    System.out.println(this.getAlumno(i));
                    System.out.println();
                }
            }
        }
    }

}
