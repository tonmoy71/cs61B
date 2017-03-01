package io.github.tonmoy71.stack;

/**
 * Created by Fahim on 3/1/2017.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedStack<>(); // contents: ()
        stack.push(5); // contents: (5)
        stack.push(3); // contents: (5, 3)
        System.out.println(stack.size()); // contents: (5, 3) outputs 2
        System.out.println(stack.top()); // contents: (5, 3) outputs 2
        System.out.println(stack.pop()); // contents: (5) outputs 3
        System.out.println(stack.top()); // contents: (5, 3) outputs 5

        System.out.println(stack.isEmpty()); // contents: (5) outputs false
        System.out.println(stack.pop()); // contents: () outputs 5
        System.out.println(stack.isEmpty()); // contents: () outputs true
        System.out.println(stack.pop()); // contents: () outputs null
        stack.push(7); // contents: (7)
        stack.push(9); // contents: (7, 9)
        System.out.println(stack.top()); // contents: (7, 9) outputs 9
        stack.push(4); // contents: (7, 9, 4)
        System.out.println(stack.size()); // contents: (7, 9, 4) outputs 3
        System.out.println(stack.pop()); // contents: (7, 9) outputs 4
        stack.push(6); // contents: (7, 9, 6)
        stack.push(8); // contents: (7, 9, 6, 8)
        System.out.println(stack.pop());
    }
}
