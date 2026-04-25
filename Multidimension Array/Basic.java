import java.util.*;

public class Basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];

        // int arr[][] = {{1,2,3},{5,6,7},{6,8,9}};
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        } 
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
    }
}