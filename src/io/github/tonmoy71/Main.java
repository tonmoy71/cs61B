package io.github.tonmoy71;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("Pen");
        list.addFirst("Notebook");

        list.addLast("Monitor");
        list.addLast("Keyboard");

        System.out.println("First node: " + list.first());
        System.out.println("Last node: " + list.last());

        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();



    }
}
