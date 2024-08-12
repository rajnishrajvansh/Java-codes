import java.util.Scanner;
public class first
{
    static void fun(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int sum=0,count=0;
        for(int j=1;j<=arr.length-1;j++){
            if(arr[j]>arr[j-1]){
                count++;
                sum+=arr[j]-arr[j-1];
                }
                else
                break;
                }
                System.out.println("Number of increasing subsequence is:"+count);
                System.out.println("Sum of differences between consecutive terms is:"+sum);
    sc.close();

                }
                public static void main (String[] args) {
                    fun();
                    
                    }


 }