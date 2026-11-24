import java.util.*;

public class BasicSTLOfStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        // st.pop();  //Underflow
        // System.out.println(st.peek());
        st.push("Gulshan"); //bottom
        st.push("Devansh");
        st.push("Parth");
        st.push("Jayensh");
        st.push("Satvik"); //top
        System.out.println(st.size());
        System.out.println(st);  //Auxiliary Space = O(n)
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // if we print the stack.pop() then it works like peek() also and return the top value like peek() and then removes the element
        String s = st.pop();
    }
}
