package Miercoles;

interface Drawable{
    void draw();
}

class Rectangle3 implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class Circle3 implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}
public class InterfaceTest2 {
        public static void main(String[] args) {
            Drawable d = new Circle3();
            Drawable r = new Rectangle3();
            d.draw();
            r.draw();
    }
}
