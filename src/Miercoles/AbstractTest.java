package Miercoles;
/*
    Una clase que se declara abstracta necesita de la palabra resevada abstract.
Abstraccion:
Proceso de ocultar los detalles de implementacion y mostrar solo la funcionalidad al usuario.
No conoce el procesamiento interno de la funcion.
La abstraccion permite centrarse en lo que hace el objeto en lugar de como lo hace.
Hay dos maneras de lograr la abstraccion:
1-Clase Abstracta (0 a 100)
2-Interface (100%)
Una clase que se declara abstract no se conoce como la clase abstracta. Tiene que heredar y sus metodos deben ser
implementados. No pueden instanciarse.
Un metodo se debeclar abstract cuando no tiene implementacion y tiene la palabra reservada abstract.
*/
public class AbstractTest extends Bike2{
         
        @Override
        void run(){
            System.out.println("Corriendo...");
        }
    public static void main(String[] args) {
        Bike2 n = new AbstractTest();
        n.run();
        new AbstractTest().run();
    }
}
abstract class Bike2 {
    abstract void run();
}
