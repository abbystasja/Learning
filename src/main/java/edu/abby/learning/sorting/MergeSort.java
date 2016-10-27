package edu.abby.learning.sorting;

import java.util.Arrays;

/**
 * Created by abbystasja on 27/10/16.
 */
public class MergeSort extends Sort{

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length);
    }

    public void mergeSort(int[] array, int startPosition, int endPosition) {
        if (endPosition - startPosition < 2) {
            return;
        }

        int middlePosition = (endPosition - startPosition) / 2 + startPosition;

        mergeSort(array, startPosition, middlePosition);
        mergeSort(array, middlePosition, endPosition);

        mergeArray(array, startPosition, endPosition, middlePosition);
    }

    public void mergeArray(int[] array, int startPosition, int endPosition, int middlePosition) {
        int[] leftArray = Arrays.copyOfRange(array, startPosition, middlePosition);
        int[] rightArray = Arrays.copyOfRange(array, middlePosition, endPosition);

        int leftPosition = 0;
        int rightPosition = 0;

        for (int i = startPosition; i < endPosition; i++) {
            if (leftPosition >= leftArray.length) {
                array[i] = rightArray[rightPosition++];
                continue;
            }

            if(rightPosition >= rightArray.length || leftArray[leftPosition] < rightArray[rightPosition]){
                array[i] = leftArray[leftPosition++];
            } else {
                array[i] = rightArray[rightPosition++];
            }
        }
    }
}
