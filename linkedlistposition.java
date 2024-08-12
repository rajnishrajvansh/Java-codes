import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlistposition {

    static Node InsertAtFirst(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }

    static Node InsertAtLast(Node head, int data) {
        Node node2 = new Node(data);
        if (head == null) {
            return node2;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node2;
        return head;
    }

    static Node InsertAtPosition(Node head, int data, int pos) {
        if (pos < 1) {
            System.out.println("Position should be >= 1.");
            return head;
        }
        if (pos == 1) {
            return InsertAtFirst(head, data);
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return head;
        }
        Node node2 = new Node(data);
        node2.next = temp.next;
        temp.next = node2;
        return head;
    }

    static Node  DeleteAtLast(Node head){
        Node curr=head;
        Node prev=null;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return head;

    }

    static boolean isCircular(Node head){

        if(head==null) return true;
        Node temp=head;
        while(temp!=null && temp!=head){
            temp=temp.next;
        }
        if(temp==head){
            return true;
        }
        return false;
    }

    static Node ReverseLL(Node head){
        Node curr=head;
        Node prev=null;
        Node fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        head=prev;
        return head;
    }
    static Node MiddleLL(Node head){
        Node curr=head;
        Node now=head;

        while(curr!=null&&curr.next!=null){
            curr=curr.next.next;
            now=now.next;
        }
       return now;
    }
   


    static void Print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
        System.out.println("Initial Linked List");
        Print(head);
        head = InsertAtFirst(head, 5);
        System.out.println("Insert At First");
        Print(head);

        head = InsertAtLast(head, 2);
        System.out.println("Insert At the last");
        Print(head);

        head = InsertAtPosition(head, 13, 4);
        System.out.println("Insert at specific position");
        Print(head);

        // Testing insertion at invalid position
        head = InsertAtPosition(head, 99, 0);
        Print(head);

        head = InsertAtPosition(head, 99, 10);
        Print(head);

        head= DeleteAtLast(head);
        System.out.println("After deletion:");
        Print(head);
        // boolean x=isCircular(head);
    //     if(x==true){
    //     System.out.println("Circular");
    // }
    //     else{
    //         System.out.println("Not Circular");
    //     }
        head=ReverseLL(head);
        Print(head);
        head=MiddleLL(head);
        System.out.println(head.data);
        }
    }
