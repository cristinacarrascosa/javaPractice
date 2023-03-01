package ud2.Ejercicios;

public class Ej14 {

    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    public enum Calificaciones {
        suspenso, suficiente, bien, notable, sobresaliente
    }
    public static void main(String[] args) {

        DiaSemana hoy = DiaSemana.MIERCOLES;
        DiaSemana tomorrow = DiaSemana.JUEVES;

        System.out.println("Hoy es "+hoy+" y mañana será "+tomorrow);
    }
}
