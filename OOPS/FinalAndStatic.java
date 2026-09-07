class Cricketer{
    // final String country = "India";

    static String country = "NZ";
    String name;
    int runs;
    double avg;
    void print(){
        System.out.println(runs+" "+name+" "+avg+" ");
    }
    static void greet(){
        System.out.println("I only believe in jassi bhai");
    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        // c1.country = "England";  //ERROR
        System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
        c1.country = "India";  // to change the country name
        System.out.println(c2.country);
        System.out.println(c1.country);
        Cricketer c3 = new Cricketer();
        c3.country = "England";
        System.out.println(c1.country);
        System.out.println(c2.country);
        System.out.println(c3.country);
        // c2.greet();
        Cricketer.greet();
        // System.out.println(Cricketer.country);

        // fun();
    }

    // private static void fun(){
    //     System.out.println("hello good");
    // }
}


// final keyword is used to fix the value
// final keyword variable is immutable.
// static varibale created once can be modified by multiple objects and can be applied similar to all the object values for that particular variable(common variable).
// static variable creates the vaariable accessible to all the objects.
// before the static variable vlaue changes it takes the original value but once it chnges and then accessed or print then updated value is shown.
