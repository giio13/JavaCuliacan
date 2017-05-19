/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;


public class Empleado {
    float salario= 4000;
}

class Programador extends Empleado {
    int bono = 10000;
    
    public static void main(String[] args) {
        Programador p = new Programador();
        System.out.println("El salario de un programador es"+ " " +p.salario);
        System.out.println("El bono es de"+" " +p.bono);
    }
}
