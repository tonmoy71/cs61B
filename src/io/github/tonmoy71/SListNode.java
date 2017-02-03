package io.github.tonmoy71;

/**
 * Created by tonmoy on 03-Feb-17.
 */
public class SListNode {
    public Object item;
    public SListNode next;

    public SListNode(Object item, SListNode next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SListNode{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
