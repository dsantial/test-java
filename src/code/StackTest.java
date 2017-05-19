package code;

import java.util.Stack;

/**
 * Created by 390767 on 17-5-19.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String > stack = new Stack<String>();
        for (String s:"My dog has flead".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.println(stack.pop() + " ");
    }
}
