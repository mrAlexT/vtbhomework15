package org.example.vtbhomework15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {
    @Test
    public void testReverseZero() {
        IndexStorage storage = new IndexStorage(0);
        Assertions.assertArrayEquals(storage.reverse(), new int[]{});
    }

    @Test
    public void testReverseOne() {
        IndexStorage storage = new IndexStorage(1);
        Assertions.assertArrayEquals(storage.reverse(), new int[]{0});
    }

    @Test
    public void testReverseTwo() {
        IndexStorage storage = new IndexStorage(2);
        Assertions.assertArrayEquals(storage.reverse(), new int[]{-1, 0});
    }

    @Test
    public void testReverseMore() {
        IndexStorage storage = new IndexStorage(6);
        Assertions.assertArrayEquals(storage.reverse(), new int[]{-5, 4, -3, 2, -1, 0});
    }
}
