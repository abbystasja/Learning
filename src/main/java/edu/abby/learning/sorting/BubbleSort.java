package edu.abby.learning.sorting;

/**
 * Created by abbystasja on 27/10/16.
 */
public class BubbleSort extends Sort{

    @Override
    public void sort(int[] input) {
        //Adding this not to run n^2 sorting complexity every time we run tests
        assert input.length <= 1000;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (input[j] > input[i]) {
                    swapElementsInArray(input, j, i);
                }
            }
        }
    }
}
