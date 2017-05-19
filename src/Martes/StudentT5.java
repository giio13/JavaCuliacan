/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

// this: to pass as argument in the constructor class
public class StudentT5 {
        
    Student10 obj;
    StudentT5(Student10 obj){
        this.obj=obj;
    }
    void mostrar(){
        System.out.println(obj.id);
    }
}

class Student10{
    int id=001;
    public Student10(){        
        StudentT5 s5= new StudentT5(this);
        s5.mostrar();
    }
    
    public static void main(String[] args) {
        
        Student10 s1 = new Student10();
    }
}

