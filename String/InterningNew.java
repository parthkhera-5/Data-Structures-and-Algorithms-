public class InterningNew {
    public static void main(String[] args) {
        // String s1 = "raghav";
        // String s2 = "raghav"; //true because same pointer
        // s += "garg";

        String s1 = new String("raghav");
        String s2 = new String("raghav"); // false if s1==s2 because it checks the address
        // System.out.println(s1==s2);
        // System.out.println(s1.charAt(0)==s2.charAt(0));
    }
}



// String is IMMUTABLE 
// if we want to change then weite s = "Vishal" then s.substring(0,2) + m + s.substring(4)

// String s = "Hello";
// s = "World";
// Now in this case string 's' will now point to the updated value of s

// new keyword
// String s ="Hello"
// String t ="Hello"
// now Memory will create a single string hello which will pointed by s and t both
// to solve this issue we use new keyword
// Syntax of new:
// String a = new String("Hello")
// now new string create with pointer by 'a'



