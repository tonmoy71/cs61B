package io.github.tonmoy71.linkedlist;

import io.github.tonmoy71.linkedlist.book.CircularlyLinkedList;
import io.github.tonmoy71.linkedlist.book.DoublyLinkedList;
import io.github.tonmoy71.linkedlist.book.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        /* Singly Linked List */
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addFirst("Pen");
        list.addFirst("Notebook");
        list.addLast("Monitor");
        list.addLast("Keyboard");
        System.out.println(list);
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();

        /* Circularly Linked List */
        CircularlyLinkedList<String> cList = new CircularlyLinkedList<>();
        cList.addFirst("1");
        cList.addFirst("2");
        cList.addFirst("3");
        cList.rotate();
        System.out.println(cList);


        /* Doubly Linked List */
        DoublyLinkedList<String> dlist = new DoublyLinkedList();
        dlist.addLast("Envelope");
        dlist.addFirst("Brush");
        dlist.addFirst("Sticky notes");

        System.out.println(dlist);

        dlist.removeLast();
        dlist.removeFirst();
        dlist.removeFirst();
        dlist.removeFirst();


    }
}
