// class Node{ //user defined data type
//     int val;
//     Node next;
//     Node(int val){
//         this.val = val;
//     }
// }

// class Linkedlist{  
//     Node head;
//     Node tail;
//     int size;  //Time: O(1)
//     int search(int val){
//         if(head==null){
//             return -1;
//         }
//         Node temp = head;
//         int idx = 0;
//         while(temp!=null){
//             if(temp.val==val) return idx;
//             temp=temp.next;
//             idx++;
//         }
//         return -1;

//     }
//     void addAtTail(int val){  //Time: O(1), Space:O(1)
//         Node temp = new Node(val);
//         if(tail==null){
//             head = tail = temp;
//         }
//         else{
//             tail.next = temp;
//             tail = temp;
//         }
//         size++;    
//     }
//     void addAtHead(int val){  //Time: O(1), Space:O(1)
//         Node temp = new Node(val);
//         if(head == null){
//             head = tail = temp;
//         }
//         else{
//             temp.next = head;
//             head = temp;
//         }
//         size++;
//     }
//     void deleteAtHead(){ //Time: O(1)
//         if(head==null){
//             System.out.println("List is empty!");
//             return;
//         }
//         head = head.next;
//         if(head==null) tail=null;
//         size--;
//     }
//     void deleteAtTail(){ //Time: O(n)
//         if(tail==null){
//             System.out.println("List is empty");
//             return;
//         }
//         if(head==tail){
//             head=null;
//             tail=null;
//             size--;
//             return;
//         }
//         Node temp = head;
//         while (temp.next!=tail) {
//             temp=temp.next;
//         }
//         temp.next=null;
//         tail=temp;
//         size--;
//     }
//     void display(){  // Time: O(n)
//         if(head == null) return;
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     int get(int idx){
//         Node temp = head;
//         for(int i=1; i<=idx; i++){
//             temp = temp.next;
//         }
//         return temp.val;
//     }
//     void insert(int val, int idx){  //Time: O(n), SPace:O(1)
//         if(idx<0 || idx>size){
//             System.out.println("Invalid index");
//             return;
//         }
//         else if(idx==0) addAtHead(val);
//         else if(idx==size) addAtTail(val);
//         else{
//             Node temp = head;
//             for(int i=1; i<idx; i++){
//                 temp = temp.next;
//             }
//             Node t = new Node(val);
//             t.next = temp.next;
//             temp.next = t;
//             size++;
//         }
//     }
//     void delete(int idx){ //Time: O(n)
//         if(idx<0 || idx>size){
//             System.out.println("Invalid index");
//             return;
//         }
//         if(idx==0){
//             deleteAtHead();
//             return;
//         }
//         Node temp = head;
//         for(int i=1; i<idx; i++){
//             temp=temp.next;
//         }
//         temp.next = temp.next.next;
//         if(idx == size-1) tail=temp;
//         size--;
//     }
// }

// public class LinkedListDataStructure {
//     public static void main(String[] args) {
//         Linkedlist ll = new Linkedlist();
//         ll.addAtTail(10);
//         ll.addAtTail(20);
//         ll.addAtTail(30);
//         ll.addAtTail(40);
//         ll.display();
//         ll.addAtHead(50);
//         ll.addAtHead(60);
//         ll.display();
//         ll.deleteAtHead();
//         ll.display();
//         System.out.println(ll.size);
//         ll.insert(11,2);
//         ll.display();
//         System.out.println(ll.size);
//         ll.deleteAtTail();
//         ll.display();
//         // ll.get(2);
//         ll.delete(2);
//         ll.display();
//     }
// }




class Node1{
    int val;
    Node1 next;
    Node1(int val){
        this.val = val;
    }
}

class Linkedlist{
    Node1 head;
    Node1 tail;
    int size;

    int search(int val){
        if(head==null){
            return -1;
        }
        Node1 temp = head;
        int idx = 0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    void addAtHead(int val){
        Node1 temp = new Node1(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }    
        size++;
    }

    void addAtTail(int val){
        Node1 temp = new Node1(val);
        if(tail==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtIndex(int val, int idx){
        // Node1 temp = new Node1(val);
        if(idx<0 || idx>size){
            System.out.println("Invalid");
            return;
        }
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node1 temp = head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            Node1 t = new Node1(val);
            t.next = temp.next;
            temp.next = t;
        }
        size++;
    }

    void display(){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void deleteAtHead(){ 
        if(head==null){
            tail=null;
        }
        else if(head==tail){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }
        size--;
    }

    void deleteAtTail(){
        if(tail==head){
            System.out.println("List is empty");
        }
        else if(tail==null){
            head=null;
            tail=null;
            size--;
            return;
        }
        else{
            Node1 temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void insertBefore(int target, int val){
    if(head == null) return;
 
    if(head.val == target){
        addAtHead(val);
        return;
    }

    Node1 prev = head;
    Node1 curr = head.next;

    while(curr != null){
        if(curr.val == target){
            Node1 t = new Node1(val);
            prev.next = t;
            t.next = curr;
            size++;
            return;
        }
        prev = curr;
        curr = curr.next;
    }

    System.out.println("Target not found");
    }

    void insertAfter(int target, int val){
    Node1 temp = head;

    while(temp != null){
        if(temp.val == target){
            Node1 t = new Node1(val);
            t.next = temp.next;
            temp.next = t;

            if(temp == tail){
                tail = t;
            }

            size++;
            return;
        }
        temp = temp.next;
    }

    System.out.println("Target not found");
    }
}


public class LinkedListDataStructure{
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(1);
        ll.addAtTail(2);
        ll.addAtTail(3);
        ll.addAtHead(10);
        ll.addAtHead(100);
        ll.insertAtIndex(0,1);
        ll.display();
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.display();
        ll.deleteAtTail();
        ll.display();
        ll.search(2);
        ll.display();
        ll.addAtTail(1000);
        ll.addAtTail(2000);
        ll.addAtTail(3000);
        ll.display();
        ll.addAtHead(4000);
        ll.addAtHead(5000);
        ll.display();
        ll.deleteAtTail();
        ll.display();
        ll.deleteAtHead();
        ll.display();
        ll.insertAtIndex(10000,1);
        ll.display();
        ll.insertAfter(10000,200000);
        ll.display();
        ll.insertBefore(4000, 1);
        ll.display();
    }
}