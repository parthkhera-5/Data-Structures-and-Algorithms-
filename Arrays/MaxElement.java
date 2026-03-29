// package Arrays;

// Program to find the maximum element in the array
import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {3,5,7,-4,5,77,0,100};

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
