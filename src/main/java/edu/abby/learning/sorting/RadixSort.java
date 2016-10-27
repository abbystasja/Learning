package edu.abby.learning.sorting;

import java.util.Arrays;

/**
 * Created by abbystasja on 27/10/16.
 */
public class RadixSort extends Sort {
    private final int radix = 10;

    public void sort(int[] array) {
        int level = 0;

        boolean numbersLimitNotReached = true;

        while (numbersLimitNotReached) {

            int[] radixIndex = new int[radix];

            numbersLimitNotReached = false;
            int radixToLevel = (int) Math.pow(radix, level);

            for (int i = 0; i < array.length; i++) {
                int nonSortedPart = array[i] / radixToLevel;

                int placeToPutElement = nonSortedPart % radix;

                if (!numbersLimitNotReached && (nonSortedPart / radix > 0)) {
                    numbersLimitNotReached = true;
                }
                if (placeToPutElement != 9) {
                    radixIndex[placeToPutElement + 1]++;
                }
            }

            for (int i = 1; i < radixIndex.length; i++) {
                radixIndex[i] += radixIndex[i - 1];
            }

            int[] output = Arrays.copyOf(array, array.length);

            for (int i = 0; i < output.length; i++) {
                int nonSortedPart = output[i] / radixToLevel;

                int placeToPutElement = nonSortedPart % radix;

                array[radixIndex[placeToPutElement]++] = output[i];
            }

            level++;
        }
    }
}
