package io.github.tonmoy71.stack;

/**
 * Created by Fahim on 3/1/2017.
 */
public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int index = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }


    @Override
    public void push(E e) {
        if (size() == data.length) {
            throw new IllegalStateException("Stack is full");
        }
        data[++index] = e;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E item = data[index];
        data[index] = null;     //dereferencing
        index--;
        return item;

    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[index];
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public boolean isEmpty() {
        return index == -1;
    }
}
