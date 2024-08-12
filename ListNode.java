import java.util.Scanner;

public class ListNode {
    public static void main(String[] args){
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
}
class llpalindrome {
    static ListNode MiddleLL(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head.next == null) {
            return head;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static ListNode ReverseLL(ListNode mid) {
        ListNode curr = mid;
        ListNode prev = null;
        ListNode frwd = mid.next;
        while (curr != null) {
            frwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = frwd;
        }
        mid.next = prev;
        return prev;
    }

    static boolean Palindrome(ListNode head, ListNode mid) {
        ListNode temp1 = head;
        ListNode temp2 = mid;
        while (temp1 != null && temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = MiddleLL(head);
        ListNode rev = ReverseLL(mid);
        boolean ans = Palindrome(head, mid);
        return ans;
    }

}
