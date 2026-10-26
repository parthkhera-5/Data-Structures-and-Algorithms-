import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class DisplayList{
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);

    }
    public static void display(Node head){ 
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

        // for(Node temp=head; temp!=null; temp=temp.next){
        //     System.out.print(temp.val+" ");
        // }
        // System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node a = new Node(100);  //head node
        Node b = new Node(11);
        Node c = new Node(12);
        Node d = new Node(22);
        Node e = new Node(24);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Node n = null;
        // System.out.print(n.val); // Null pointer exception
        // System.out.print(n.next);
        
        System.out.print(get(a,2));
        
        // display(a);
        // displayRec(a);
    }
        private static int get(Node head, int idx){
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.val;
        }
    }
