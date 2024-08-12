import java.util.Scanner;
class Calculation{
    int multiplication(int a, int b){
        return a*b;
    }
    float multiplication(float a, float b, float c){
        return a*b*c;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculation cal=new Calculation();
       int a= cal.multiplication(43, 21);
       float b= cal.multiplication(43.5f, 21.5f, 23.f);
       System.out.println(a);
       System.out.println(b);
       sc.close();
    }
}
