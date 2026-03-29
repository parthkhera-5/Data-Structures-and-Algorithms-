// Multiply odd index element by 2 and add 10 to even index element
import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7};
        for(int i=0; i<arr.length; i++){
            if(i%2!=0){
                arr[i] = arr[i]*2;
            }
            else{
                arr[i] = arr[i]+10;
            }
        }

        System.out.println(Arrays.toString(arr));
    }    
}
