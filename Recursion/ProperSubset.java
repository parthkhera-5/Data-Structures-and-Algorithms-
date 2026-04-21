import java.util.*;

public class ProperSubset {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);
    }    
    public static void subsets(String ans,String s,int idx, ArrayList<String> list){
        if(idx==s.length()){
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1,list);    //pick
        subsets(ans,s,idx+1,list);   //skip
    }
}


// 🧠 How recursion calls are made (DETAILED TRACE)


// 🔹 Level 0 (idx = 0, char = 'a')
// Call 1
// subsets("", "abc", 0)


// Two calls are made 👇

// 🔹 Level 1 (idx = 1, char = 'b')
// Call 2 — PICK 'a'
// subsets("a", "abc", 1)


// Again, two calls:

// 🔹 Level 2 (idx = 2, char = 'c')
// Call 3 — PICK 'b'
// subsets("ab", "abc", 2)


// Two more calls:

// 🔹 Level 3 (idx = 3 → BASE CASE)
// Call 4 — PICK 'c'
// subsets("abc", "abc", 3)


// ✅ idx == s.length()
// ➡ print: abc
// ⬅ return

// Call 5 — SKIP 'c'
// subsets("ab", "abc", 3)


// ➡ print: ab
// ⬅ return

// ⬅ return to Call 2

// 🔹 Back to Level 2 (from "a")
// Call 6 — SKIP 'b'
// subsets("a", "abc", 2)


// Two calls again:

// Call 7 — PICK 'c'
// subsets("ac", "abc", 3)


// ➡ print: ac
// ⬅ return

// Call 8 — SKIP 'c'
// subsets("a", "abc", 3)


// ➡ print: a
// ⬅ return

// ⬅ return to Call 1

// 🔹 Back to Level 1 (idx = 1, ans = "")
// Call 9 — SKIP 'a'
// subsets("", "abc", 1)


// Two calls:

// 🔹 Level 2 (char = 'b')
// Call 10 — PICK 'b'
// subsets("b", "abc", 2)

// Call 11 — PICK 'c'
// subsets("bc", "abc", 3)


// ➡ print: bc
// ⬅ return

// Call 12 — SKIP 'c'
// subsets("b", "abc", 3)


// ➡ print: b
// ⬅ return

// ⬅ return

// 🔹 Back to Level 2 (ans = "")
// Call 13 — SKIP 'b'
// subsets("", "abc", 2)

// Call 14 — PICK 'c'
// subsets("c", "abc", 3)


// ➡ print: c
// ⬅ return

// Call 15 — SKIP 'c'
// subsets("", "abc", 3)


// ➡ print: "" (empty subset)
// ⬅ return

// ✅ FINAL OUTPUT (order of printing)
// abc ab ac a bc b c 