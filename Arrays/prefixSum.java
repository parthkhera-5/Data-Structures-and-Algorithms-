public class prefixSum {
    public static void main(String[] args) {
        int arr [] = {1,5,4,7,8,9};

        // int prefix[] = new int[arr.length];
        
        
        //method -1
        // prefix[0] = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     prefix[i] = prefix[i-1] + arr[i];
        // }


        int prefix[] = new int[arr.length+1];
        //method-2
        prefix[0] = 0;
        for(int i=0; i<arr.length; i++){
            prefix[i+1] = prefix[i] + arr[i];
        }
        for(int j=0; j<prefix.length; j++){
            System.out.println(prefix[j] + " ");
        }
    }
}
