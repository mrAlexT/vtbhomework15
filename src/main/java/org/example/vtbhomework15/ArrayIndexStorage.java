package org.example.vtbhomework15;

public class ArrayIndexStorage extends IndexStorage{
    int[] storage;

    public ArrayIndexStorage(int[] storage) {
        super(storage.length);
        this.storage = storage;
    }

    @Override
    public int get(int index) {
        return storage[index];
    }
}