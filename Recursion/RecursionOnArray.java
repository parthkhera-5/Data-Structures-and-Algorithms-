import java.util.*;

public class RecursionOnArray{
    public static void main(String[] args) {
        int arr[] = {1,4,5,63,2,4,65,6};
        // recPrint(arr,0);
        int ele = 63;
        System.out.print(exist(arr,ele,0));
    }

    public static boolean exist(int arr[], int ele, int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return exist(arr,ele,idx+1);
    }

    
    public static void recPrint(int arr[], int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+ " ");
        recPrint(arr,idx+1);
    }
}