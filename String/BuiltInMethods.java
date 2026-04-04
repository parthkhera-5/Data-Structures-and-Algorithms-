import java.util.*;

public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Virat Kohli";
        String s1 = "Virender Sehwag";
        // System.out.println(s.indexOf('K'));
        // System.out.println(s.lastIndexOf('i'));
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.contains("Vir"));
        // System.out.println(s.startsWith("Vi"));
        // System.out.println(s.endsWith("li"));
        
        
        // s.toUpperCase();  //not possible
        // s = s.toUpperCase();  // possible
        // System.out.println(s);
        s.compareTo(s1);
    }
}


// lexographically smaller
// raghav  sneha (we compare the first letter then the small letter is the lexographical small, also if first letter is same then we move to next unmatch letter)
// Raghav < aditya (ASCII value)