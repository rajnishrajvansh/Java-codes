import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<(2*i)-1; k++) {
                System.out.print("*");
            }
            for (int l = i; l<n; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1 ; i < temp; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int k =i; k<(2*temp)-i; k++) {
                System.out.print("*");
            }
           for(int z=0;z<i;z++){
            System.out.print(" ");
           }
            System.out.println();
        }
        sc.close();
    }
}
