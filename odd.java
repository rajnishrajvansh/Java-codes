import java.util.Scanner;

public class odd {
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            if((x&1)==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
    sc.close();

}
}
