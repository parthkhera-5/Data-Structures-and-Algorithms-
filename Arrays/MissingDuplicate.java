//Index Marking Approach

import java.util.*;
public class MissingDuplicate {

    public List<Integer> MissingDuplicateValues(int arr[]){
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int value = Math.abs(arr[i]);
            int position = value - 1;

            if(arr[position]>0){
                arr[position] = -arr[position];
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                int valueAtThisPoint = i + 1;
                ans.add(valueAtThisPoint);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,4,5,2,2};
        MissingDuplicate obj = new MissingDuplicate();
        System.out.println(obj.MissingDuplicateValues(arr));
    }
}


//Time complexity: O(n)