import java.util.*;
public class StringBuilderJava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("GeeksForGeeks");
        System.out.println("Initial String: " + sb);
        sb.append(" is awesome");
        System.out.println("After append: " + sb);
    }
}
