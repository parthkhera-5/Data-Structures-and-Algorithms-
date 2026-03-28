// Array is static, and arraylist is dynamic
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava{
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr.get(2)); // arr[2]
        arr.set(3,100); //arr[3] = 100
        System.out.println(arr); // not traversing the array by own
        // int n = arr.length; //array
        int n = arr.size(); // Arraylist
        // for(int i=0; i<n; i++){
        //     System.out.println(arr.get(i)+" ");
        // }

        // for(int ele : arr){
        //     System.out.println(ele+" ");
        // }

        // 10 20 30 100 50
        arr.add(79);
        arr.add(1,1001);
        System.out.println(arr);
        arr.remove(arr.size()-1);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}