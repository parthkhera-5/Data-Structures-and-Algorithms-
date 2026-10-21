import java.util.*;

public class lastoccurence{
    public static int last(int arr[], int target){
        int low=0, high=arr.length-1, idx=-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                idx=mid;
                low=mid+1;
            }
        }
        return idx;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the element of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the element to found: ");
            int target = sc.nextInt();

            System.out.print(last(arr,target));
        }
    }