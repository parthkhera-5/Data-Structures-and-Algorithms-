import java.util.*;

public class FindTheWinner {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        int n = q.size();
        int k = 3;
        int winner = findWinner(n,k);
        System.out.println(winner);
    }
    public static int findWinner(int n, int k){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            q.add(i);
        }
        while(q.size()>1){
            //k-1 elements remove and add
            for(int i=1; i<=k-1; i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}
