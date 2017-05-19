package Carrera;

public class Tortuga extends Thread{

public void run(){
Carrera ca= new Carrera();
int i = 0;
//System.out.println("Inicia la tortuga");
ca.Escribir("Inicia la tortuga");
while (i<= 5 ){
try{
Thread.sleep(5000);
//System.out.println("Da un paso la tortuga");
ca.Escribir("Da un paso la tortuga");
}catch (InterruptedException e) {
// TODO: handle exception
e.printStackTrace();
}
i++;
}
//System.out.println("Ya llego la tortuga");
ca.Escribir("Ya llego la tortuga");
}
public Tortuga() {
// TODO Auto-generated constructor stub
}

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub

}

}


