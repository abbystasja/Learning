package edu.abby.learning.sorting;

/**
 * Created by abbystasja on 27/10/16.
 */
public class QuickSort extends Sort{
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private void quickSort(int[] array, int startPostion, int endPosition) {
        if (startPostion + 1 >= endPosition) {
            return;
        }

        int pivot = array[endPosition - 1];
        int currentStartPosition = startPostion;

        for (int j = startPostion; j < endPosition - 1; j++) {
            if (array[j] <= pivot) {
                swapElementsInArray(array, currentStartPosition++, j);
            }
        }

        swapElementsInArray(array, endPosition - 1, currentStartPosition);

        quickSort(array, startPostion, currentStartPosition);
        quickSort(array, currentStartPosition, endPosition);
    }
}
