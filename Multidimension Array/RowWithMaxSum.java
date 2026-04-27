import java.util.*;

public class RowWithMaxSum{
    public static void main(String[] args) {
        int arr[][] = {{2,4,5,6,7},{5,4,6,7,8},{4,6,7,8,8}};
        int maxSum = Integer.MIN_VALUE; // To maintain a variable to store the largest sum among all the sum
        int row = -1; // TO find out the row number of the row with the max sum
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr[0].length; j++){
                sum +=arr[i][j];
            }
            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println("The row number with maxsum is "+row + " and the maxsum is: "+ maxSum);
    }
}