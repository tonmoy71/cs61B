package io.github.tonmoy71.linkedlist.course;

/**
 * Created by Fahim on 2/2/2017.
 */
public class ListNode {
    public int item;
    public ListNode next;

    public ListNode(int i) {
        this(i, null);
    }

    public ListNode(int i, ListNode n) {
        item = i;
        next = n;
    }

    public void insertAfter(int item) {
        next = new ListNode(item, next);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
