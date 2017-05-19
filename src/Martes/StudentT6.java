/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;
//this: that return as a current statement from the method
public class StudentT6 {
    public static void main(String[] args) {
    new AC().getAC().msg();    
    }
}   
    class AC {
       public AC getAC(){
            return this;
        }
        void msg(){
            System.out.println("Hola");
        }
}    

