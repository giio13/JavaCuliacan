package Viernes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class TestIO2 {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("C:\\Users\\CC-01\\Desktop\\Tarea\\a.txt");
        
        FileInputStream fis2 = new FileInputStream("C:\\Users\\CC-01\\Desktop\\Tarea\\b.txt");
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\CC-01\\Desktop\\Tarea\\c.txt");
        
        
        SequenceInputStream sis = new SequenceInputStream(fis , fis2);
        
        int i;
        while((i=sis.read())!=-1){
            System.out.println((char)i);
        }
        sis.close();
        fis.close();
        fis2.close();
        fos.close();
    }
}
