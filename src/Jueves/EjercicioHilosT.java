package Jueves;

public class EjercicioHilosT  extends Thread{
@Override
public void run(){
System.out.println("Estoy run();");
System.out.println("Estatus del hilo se en encuentra: " + this.getState() );
}
public EjercicioHilosT() {
// TODO Auto-generated constructor stub
}

/**
* @param args
* @throws CloneNotSupportedException 
* @throws InterruptedException 
*/
@SuppressWarnings("deprecation")
public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
// TODO Auto-generated method stub
/*EjercicioHilosT thread2 = new EjercicioHilosT();
thread2.start();
EjercicioHilosT t3 = (EjercicioHilosT) thread2.clone();
thread2.interrupt();*/
Hilos2 t = new Hilos2();
Thread thread = new Thread(t); 
Thread thread2 = new Thread(t); 
Thread thread3 = new Thread(t); 
System.out.println("Hilo se crea con la prioridad " + thread.getPriority());
thread.setPriority(MAX_PRIORITY);
System.out.println("Se asigno prioridad al hilo " + thread.getPriority());
thread.setName("EquipoCoppel1");
System.out.println("Se asigno el nombre al hilo " + thread.getName() );
System.out.println("Se asigno el ID al hilo " + thread.getId() );
System.out.println("Estatus del hilo se encuentra: " + thread.getState() );
System.out.println("isAlive del hilo se encuentra: " + thread.isAlive() );
System.out.println("isDaemon del hilo se encuentra: " + thread.isDaemon() );
System.out.println("isInterrupted del hilo  en encuentra: " + thread.isInterrupted() );
thread.sleep(90);
thread.start();
thread2.start();
thread3.start();
System.out.println("isAlive del hilo se encuentra: " + thread.isAlive() );
System.out.println("Estatus del hilo se encuentra: " + thread.getState() );
System.out.println("isDaemon del hilo se encuentra: " + thread.isDaemon() );
thread.yield();
System.out.println("isAlive thread del hilo se encuentra: " + thread.isAlive() );
System.out.println("Estatus thread del hilo se encuentra: " + thread.getState() );
System.out.println("isDaemon thread del hilo se encuentra: " + thread.isDaemon() );
System.out.println("isInterrupted del hilo se encuentra: " + thread.isInterrupted() );
System.out.println("isAlive thread2 del hilo se encuentra: " + thread2.isAlive() );
System.out.println("Estatus thread2 del hilo se encuentra: " + thread2.getState() );
System.out.println("isDaemon thread2 del hilo se encuentra: " + thread2.isDaemon() );
System.out.println("isInterrupted del hilo se encuentra: " + thread2.isInterrupted() );

thread2.join();
System.out.println("isDaemon del hilo se encuentra: " + thread.isDaemon() );
thread.interrupt();
System.out.println("isInterrupted del hilo se encuentra: " + thread.isInterrupted() );
thread.stop();
System.out.println("Estatus del hilo se encuentra: " + thread.getState() );
//Thread cthread;
System.out.println("isAlive thread2 del hilo se encuentra: " + thread2.isAlive() );
 
System.out.println("isAlive thread2 del hilo se encuentra: " + thread2.isAlive() );
thread3.setDaemon(true);
System.out.println("isDaemon thread3 del hilo se encuentra: " + thread3.isDaemon() );
//thread3.suspend();
System.out.println("isInterrupted thread3 del hilo en encuentra: " + thread3.isInterrupted() );
}

}
class Hilos2 implements Runnable{
public void run(){
System.out.println("Estoy run();");
//this.notify();
}
}
