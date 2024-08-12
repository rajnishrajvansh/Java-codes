import java.util.*;
public class stringpalin {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                j=j+i-1;
                for(int k=i;k<j;k++){
                    System.out.println(str[i]);

                }
            }
        }






        sc.close();

    }
}
