import java.util.Scanner;

public class MinAmongMaxRowElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // row size
        int m = sc.nextInt(); // col size

        int arr[][] = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int minAmongMax = Integer.MAX_VALUE;
        int rowmin = -1;

        for(int i=0; i<arr.length; i++){
            int maxElementrow = -1;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>maxElementrow){
                    maxElementrow=arr[i][j];
                }
            }
            if(maxElementrow<minAmongMax){
                minAmongMax = maxElementrow;
                rowmin = i;
            }
        }
        System.out.println(minaAmongMax+" "+rowmin);
    }
}

// Time complexity: O(mn)
// Space complexity: O(mn)