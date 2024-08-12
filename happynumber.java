import java.util.Scanner;

public class happynumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0){
            int x=num%10;
             sum=sum+(x*x);
             num=num/10;
        }
        if(temp==sum){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number");
        }
    sc.close();

    }
}
