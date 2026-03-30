
// Reverse an array using bubble sort and it should be sorted and printed in decreasing order after sorting

import java.util.*;

public class ReverseArray{ 
    public static void main(String args[]){
        int arr[] = {4,5,1,2,3,10};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int flag = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
        if(flag == 0){
            break;
        }
    }
    System.out.println(Arrays.toString(arr));
    }
}