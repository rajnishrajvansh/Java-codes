import java.util.*;
public class quad {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        float b=sc.nextFloat();
        float a=sc.nextFloat();
        float c=sc.nextFloat();
        float d;
        d=(b*b)-4*a*c;
        if(d>0){
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/2*a;
            System.out.println("Value of root1: " +root1+" and root2: "+root2);
        }
       else if(d==0){
            double root1=-b/2*a;
            System.out.println("Value of root1: " +root1);

        }
        else if(d<0){
            double root1=-b/2*a;
            double root2=-d/2*a;
            System.out.println("Value of root1: " +root1+" and root2: "+root2);
        }
    sc.close();

    }    
}
