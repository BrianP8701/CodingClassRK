import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        int a = 5;
        Stack stack = new Stack<>();
        stack.add(a);
        stack.add(a);
        stack.add(a);
        stack.add("AAA");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
