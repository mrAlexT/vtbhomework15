package org.example.vtbhomework15;

public class IndexStorage {
    protected int size;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return index % 2 == 0 ? index : -index;
    }

    public int[] reverse() {
        int size = size();
        int[] arr = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            arr[size - i - 1] = get(i);
        }

        return arr;
    }
}
