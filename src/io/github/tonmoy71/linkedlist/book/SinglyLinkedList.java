package io.github.tonmoy71.linkedlist.book;

/**
 * Created by Fahim on 2/6/2017.
 */
public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {

    }

    /**
     * Gets the size of the list.
     *
     * @return Size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Returns if the list is empty or not.
     *
     * @return true or false.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Gets the first/head node of the list.
     *
     * @return Element of the first node.
     */
    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return head.element;
        }
    }

    /**
     * Adds a new node at the beginning of the list.
     *
     * @param element Node to be inserted.
     */
    public void addFirst(E element) {
        head = new Node<E>(element, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    /**
     * Adds a new node at the end of the list.
     *
     * @param element Node to be inserted.
     */
    public void addLast(E element) {
        Node<E> newest = new Node<E>(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }


    /**
     * Removes the first node of the list. If the list is already empty, does nothing.
     *
     * @throws NullPointerException When the list contains only one item.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
            if (size == 0) {
                tail = null;
            }
        }
    }

    /**
     * Gets the last node of the list.
     *
     * @return Element of the last node.
     */
    public E last() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.element;
        }
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
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

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }

}
