class pivot{
    public static int pivotIndex(int arr[]){
        int total = 0;

        for(int nums:arr){
            total = total + nums;
        }

        int leftSum = 0;

        for(int i=0; i<arr.length; i++){
            int rightSum = total - leftSum - arr[i];

            if(rightSum == leftSum){
                return i;
            }

            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        pivot obj = new pivot();
        int ans = obj.pivotIndex(arr);
        System.out.println(ans);   
    }
}

//Time complexity: O(n)
//Space complexity: O(1)