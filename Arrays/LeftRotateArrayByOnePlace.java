// Optimal (Method-1)

import java.util.*;

public class LeftRotateArrayByOnePlace {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // Input array elements
        Scanner sc = new Scanner(System.in); 
        int arr[] = new int[5]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Main function 
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp; 
        
        // Printing array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Time complexity: O(n)
// Space complexity: O(1), since no extra array is used