import java.util.*;
public class rangeSum {
    public static ArrayList<Integer> range(int[][] query, int prefix[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<query.length; i++){
            int left = query[i][0];
            int right = query[i][1];

            int ans = prefix[right+1] - prefix[left];
            al.add(ans);
        }
        return al; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int arr[] = {1,4,5,6,4,2};

        int prefix[] = new int[arr.length+1];

        for(int i=0; i<arr.length; i++){
            prefix[i+1] = prefix[i] + arr[i];
        }
        // int left = 1;
        // int right = 3;
        int query[][] = {{1,3},{0,4}};

        rangeSum obj = new rangeSum();
        ArrayList<Integer> ans = obj.range(query, prefix);
        System.out.println(ans);

    }
}
