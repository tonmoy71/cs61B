package io.github.tonmoy71.queue;

/**
 * Created by Fahim on 3/2/2017.
 */
public interface Queue<E> {
    int size();

    boolean isEmpty();

    void enqueue(E e);

    E first();

    E dequeue();
}
