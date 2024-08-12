class Shape{
    void Rectangle(){
    System.out.println("Rectangle");
}
    void Circle(){
    System.out.println("Circle");
    }
    void draw(){
        System.out.println("We will draw some shape of circle");
        }
}
class Dimentions extends Shape{
    void draw(){
    System.out.println("We will draw some shape");
    }
}
class Perimeter extends Shape{
    void draw(){
    System.out.println("We will draw some Perimeter");
    }
}
public class mehodoverriding {
    public static void main(String[] args) {
        // Dimentions d=new Dimentions();
        Shape s=new Perimeter();
        s.draw();
    }
}
