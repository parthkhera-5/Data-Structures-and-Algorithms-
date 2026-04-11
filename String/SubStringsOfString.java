public class SubStringsOfString {
    public static void main(String[] args) {
        String s = "gopi";
        // System.out.println(s.substring(3,9)); //(3 to 9)
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}