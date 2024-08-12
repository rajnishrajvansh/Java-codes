import java.util.Scanner;
public class prime {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        if(num==2){
            System.out.println("Prime Number");
        }
        while(i<num/2){
            if(num%i==0){
                System.out.println("Number is Not Prime");
               break;
            }
            else{
                i++;
            }
            System.out.println("Number is Prime");
            break;
        }
            
       
        sc.close();
    }
}