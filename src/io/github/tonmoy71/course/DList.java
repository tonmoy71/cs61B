package io.github.tonmoy71.course;

/**
 * Created by tonmoy on 05-Feb-17.
 */
public class DList {
    private DListNode head;
    private DListNode tail;
    private int size;

    public void insertFront(Object item) {
        head = new DListNode(item, head);
        size++;
    }

    @Override
    public String toString() {
        return "DList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    public void deleteEnd() {

    }
}
