import java.util.*;

public class MinElement{
    public static void main(String[] args) {
        int arr[] = {56,35,6,7,8};

        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}