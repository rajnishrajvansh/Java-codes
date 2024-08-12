import java.util.*;
public class perfectnumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int j=1;j<=num;j++){
            int sum=0;
        for(int i=1;i<=j/2;i++){
            if(j%i==0){
                sum=sum+i;
            }
        }
        if(sum==j){
            System.out.println("Number is perfect "+ j);
    }    
        }
    sc.close();

    }
}
