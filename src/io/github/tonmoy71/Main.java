package io.github.tonmoy71;

import io.github.tonmoy71.book.CircularlyLinkedList;
import io.github.tonmoy71.book.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
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

        CircularlyLinkedList<String> cList = new CircularlyLinkedList<>();
        cList.addFirst("1");
        cList.addFirst("2");
        cList.addFirst("3");

        cList.rotate();

        System.out.println(cList);


    }
}
