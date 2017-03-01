package io.github.tonmoy71.stack;

import io.github.tonmoy71.linkedlist.book.SinglyLinkedList;

/**
 * Created by Fahim on 3/1/2017.
 */
public class LinkedStack<E> implements Stack<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<E>();

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
