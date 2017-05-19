
package Viernes;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.InetAddress;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
/*
Informacion que contiene una URL
Protocol: En este caso http es el protocolo
Server Name o IP Address: Oracle y google
Port Number: Es un atributo opcional. Si escribimos google.com:80, 80 es el puerto.
Si el puerto no es mencionado en la URL regresa -1
File Name o Directory Name: /?gfe_rd=cr&ei=rjsfWaiKE4XD8geVh67QBQ
*/

public class Properties {
    public static void main(String[] args) throws IOException {
        InetAddress ip = InetAddress.getByName("www.oracle.com");
        System.out.println("Nombre del host:"+ip.getHostName());
        System.out.println("Direccion IP:"+ip.getHostAddress());
        
        URL url = new URL("https://www.google.com.mx/?gfe_rd=cr&ei=rjsfWaiKE4XD8geVh67QBQ#q=thread");
        System.out.println("Protocolo:"+ url.getProtocol());
        System.out.println("Host Name:"+ url.getHost());
        System.out.println("File Name:"+url.getFile());
        System.out.println("Port Number:"+url.getPort());
        
        HttpsURLConnection hus = (HttpsURLConnection) url.openConnection();
        for(int i=1; 1<=8;  i++ ){
            System.out.println(hus.getHeaderFieldKey(i)+" = "+hus.getHeaderField(i));
        }
        
        hus.disconnect();
    }
}
