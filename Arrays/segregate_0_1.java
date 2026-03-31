import java.util.*;

class function_segregate{
    void segregate(int arr[]){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
    }
}
public class segregate_0_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        function_segregate obj = new function_segregate();
        obj.segregate(arr);

        System.out.println("Segregated array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}