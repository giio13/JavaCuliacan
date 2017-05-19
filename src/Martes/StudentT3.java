package Martes;

//this: to invoke current class constructor
public class StudentT3 {
    public static void main(String[] args) {
        AB b = new AB(10);
    }
}

class AB {
    AB(){
        System.out.println("Hola soy un mensaje en el constructor");
    }
    AB(int x){
        this();
        System.out.println(x);
    }
}
