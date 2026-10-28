import java.util.ArrayList;

public class longestpalindrome {
    public static int palindrome(String s){
        ArrayList<Integer> lower = new ArrayList<>();
        ArrayList<Integer> upper = new ArrayList<>();

        for(int i=0; i<26; i++){
            lower.add(0);
            upper.add(0);
        }

        // counting frequencies
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='a' && ch<='z'){
                int index = ch - 'a';
                lower.set(index, lower.get(index)+1);
            }
            else if(ch>='A' && ch<='Z'){
                int index = ch - 'A';
                upper.set(index, upper.get(index)+1);
            }
        }

        // couting the frequencies for plaindrome
        int count = 0;
        boolean odd = false;

        for(int i=0; i<s.length(); i++){
            if(lower.get(i)%2==0){
                count = count + lower.get(i);
            }
            else{
                count = count + lower.get(i) - 1;
                odd = true;
            }

            if(upper.get(i)%2==0){
                count = count + upper.get(i);
            }
            else{
                count = count + upper.get(i) - 1;
                odd = true;
            }
        }

        if(odd){
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "abccccdd";
        longestpalindrome obj = new longestpalindrome();
        int ans = obj.palindrome(s);
        System.out.println(ans);
    }
}