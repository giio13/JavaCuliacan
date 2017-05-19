package Jueves;
/*
Paralelimo: Multihilos en java: es el proceso para ejeccutar muchos hilos de manera simnultanea.
Hilo: Subproeso ligero, unidad muy pequeña de procesamiento.
Concurrencia: Multiprocesamiento y multihilo se utilizan para lograr la multitarea, en la concurrencia pueden o no ser
multiprocesamiento

Ventajas de usar hilos:
    1.- No bloqueamos al usuario por que son tarea independientes y se pueden realizar muchas tareas al mismo tiempo.
    2.- Podemos relizar muchas tareas al mismo tiempo.
    3.- Los hilos al ser independientes no se afectan entre si, en caso de ocurrir una excepcion de un hilo los demas 
        funcionan igual.
Multitarea: Proceso de ejecucion de muchas tareas, usamos la multitarea para utilizar el CPU. La multitarea se logra de dos maneras:
    1-. Multitarea basada en proceso.
        Cada proceso tiene su propia direccion en memoria,
        es decir cada proceso asigna un area separada en memoria.
        El proceso es pesado
        El costo de la comunicacion entre el proceso es alto.
        Cambiar de un proceso a otro requiere el tiempo para guardar
        y cargar registros, mapas de memoria, listas de atualizacion,
        etc.
    2.- Multitarea basada en hilos(Multihilos)
        Los hilos comparten los mismos espacios en memoria, direcciones.
        El hilo es ligero
        El costo de comunicacion entre hilso es bajo.
        
    Un hilo es un subproceso ligero, es independiente, si se produce una excepcion
    en un hilo no afecta a los demas hilos y comparten un area de memoria comun.

Ciclo de vida de un hilo
    1.-New: El hilo esta en este estado, si se crea una instancia de la clase Thread pero antes  de la invocacion del metodo start().
    2.-Runnable: El hilo esta en este estado, despues de la invocacion del metodo start(), pero el thread Scheduler
                 (Administrador de hilos) no lo ha seleccionado como el hilo en ejecucion.
    3.-Running: El hilo esta aqui cuando el Thread Scheduler lo ha seleccionado.
    4.-Non-Runnable(Blocked): Es el estado cuando el hilo sigue sin embargo no es apto para ejecutarse.
    5.-Terminated: Es el estado cuando el hilo ha finalizado o muerto, cuando sale del metodo run().

Hay 2 formas de crar un hilo:
    1.-Extender de la clase Thread.
    2-.Implementar de la interface Runnable.

Clase Thread 
    Proporciona los constructores y metodos para crear y realizar operaciones en un hilo. La clase thread extiende de la clase object
    e implementa la interface Runnable.
        Constructores de la clase Thread
            Thread()
            Thread(String name)
            Thread(Runnable r)
            thread(Runnable r, String name)
Runnable    
    La interfaz Runnable debe ser implementada por cualquier clase cuyas instancias esten destinadas a ser ejecutadas por un hilo.
    La interfaz Runnable tiene un solo metodo denominado run().
    Public void run(): Es usado para reliazar las operaciones de un hilo.
*/

public class HilosT extends Thread{
    @Override
    public void run(){
        
        System.out.println("Soy un hilo corriendo");
    }
    
    public static void main(String[] args) {
        HilosT t1 = new HilosT();
        t1.start();
        
        Hilos t = new Hilos();
        Thread thread = new Thread(t);
        thread.start();
    }
}

class Hilos implements Runnable{
    @Override
    public void run(){
        
        System.out.println("Hilo dos esta corriendo");
    }
}