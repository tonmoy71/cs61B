package io.github.tonmoy71.stack;

import java.util.Arrays;

/**
 * Created by Fahim on 3/1/2017.
 */
public class TestReverseArray {

    public static <E> void reverse(E[] source) {
        Stack<E> buffer = new LinkedStack<E>();
        for (int i = 0; i < source.length; i++) {
            buffer.push(source[i]);
        }
        for (int i = 0; i < source.length; i++) {
            source[i] = buffer.pop();
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        String[] text = {"Hello", "World", "!"};

        System.out.println("Before reversing...");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(text));

        reverse(numbers);
        reverse(text);

        System.out.println("After reversing...");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(text));

    }
}
