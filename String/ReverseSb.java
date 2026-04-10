public class ReverseSb {
    public static void main(String[] args) {
        // String s = "Devansh";
        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // sb.deleteCharAt(1);
        // sb.insert(1, 'e');
        // sb.delete(3,6);


        // Reverse code
        // int i=0, j=s.length()-1;
        // while(i<=j){
        //     char temp1 = sb.charAt(i);
        //     char temp2 = sb.charAt(j);
        //     sb.setCharAt(i, temp2);
        //     sb.setCharAt(j, temp1);
        //     i++;
        //     j--;
        // }

        String s = "Aditya";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(sb);
    }
}
