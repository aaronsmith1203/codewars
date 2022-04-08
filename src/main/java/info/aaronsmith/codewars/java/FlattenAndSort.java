package info.aaronsmith.codewars.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *
 * Given a two-dimensional array of integers,
 * return the flattened version of the array
 * with all the integers in the sorted (ascending)
 * order.
 *
 * Example:
 *   Given
 *     [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]]
 *   Return
 *     [1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

public class FlattenAndSort {

    public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = flattenArray(array);
        Collections.sort(list);
        return convertListToArray(list);
    }

    private static List<Integer> flattenArray(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }

    private static int[] convertListToArray(List<Integer> list) {
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }
}