package Martes;

public class Carro {
   int id = 10; // campo o dato o una instancia 
   String name=" Jetta";
    
   public static void main(String[] args) {       
        Carro N1= new Carro();
        Camioneta C1= new Camioneta(11,"Lobo");
        System.out.println(N1.id + N1.name);
        C1.mostrar();
    
    }     
}
class Camioneta {
    int id=1;
    String name;
      
    public void mostrar(){
        System.out.println(id +" "+name);
    }
    Camioneta(){
        
    }
    public Camioneta(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void inicializar(int id, String n){
        this.id = id;
        name = n;
    }
}

