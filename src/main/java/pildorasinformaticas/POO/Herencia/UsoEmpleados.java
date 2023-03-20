package pildorasinformaticas.POO.Herencia;

import java.util.GregorianCalendar;

public class UsoEmpleados {

    public static void main(String[] args) {

        Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);
        Jefes Ana = new Jefes("Ana", 2900, 2008, 5, 25);
        Ana.setIncentivo(250);
        System.out.println(Ana.getSueldo());



    }
}

    class Empleados {
        private final String nombre;
        private double sueldo;
        GregorianCalendar calendario;
        private int Id;
        private static int IdSiguiente;

        public Empleados (String nom, double suel, int anyo, int mes, int dia){
            nombre = nom;
            sueldo = suel;
            calendario = new GregorianCalendar(anyo, mes, dia);
            Id = IdSiguiente;
            IdSiguiente ++;
        }

        public String getDatosEmpleado(){
            return "El empleado "+nombre+" tiene el nº "+Id;
        }

        public double getSueldo(){
            return sueldo;
        }

        public GregorianCalendar getFechaAlta(){
            return calendario;
        }

        public void setSubeSueldo(double porcentaje){
            double aumento = sueldo*porcentaje/100;
            sueldo+=aumento;
        }
        public static String getIdSiguiente(){
            return "El Id del siguiente Empleado será: "+ IdSiguiente;
        }
    }

    class Jefes extends Empleados{

    private double incentivo;


        public Jefes(String nom, double suel, int anyo, int mes, int dia) {
            super(nom, suel, anyo, mes, dia);
        }

        public void setIncentivo( double b){
            incentivo = b;
        }

        public double getSueldo(){// sobreescribimos el método getSueldo de la clase Empleados
            double sueldoJefe= super.getSueldo();//con super, hacemos referencia al método de la clase Empleados
            return sueldoJefe + incentivo;
        }

    }



