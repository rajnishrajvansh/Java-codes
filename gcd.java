import java.util.*;
public class gcd{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;}
      while(num2>0){
        int temp1=num2;
        num2=num1%num2;
        num1=temp1;
      }
      System.out.println("GCD is: " + num1);

        }
       
    }