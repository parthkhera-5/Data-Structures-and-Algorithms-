import java.util.*;

class Node{
    int val;
    Node next; //By default null
    Node(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList{
    public static void main(String[] args){
        // 10->20->30->40->50
        Node a = new Node(10);  //head node
        // a.val = 10;
        Node b = new Node(20);
        // b.val = 20;
        Node c = new Node(30);
        // c.val = 30;
        Node d = new Node(40);
        // d.val = 40;
        Node e = new Node(50);
        // e.val = 50;
        // System.out.println(a.next);


        // Connect karenge (Link Karenge)
        a.next = b;  
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a.next);
        // System.out.println(c);
        // System.out.println(b.next);

        // System.out.println(a.next[3].val); // error
        System.out.println(a.next.next.next.val);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);

    }
}