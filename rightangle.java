import java.util.Scanner;
public class rightangle {
   public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int hypo=sc.nextInt();   
        int height=sc.nextInt();   
        int base=sc.nextInt();   
        if((Math.pow(hypo,2))==Math.pow(height,2)+Math.pow(base,2)){
            System.out.println("Right angle");
        }
        else{
            System.out.println("Not a right angle");
        }
        sc.close();

}
}
