package Carrera;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Carrera {
static String sNombreArchivo="C:\\Users\\CC-01\\Desktop\\Tarea"; 
static String sArchivo="Myarchive.txt";
public Carrera() {
// TODO Auto-generated constructor stub
}

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
 
Tortuga t = new Tortuga();
Thread t2 = new Thread(new Liebre());
t.start();
t2.start();
Leer();
}
public void Escribir(String msg){
try{
FileOutputStream fos = new FileOutputStream(sNombreArchivo+ sArchivo);
fos.write(msg.getBytes());
fos.close();
}catch (IOException ioe) {
// TODO: handle exception
}
}
 
public static void Leer(){
try{
FileInputStream fis = new FileInputStream(sNombreArchivo+ sArchivo);
BufferedInputStream bis = new BufferedInputStream(fis);
int i;
while((i = bis.read()) != -1 ){
System.out.println((char)i);
}
bis.close();
fis.close();
}catch (IOException ioe) {
// TODO: handle exception
}
}
}