import java.util.*;

public class sum1ton{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
    public static int sum(int n){
        if(n==0) return 0;
        return n + sum(n-1);
    }
}

// Time complexity: O(n)

// global variable in java is declared as:  static int x = 10;
// local>global(preference) --> once local variable is declared then local variable is considered inside the function.