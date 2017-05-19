package Viernes;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.IIOException;

public class TestIO3 {
    public static void main(String[] args)throws IIOException, FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\CC-01\\Desktop\\Tareaio.txt");
        FileOutputStream fos2 = new FileOutputStream("C:\\Users\\CC-01\\Desktop\\Tareaio2.txt");
        
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        baos.write(65);
        baos.writeTo(fos);
        baos.writeTo(fos2);
        
        baos.flush();
        baos.close();
        System.out.println("Listo");
    }
}
