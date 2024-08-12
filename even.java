import java.util.Scanner;

public class even {
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        boolean a=false;
            int x=sc.nextInt(); 
    for(int i=1;i<=x;i++){
        a=!a;
    }
    if(a==true){
        System.out.println("odd");
    }
    else{
        System.out.println("even");
    }
    sc.close();

}
}
