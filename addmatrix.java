import java.util.Scanner;

public class addmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]={{1,2,3},{3,4,5},{5,4,7}};
        int arr2[][]={{1,2,3},{3,4,5},{5,4,7}};
        int n=3;
        int arr3[][]=new int[n][n];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
               arr3[i][j]=(arr1[i][j]*arr2[i][j]);
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr3[i][j]+" ");
            }

            System.out.println();
        }



    }
}
