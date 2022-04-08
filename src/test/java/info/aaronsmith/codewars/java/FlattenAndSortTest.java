package info.aaronsmith.codewars.java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FlattenAndSortTest {

    @Test
    public void flattenAndSortTest1() {
        final int[][] INPUT = {
            {3, 2, 1},
            {4, 6, 5},
            {},
            {9, 7, 8}
        };
        final int[] EXPECTED = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals(EXPECTED, FlattenAndSort.flattenAndSort(INPUT));
    }

    @Test
    public void flattenAndSortTest2() {
        final int[][] INPUT = {{},{}};
        final int[] EXPECTED = {};

        assertArrayEquals(EXPECTED, FlattenAndSort.flattenAndSort(INPUT));
    }

    @Test
    public void flattenAndSortTest3() {
        final int[][] INPUT = {};
        final int[] EXPECTED = {};

        assertArrayEquals(EXPECTED, FlattenAndSort.flattenAndSort(INPUT));
    }

    @Test
    public void exampleTest() {
        assertArrayEquals(new int[]{}, FlattenAndSort.flattenAndSort(new int[][]{}));
        assertArrayEquals(new int[]{1}, FlattenAndSort.flattenAndSort(new int[][]{{}, {1}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, FlattenAndSort.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, FlattenAndSort.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));
        assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, FlattenAndSort.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
    }
}
