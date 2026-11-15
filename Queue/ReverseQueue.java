import java.util.*;
public class ReverseQueue {
    public static void main(String[] args) {
        
    }
    public void reverseQueue(Queue<Integer> q) {   
        // Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        // return q;
    }
}
