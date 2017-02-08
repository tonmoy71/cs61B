package io.github.tonmoy71.course;

/**
 * Created by tonmoy on 05-Feb-17.
 */
public class DListNode {
    Object item;
    DListNode next;
    DListNode prev;

    @Override
    public String toString() {
        return "DListNode{" +
                "item=" + item +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }

    public DListNode(Object item, DListNode node) {
        this.item = item;
        this.next = node;
    }
}
