import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }    
    public static void hanoi(int n, char src, char helper, char dest){
        if(n==0) return;
        // n-1 disks from src(A) to helper(B) via dest(C)
        hanoi(n-1,src,dest,helper);
        // large disk from src to dest
        System.out.println(src+"->"+dest);
        // n-1 disks from helper(B) to dest(C) via src(A)
        hanoi(n-1,helper,src,dest);
    }
}



// Alternate method --> For every 'n' disks we have 2^n-1 steps to move disk from src to dest
// Math.pow(2^n)-1