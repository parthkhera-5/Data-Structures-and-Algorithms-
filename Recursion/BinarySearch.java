import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.print("Enter the element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        int result = search(arr,target);

        if(result==-1){
            System.out.print("element not found in the array");
        }
        else{
            System.out.println("Element found in the array at the index "+ result);
        }
    }
    public static int search(int arr[], int ele){
        int n = arr.length;
        return helper(arr,ele,0,n-1);
    }
    public static int helper(int arr[], int ele, int low, int high){
        if(low>high) return -1;
        int mid = low + (high-low)/2;
        if(arr[mid]==ele){
            return mid;
        }
        else if(arr[mid]>ele){
            return helper(arr,ele,low,mid-1);
        }
        else{
            return helper(arr, ele, mid+1, high);
        }
    }
}