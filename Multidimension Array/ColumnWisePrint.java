public class ColumnWisePrint{
    public static void main(String[] args){
        int arr[][] = {{1,2,4,5},{5,6,7,8},{5,7,7,8}};

        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}