package io.github.tonmoy71.book;

/**
 * Created by Fahim on 2/7/2017.
 */
public class CircularlyLinkedList<E> {

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getNext().getElement();     // head is after the tail
        }
    }

    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    /**
     * Rotates the first element to the back of the list
     */
    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();      // old head becomes the new tail
        }
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<E>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> node = new Node<E>(e, tail.getNext());
            tail.setNext(node);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (!isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            return null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return tail.getElement();
    }

    @Override
    public String toString() {
        return "CircularlyLinkedList{" +
                "tail=" + tail +
                ", size=" + size +
                '}';
    }

    /* Nested Node class */
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> node) {
            this.element = element;
            this.next = node;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }

}
