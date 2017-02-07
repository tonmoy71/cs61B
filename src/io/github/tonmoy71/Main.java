package io.github.tonmoy71;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("Pen");
        list.addFirst("Notebook");

        list.addLast("Monitor");
        list.addLast("Keyboard");

        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();

        CircularlyLinkedList<String> cList = new CircularlyLinkedList<>();
        cList.addFirst("1");
        cList.addFirst("2");
        cList.addFirst("3");

        cList.rotate();



    }
}
