package org.example.vtbhomework15;

import java.util.Arrays;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        //  IndexStorage
        IndexStorage storage = new IndexStorage(6);
        System.out.println("IndexStorage, size: " + storage.size());
        System.out.println("IndexStorage, reverse: " + Arrays.toString(storage.reverse()));
        System.out.println();

        // ArrayIndexStorage
        ArrayIndexStorage indexStorage = new ArrayIndexStorage(new int[]{1, 5, 11, 500, -1, 0, 33});
        System.out.println("ArrayIndexStorage, size: " + indexStorage.size());
        System.out.println("ArrayIndexStorage, reverse: " + Arrays.toString(indexStorage.reverse()));
    }
}
