import java.util.*;

public class reverse{

    public static int rev(int n, int r){
        if(n==0) return r;

        return rev(n/10, r*10+n%10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 23435;
        // int r = 0;
        // while(n>0){
        //     r = r*10;
        //     r = r+n%10;
        //     n = n/10;
        // }
        // System.out.println(r);

        System.out.print(rev(n,0));
    }
        // int r = 0;
        // while(n>0){
        //     int r = r*10;
        //     r = r*(n%10);
        //     r = r/10;
        // }
}

// Input: 10
// output: it is 1 not 01