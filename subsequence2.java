import java.util.*;
public class subsequence2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={2,4,5,3,1};
        int k=7;
        int n=arr.length;
        List<Integer>lst=new ArrayList<>();
        int s=0;
        findSubsequence(arr,0,s,k,lst,n);
        sc.close();
    }
    static void findSubsequence(int[]arr,int i,int s,int k,List<Integer> lst,int n){
        if(i==n){
            if(s==k){
                System.out.println(lst);
            }
            return;
        }
        lst.add(arr[i]);
        s+=arr[i];
        findSubsequence(arr, i+1, s, k, lst,n);
        lst.remove(lst.size()-1);
        s-=arr[i];
        findSubsequence(arr, i+1, s, k, lst, n);
        
    }
}
