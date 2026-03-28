
// Brute force (Method-1)
import java.util.*;

class LeftRotate{
    public void leftrotate(int arr[], int d){
        int n = arr.length;
        d = d%n;

        // Step-1: Shifting the elements till 'd' to temp array: O(d)
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        // Step-2: Making the shifting: O(n-d)
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];      // d=3, then {1,2,3,4,5,6,7} then d=3 so i-d = 3-3=0, then i-d then 4-3 = 1, then 4-2=2. 
        }

        // Step-3: Putting temp to original array: O(d)
        for(int i=n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
    }

    public void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class LeftRotateDPlace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: "+" ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the rotate value: ");
        int d = sc.nextInt();

        LeftRotate obj = new LeftRotate();

        obj.leftrotate(arr,d);


        System.out.print("The rotated array is: ");
        obj.printarray(arr);
    }
}

// Time complexity: O(d) + O(n-d) + O(d) = O(n+d)
// Space complexity: O(d), because temp array is using to store vallue till 'd'

// Optimal SOlution(Method-2):
// It is on leetcode and gfg