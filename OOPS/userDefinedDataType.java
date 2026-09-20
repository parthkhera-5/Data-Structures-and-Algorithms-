import java.util.Scanner;

public class userDefinedDataType{
    public static class Student{    //Built our own data type
        String name;
        int rno;
        double cgpa;

        void print(){
            System.out.println(name+" "+cgpa+" "+rno);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();     // object declaration
        s1.name = "Naman";
        s1.rno = 10;
        s1.cgpa = 9.02;

        Student s2 = new Student();     // object declaration
        s2.name = "Archit";
        s2.rno = sc.nextInt();
        s2.cgpa = 8.33;

        Student s3 = new Student();
        s3.name = "Shanu";
        s3.rno = 14;
        s3.cgpa = 7.50;

        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        s3.cgpa = 9.4;  //cgpa changed
        System.out.println(s2.rno);

        s1.print();
        s2.print();
        s3.print();
    }
}


// Classes - These are the blueprint
// Objects - These are the real world entities

// Note: Scanner is also a class.