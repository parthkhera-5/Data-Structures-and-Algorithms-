// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Array_remove_Duplicates {
//     static int removedupl(int arr[],int n){
//         int temp[] = new int[n];
//         temp[0] = arr[0];
//         int res = 1;
//         for(int i=1; i<n; i++){
//             if(temp[res-1]!=arr[i]){
//                 temp[res] = arr[i];
//                 res++;
//             }
//         }
//         for(int i=0; i<res; i++){
//             arr[i] = temp[i];
//         }
//     return res;
//     }
//     public static void main(String[] args) {
//         Array_remove_Duplicates obj = new Array_remove_Duplicates();
//         int arr[] = {1,2,2,3,4,5,5,5,6};
//         int n = 9;
//         for(int i=0; i<n; i++){
//         System.out.println("Array before removing duplicate: " + arr[i]);
//         }
//         System.out.println();
//         n = obj.removedupl(arr, n);
//         for(int i=0; i<n; i++){
//         System.out.println("Array after removing duplicte: " + arr[i]);
//     }
// }
// }
// TC: O(n)
// SC: O(n)



import java.util.*;
import java.io.*;
import java.lang.*;

public class Array_remove_Duplicates {
    static int removedupl(int arr[], int n){
        int res=1;
        for(int i=0; i<n; i++){
            if(arr[res-1]!=arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,4,4,5,5};
        int n = 10;
        Array_remove_Duplicates obj = new Array_remove_Duplicates();
    for(int i=0; i<n; i++){
        System.out.println("Before removal: " + arr[i]);
    }
    System.out.println();
    n = obj.removedupl(arr,n);
    for(int i=0; i<n; i++){
        System.out.println("After removal: " + arr[i]);
    }
}
}

// TC: O(n)
// SC: O(1) AUXILLARY SPACE