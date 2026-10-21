import java.util.*;

public class firstoccurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        System.out.print(first(arr,target));
    }

    public static int first(int arr[], int target){
        int low = 0, high = arr.length-1, idx=-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target) high = mid-1;
            else if(arr[mid]<target) low= mid+1;
            else{
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }
}