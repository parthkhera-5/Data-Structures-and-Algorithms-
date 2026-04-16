import java.util.*;

public class RaisedToPow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to power "+ b +" is "+ a*pow(a,b-1) + " "); 
    }

    public static int pow(int a, int b){
        // Time Complexity: O(logn)
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2 == 0){
            return call*call;
        }
        else{
            return a*call*call;
        }

        // 
        // Time Complexity: O(n)
        // if(b==0) return 1;
        // return a*pow(a,b-1);
    }
}