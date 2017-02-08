package io.github.tonmoy71.course;

/**
 * Created by tonmoy on 03-Feb-17.
 */
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    public void insertFront(Object item) {
        head = new SListNode(item, head);
        size++;
    }


    public void deleteFront() {
        head = head.next;
        size--;
    }

    @Override
    public String toString() {
        return "SList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
