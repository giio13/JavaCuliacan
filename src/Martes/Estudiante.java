
package Martes;
/*  @author Jhiovany Moreno
Objeto: Entidad de el mundo real que posee tres caracteristicas, comportamiento, estado e identidad.

Estado: Representa el valor de un objeto.
Comportamiento: Representa la funcionalidad que posee el objeto.
Identidad: Un objeto estrictamente implementado con una ID. El Valor del ID no es visible para el 
usuario final pero es usado internamente por la JVM, para identificar cada objeto de manera unica.

Un objeto es una instancia de una clase.
 
Clase: Es un grupo de objetos que tienen propiedades comunes.
Es una plantilla para modelar los objetos que se crean.
Una clase contiene: Campos, Metodos, Constructores, bloques , Clases anidadas e interfaces.  

 */
   
public class Estudiante {
   int id; // campo o dato o una instancia 
   String name;
   
      public static void main(String[] args) {
          //creando un objeto de estudiante
          Estudiante s1 = new Estudiante();
          Alumno a1 = new Alumno();
          Alumno a2= new Alumno(002,"Liz");
          //Accesando al objeto que hace referencia
          System.out.println(s1.id);
          System.out.println(s1.name);
          
          a1.inicializarVariable(001,"Fer");
          a1.mostrar();
          a2.mostrar();
          //System.out.println(a1.name);     
    }
     
}
//inicializacion por variable de referencia
class Alumno {
    int id=1;
    String name;
    
    public void inicializarVariable(int id, String n){
        this.id = id;
        name = n;
    }
    
    public void mostrar(){
        System.out.println(id +" "+name);
    }
    
    public Alumno(){
        
    }
    public Alumno(int id, String name){
        this.id = id;
        this.name = name;
    }
}


