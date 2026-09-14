import java.util.Arrays;

public class Marks {
    public static class StudentData {
        String name;
        int rno; 
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }

        // StudentData(int[] s){    //shallow copy
        //     marks = s;
        // }

        StudentData(int[] s){   //deep copy
            marks = Arrays.copyOf(s, s.length);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,4,8};
        StudentData s1 = new StudentData(4);
        s1.marks[0] = 60;
        System.out.println(arr[0]);
        // StudentData s2 = new StudentData(2);
        // s1.marks[0] = 80;
        // s1.marks[1] = 87;
        // s1.marks[2] = 90;
        // s1.marks[3] = 100;
    }
}