import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
public class BasicSTLOfQueues{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();  //LinkedList and ArrayDeque both are valid and used.
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("The size of queue is: " + q.size());
        System.out.println("The peek element of queue is: " + q.peek());
        System.out.println(q.remove()+" "+q); 
    }
}