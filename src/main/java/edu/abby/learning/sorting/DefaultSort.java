package edu.abby.learning.sorting;

import java.util.Arrays;

/**
 * This class using for comparison only
 * Created by abbystasja on 27/10/16.
 */
public class DefaultSort extends Sort {

    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
