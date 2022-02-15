package org.example.vtbhomework15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexStorageTest {
    @Test
    public void testReverseZero() {
        ArrayIndexStorage storage = new ArrayIndexStorage(new int[]{});
        Assertions.assertArrayEquals(storage.reverse(), new int[]{});
    }

    @Test
    public void testReverseOne() {
        ArrayIndexStorage storage = new ArrayIndexStorage(new int[]{1});
        Assertions.assertArrayEquals(storage.reverse(), new int[]{1});
    }

    @Test
    public void testReverseTwo() {
        ArrayIndexStorage storage = new ArrayIndexStorage(new int[]{0, -1});
        Assertions.assertArrayEquals(storage.reverse(), new int[]{-1, 0});
    }

    @Test
    public void testReverseMore() {
        ArrayIndexStorage storage = new ArrayIndexStorage(new int[]{1, 1, 1});
        Assertions.assertArrayEquals(storage.reverse(), new int[]{1, 1, 1});
    }
}
