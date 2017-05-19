
package Martes;
/*
    La palabra reservada static es usada principalmente para la administracion de memoria.
    Se puede tener:
        a) variables estaticas 
        b) metodos estaticos
        c) bloques
        d) clases anidadas
    Si se declara una variable estatica puede ser usada para dos cosas.
        Referir una propiedas en comun con todos los objetos 
        La variable estatica ontiene memoria solo una vez al momento de ser cargada a la clase.
     
Ventajas: Vuelve el codigo mas eficiente(ahorras memoria)
*/

public class Student {
    int id;
    String name;
    static String Universidad= "ITC";
    
    Student(int i, String n){
        
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+ name+" "+Universidad);
        
    }
      public static void main(String[] args) {
          Student s1 = new Student(001, "Fer");
          Student s2 = new Student(002, "Arantxa");
          
          s1.display();
          s2.display();
          
      }
}
