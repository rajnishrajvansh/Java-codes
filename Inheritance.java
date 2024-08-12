import java.util.*;
class Product {
    int code;
    String name;
    Product(){
        code=1234;
        name="HP1";
        System.out.println("This is Parent Class");
    }
    void display(){
        System.out.println("Code "+code+" name: "+name);
        
    }
}
class Laptop extends Product{
    int HDD;
    int RAM;
    Laptop(){
        HDD=512;
        RAM=12;
        System.out.println("This is child classs");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.display();
}
}