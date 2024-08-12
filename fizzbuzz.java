/*Write a program that prints the numbers from 1 to 100.
For multiples of three, print "Fizz" instead of the number,
and for the multiples of five, print "Buzz".
For numbers which are multiples of both three and five, print "FizzBuzz".*/
import java.util.Scanner;
public class fizzbuzz {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=0;
        while(num++<=100){
            if(num%3==0&&num%5==0){
                System.out.println("FizzBuzz");
            }
            else if(num%3==0){
                System.out.println("Fizz");
            }
            else if(num%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(num);
            }
        }
    sc.close();

}
}
