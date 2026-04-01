import java.util.*;

public class Shallow_Deep{
    public static void main(String[] args) {
        int arr[] = {2,4,2,6,7,8,1,0};

        // Shallow copy
        int y1[] = arr;
        y1[0] = 101;

        // System.out.println(arr[0]);
        // System.out.println(y1[0]);

        // Deep copy
        int y2[] = Arrays.copyOf(arr,arr.length);
        y2[0] = 99;
        System.out.println(arr[0]);
        System.out.println(y2[0]);
        System.out.println(arr[0]);
    }
}