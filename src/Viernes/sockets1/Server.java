package Viernes.sockets1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    Networking es un concepto de conectividad entre 2 o mas dispositivos juntos, que comparten recursos.
    
    La programacion de sockets proporciona la facilidad para compartir datos entre difreentes dispositivos.
    
    Vetajas de Networking en Java
        Compartir recursos
        Centralizar la gestion de software
       
Conceptos:
    Direccion IP: Numero dinamico asignado a un nodo de una red compuesta por octetos que van del 0 al 255.
    Es una direccon logiga que puede ser cambiada.
    
    Protocolo: Conjunto de reglas que se establecen para la comunicacion: EJ: FTP, TCP, Telnet, SMTP, POP, etc.
    
    MAC:(Media Acceso Control) Identificador unico de NIC
    NIC:(Network Interface Controller) Un nodo de rede puede tener multiples NIC, pero solo un MAC unico.
    Direccion fisica estatica.
    
    Protocolo Orientado a  la comunicacion
        Connection - Oriented
        Es un protocolo de tipo TCP, tcp/ip, confiable pero lento. El acuse de recibo es enviado por el receptor.

        Connection-Less
        El receptor no envia el acuse de recibo.
        Es rapido, sin embargo no es confiable. EJ: UDP.

Socket: punto final en una conexion Bidireccional
    La programacion de sockets se utiliza para la comunicacion entre las aplicaciones que se ejecutan entre diferentes aplicaciones JRE.
    Java Runtime Enviroment.
    
    La programacion del socket puede ser orientada a la conexion o sin conexion.
    
Las clases Java Socket y ServerSocket
Connection Oriented

Las clases DatagramSocket y DataGramPacket
Connection Less

El cleinte del socket necesita saber:
    IP Address del Server
    Port Numer
    Socket Class

    Metodos
        public InputStream getInputStream()
        regresa el is adjunto con el socket.
        public OutputStream getOutputStream()
        regresa el os adjunto al socket
        public Synchronized void close()
        cerrar el socket

    Server Socket
Metodos:
    public Socket accept()
        Establece la conexion entrante
    public synchronized void close()
        Cierra la coneexion
*/
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println("Mensaje:" + str );
        
        ss.close();
    }
}
