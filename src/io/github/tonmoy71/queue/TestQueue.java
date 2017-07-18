package io.github.tonmoy71.queue;

/**
 * Created by Fahim on 3/2/2017.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayQueue<>(5);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 5; i++) {
            queue.dequeue();
        }

        queue.enqueue(4);
        queue.enqueue(8);
        queue.dequeue();
        queue.dequeue();

    }
}
