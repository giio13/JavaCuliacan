package Miercoles;
/*
    Si una clase tiene varios metodos que tienen el mismo nombre pero diferentes en parametros, se conoce como sobrecarga.
    Si tenemos que realizar una sola operacion, tener el mismo nombre de los metodos aumenta la legibilidad del programa.
        Ventajas: Aumenta la legibilidad, Diferentes maneras de sobrecargar un metodo.
        Formas de sobrecargar un metodo:
        1.-Cambiando el numero de argumentos.
        2.-Cambiando el tipo de datos.  
*/
public class OverloadTest {
    public static void main(String[] args) {
        System.out.println(AddArguments.add(11, 23));
        System.out.println(AddArguments.add(23, 14, 19));
        
        System.out.println(AddType.add(11,22));
        System.out.println(AddType.add(11.3,22.3));
    }
    
}
//numero de argumentos
class AddArguments{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}

//tipo en el argumento
class AddType{
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b ;
    }
}