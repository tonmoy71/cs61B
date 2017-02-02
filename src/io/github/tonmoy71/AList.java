package io.github.tonmoy71;

/**
 * Created by Fahim on 2/2/2017.
 */
public class AList {
    int a[];
    int lastItem;

    public AList() {
        this.a = new int[5];
        this.lastItem = 0;
    }


    private void insertItem(int newItem, int location) {
        int i;
        if (lastItem + 1 == a.length) {
            int b[] = new int[2 * a.length];
            for (i = 0; i <= lastItem; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        for (i = lastItem; i >= location; i--) {
            a[i + 1] = a[i];
        }
        a[location] = newItem;
        lastItem++;
    }

    public void insertItem(int newItem) {
        this.insertItem(newItem, lastItem);

    }

}
