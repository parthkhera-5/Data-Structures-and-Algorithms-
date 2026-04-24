import java.util.*;

public class UniquePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currrow=sc.nextInt();
        int currcol=sc.nextInt();
        int lastrow = sc.nextInt();
        int lastcol = sc.nextInt();

        // System.out.println("The number of paths available are: " + paths(row,col));
        System.out.println("The number of paths available are: " + paths(currrow,currcol,lastrow,lastcol));
    }

    // Method-1
    // public static int paths(int row, int col){
    //     if(row==1 || col==1) return 1; 

    //     return paths(row,col-1) + paths(row-1, col);
    // }

    // Time complexity : O(2^(r+c))
    // Space complexity : O(r+c)

    // Method-2
    public static int paths(int currrow, int currcol, int lastrow, int lastcol){
        if(currrow==lastrow && currcol==lastcol) return 1;
        if(currrow>lastrow || currcol>lastcol) return 0;

        int right = paths(currrow, currcol+1, lastrow, lastcol);
        int down = paths(currrow+1, currcol, lastrow, lastcol);
        return right + down;
    }

    // R = lastrow - currrow
    // C = lastcol - currcol

    // Time Complexity : O(2^(R+C))
    // Space complexity: O(R+C)
}
