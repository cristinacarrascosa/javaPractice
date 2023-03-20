package pildorasinformaticas.POO.Herencia;

public class CadenaHerencia {
    public static void main(String[] args) {

    }

    class Clase1{
        public void metodo1(){}
    }
    class Clase2 extends Clase1{
        public void metodo2(){}
    }
    class Clase3 extends Clase2{
        private void metodo3(){}// los métodos private no se heredan
    }
   final class Clase4 extends Clase3{//si añadimos final a la clase, esta no se podrá heredar
        public void metodo4(){}
    }

}
