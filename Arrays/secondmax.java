import java.util.*;
public class secondmax {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int size;
    System.out.println("Enter the size of array ");
    size = sc.nextInt();

    System.out.println("enter elements: ");
    int arr[] = new int[size];
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;

    // To find out the largest element
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }

    // To find out second largest element, expecting that it should not consider the first max element
    for(int i=0; i<arr.length; i++){
        if(arr[i]>smax && arr[i]!=max){
            smax = arr[i];
        }
    }
    System.out.println("The first maximum element is " + max);
    System.out.println("The second maximum element is " + smax);
    }
}
