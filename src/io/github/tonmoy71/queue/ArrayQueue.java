package io.github.tonmoy71.queue;

/**
 * Created by Fahim on 3/2/2017.
 */
public class ArrayQueue<E> implements Queue<E> {
    public static final int CAPACITY = 1000;

    private E[] data;
    private int front;
    private int size;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        int available = (front + size) % data.length;
        data[available] = e;
        size++;

    }

    @Override
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E value = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;

        return value;
    }
}
