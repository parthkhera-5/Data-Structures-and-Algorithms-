// import java.util.*;

// public class gcd{
//     public static void main(String[] args) {
//         int a = 12, b =20;
//         System.out.println(gcdHCF(a,b));
//     }

//     public static int gcdHCF(int a, int b){
//         int hcf = 1;
//         for(int i=2; i<Math.min(a,b);i++){
//             if(a%i==0 && b%i==0){
//                 hcf = i;   //This will add new i every time and the latest add i is the hcf for the number
//             }
//         }
//         return hcf;
//     }
// }

// // Brute force
// // Time complexity: O(min(a,b))
// // Space Complexity: O(1) 

import java.util.*;

public class gcd{
    public static void main(String[] args) {
        int a = 12, b =20;
        System.out.println(gcdHCF(a,b));
    }

    public static int gcdHCF(int a, int b){
        if(a==0) return b;
        return gcdHCF(b%a, b);
    }
}

// Optimal force
// Time complexity: O(log(min(a,b)))
// Space Complexity: O(1) 
