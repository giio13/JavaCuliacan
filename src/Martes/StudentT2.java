/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

//this: to invoke current class method
public class StudentT2 {
    public static void main(String[] args) {
        Saludos s1= new Saludos();
        s1.tambienSaluda();
    }
}   
       class Saludos {
        public void  Saludar(){
        System.out.println("Hola");
    }
       
    public void tambienSaluda(){
        System.out.println("Yo tambien saludo");
        this.Saludar();
    }
 }

