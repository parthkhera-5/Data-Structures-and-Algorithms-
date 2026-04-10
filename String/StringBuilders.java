import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {
        // ArrayList<Character> str = new ArrayList<>();

        StringBuilder s = new StringBuilder("Raghav");
        s.setCharAt(1,'o');
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);

        s.append("garg");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
    }
}

// String Builder has its capacity (intial = 16)

// Time complexity: O(1)