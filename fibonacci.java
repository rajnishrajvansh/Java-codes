import java.util.*;
public class fibonacci {
    static int fibo(int num){
        if(num==0|| num==1|| num==2){
            return 1;
        }
        else{
            int fibo= fibo(num-1)+fibo(num-2);
            return fibo;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      System.out.println(fibo(num));

        }
    }