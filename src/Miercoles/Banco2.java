package Miercoles;

public abstract class Banco2 {
    float RangoDeInteres;
   abstract float RangoDeInteres();
}
class Bancoppel2 extends Banco2{
    @Override
    float RangoDeInteres() {return 7f;}
}
class Bancomer2 extends Banco2{
    @Override
    float RangoDeInteres(){ return 9f;}
}
class HSBC2 extends Banco2{
    @Override
    float RangoDeInteres(){ return 8f;}
}


class PruebaBanco2{
    public static void main(String[] args) {
        Banco2 b;
        b= new Bancoppel2();
        System.out.println("La tasa de interes de Bancoppel es:"+ b.RangoDeInteres);
        b = new Bancomer2();
        System.out.println("La tasa de interes de Bancomer es:"+ b.RangoDeInteres);
        b = new HSBC2();
        HSBC h = new HSBC();
        System.out.println("La tasa de interes de HSBC es:"+ b.RangoDeInteres);
              
    }
}
