import java.util.*;
public class largest{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=9;
        int b=6;
        int c=7;
        int res=(a>(b?(a>c)):((b>(a?a:b))>(c?b:c);
        System.out.println(res);




    //     if(a>b){
    //         if(a>c){
    //             System.out.println(a);
    //         }
    //         else{
    //             System.out.println(c);
    //         }
    //     }
    //    else if(b>a){
    //         if(b>c){
    //             System.out.println(b);
    //         }
    //         else{
    //             System.out.println(c);
    //         }
    //     }
    //     else{
    //         System.out.println(c);
    //     }

        sc.close();
    }

   
}