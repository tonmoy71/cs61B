package io.github.tonmoy71.stack;

/**
 * Created by Fahim on 3/1/2017.
 */
public interface Stack<E> {

    void push(E e);

    E pop();

    E top();

    int size();

    boolean isEmpty();
}
