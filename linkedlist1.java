import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist{
  static Node InsertAtFirst(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }

    static Node InsertAtLast(Node head,int data){
        Node node2=new Node(data);
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=
    }

    static void Print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        
        }
        System.out.println();
    }
}
public class linkedlist1 {   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node obj1=new Node(5);
        Node obj2=new Node(6);
        obj1.next=obj2;
        obj2.next=new Node(7);
        Node obj=new Node(1);
        obj.next=obj1;
        System.out.println(obj.next.data);
       obj= InsertAtFirst(obj,30);
       Print(obj);
    }
}
