package Martes;
/*
    Si se aplica la palabra reservada static a cualquier meotodo, se conoce como un metodo estatico.
    Un metodo estatico solo pertenece a la clase en lugar de objeto de una clase. 
    Se puede invocar un metodo estatico sin necesidad de crear una instancia a una clase.
    El metodo estatico puede acceder al miembro de datos estaticos y puede cambiar el valor del mismo.
*/

public class Student1 {
    int noControl;
    String nombre;
    static String Instituto = "ITL";
    
    public static void change(){
        Instituto = "ITC";
    }

    public Student1() {
        
    }
    
    public Student1(int nc, String n){
        noControl = nc;
        nombre = n;
        
    }
    
    public void display(){
        System.out.println(noControl+" "+nombre+" "+Instituto);
    }
    public static void main(String[] args) {
        Student1.change();
        Student1 s1= new Student1(001,"Fer");
        Student1 s2= new Student1(001,"Flor");
        Student1 s3= new Student1(003,"Ferro");
        
        s1.display();
        s2.display();
        s3.display();
        
        
        
    }
}
