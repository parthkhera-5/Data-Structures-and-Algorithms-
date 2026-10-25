// import java.util.*;

import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
    }
}
public class CircularFashion {
        public static Node2 createList(int n, Scanner sc) {
        if (n == 0) return null;

        System.out.print("Enter values: ");
        int value = sc.nextInt();
        Node2 head = new Node2(value);
        Node2 temp = head;

        for (int i = 1; i < n; i++) {
            value = sc.nextInt();
            temp.next = new Node2(value);
            temp = temp.next;
        }

        return head;
    }
    public static void printList(Node2 head) {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void circular(Node2 head){
        Node2 slow = head;
        Node2 fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = head;
        return reverse(slow);
    }

    public static void reverse(Node2 head){
        Node2 curr = head;
        Node2 prev = null;
        Node2 fwd = null;

        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
    }
    public static void joinInter(Node2 head){
        while(slow!=null)
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
    }
}


// Input: 1->2->3->4->5->6->7

//Output: 4->3->5->2->6->1->7

