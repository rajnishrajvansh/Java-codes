import java.util.Scanner;
public class transposrrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]={{1,2,3},{3,4,5},{5,4,7}};
        System.out.println("Original Array");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }

            System.out.println();
        }
System.out.println("Transposed Array");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[j][i]+" ");
            }

            System.out.println();
        }


sc.close();
    }
}
