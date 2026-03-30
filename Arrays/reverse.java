import java.util.*;

public class reverse{
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,5,7,8,2};

        // Method -1 
        // int n = arr.length;
        // for(int i=0; i<n/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }

        // Method -2 
        int i=0; 
        int j=arr.length-1;
        
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        // For-each loop printing
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}