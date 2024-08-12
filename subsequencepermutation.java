import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class subsequencepermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int [] arr={1,2,3};
        int target=3;
        int n=arr.length;
        List<Integer> lst=new ArrayList<>();
        findSubsequence(i,arr,target,n,lst);
        sc.close();
    }
    static void findSubsequence(int i,int[] arr,int target,int n,List<Integer>lst){
        if(i==n){
            if(target==0){
                System.out.println(lst);
            }
                return;
            }
            if(target>=arr[i]){
            lst.add(arr[i]);
            findSubsequence(i, arr, target-arr[i], n, lst);
            lst.remove(lst.size()-1);
            }
            findSubsequence(i+1, arr, target, n, lst);
        }
    }
