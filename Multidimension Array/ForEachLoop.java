public class ForEachLoop{
    public static void main(String[] args){
        int arr[][] = {{1,2,4},{6,7,8},{6,7,1}};


        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        // for(int i=0; i<arr.length; i++){
        //     for(int ele : arr[i]){
        //         System.out.print(ele+" ");
        //     }
        //     System.out.println();
        // }
    }
}