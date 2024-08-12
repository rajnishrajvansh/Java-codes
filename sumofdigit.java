import java.util.Scanner;
public class sumofdigit {
   
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int x=num%10;
            sum=sum+x;
            num=num/10;
        }
        System.out.println(sum);
    sc.close();

}
}
