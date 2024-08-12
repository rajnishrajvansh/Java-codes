import java.util.Arrays;
import java.util.Scanner;


public class arraytobst {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }    

    public static Node ConvertArtoBST(int []arr){
        if(arr.length<2){
            return null; 
        }
        int mid=(arr.length/2);
       return [arr[midpoint],ConvertArtoBST(arr.slice(0,mid)),ConvertArtoBST(arr.slice(mid+1,arr.length))]
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,5,4,2,6,8,6,2};
        int n=arr.length;
        Node root;
        Arrays.sort(arr);
        ConvertArtoBST(arr);

    }
}
