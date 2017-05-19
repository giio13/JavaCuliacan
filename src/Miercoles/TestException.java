package Miercoles;
//finally ejecuta codigo importante, siempre se ejecuta se maneje o no la excepcion 

import java.io.IOException;

public class TestException {
    public static void main(String[] args)  throws Exception{
            //int  data = 50/0;
            try{
                M m = new M();
                m.method();
            }catch (Exception e){
                System.out.println("Exception Handled");
            }
            System.out.println("Lo que sigue");
        }
    }        
class M{
    void method() throws IOException{
        throw new IOException("Error");
    }
}
    
    
//        try{
//     int data;
       
////            int a[] = new int [5];
////            a[5]=30/0;
//        System.out.println("data");
//        }//catch(ArithmeticException ae){
////            System.out.println(ae);
////        }catch(ArrayIndexOutOfBoundsException aiobe){
////            System.out.println(aiobe);
////        } catch (Exception e){
////            System.out.println(e);
//        catch(NullPointerException npe){
//                System.out.println(npe);
//                }
//         finally {
//            System.out.println("El bloque finally siempre se ejecuta");
//        }
//        System.out.println("Lo que sigue");
//    }

