// String is immutable

import java.util.*;

public class PassingStringtomethod{

    public static void change(String s){
        s = "Deepansh";
    }
    public static void main(String[] args){
        String s = "raghav";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}