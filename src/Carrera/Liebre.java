package Carrera;

import java.io.*;

public class Liebre implements Runnable {
 
@Override
public void run(){
Carrera ca= new Carrera();
int i = 0;
//System.out.println("Inicia la Liebre");
ca.Escribir("Inicia la Liebre");
 
while (i< 5 ){
try{
Thread.sleep(2000);
//System.out.println("Da un paso la Liebre");
ca.Escribir("Da un paso la Liebre");
}catch (InterruptedException e) {
// TODO: handle exception
e.printStackTrace();
}
i++;
}
//System.out.println("Ya llego la Liebre");
ca.Escribir("Ya llego la Liebre");

}
public Liebre() {
// TODO Auto-generated constructor stub
}

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
}
}

