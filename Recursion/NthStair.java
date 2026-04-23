import java.util.*;

public class NthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of ways to climb the stairs with max 2 jumps is: " + stairs(n));        
    }    
    public static int stairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return stairs(n-1) + stairs(n-2);
    }
}
