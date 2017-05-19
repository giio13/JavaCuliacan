
package Miercoles;


public class Banco {
    
    float RangoDeInteres(){
        return 0;
    }  
}
class Bancoppel extends Banco{
    float RangoDeInteres(){
        return 7f;
    }
}
class Bancomer extends Banco{
    float RangoDeInteres(){
        return 9f;
    }
}
class HSBC extends Banco{
    float RangoDeInteres(){
        return 8f;
    }
}


class PruebaBanco{
    public static void main(String[] args) {
        Bancoppel b = new Bancoppel();
        Bancomer bm= new Bancomer();
        HSBC h = new HSBC();
        
        System.out.println("La tasa de interes de Bancoppel es:");
        System.out.println("La tasa de interes de HSBC es:");
         System.out.println("La tasa de interes de Bancomer es:");
        
    }
}