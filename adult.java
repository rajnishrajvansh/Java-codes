import java.util.Scanner;

public class adult {
    public static void main(System[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("Not adult");
        }
    sc.close();

    }
}