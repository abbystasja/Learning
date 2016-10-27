package edu.abby.learning.sorting;

/**
 * Created by abbystasja on 27/10/16.
 */
public class HeapSort extends Sort {
    @Override
    public void sort(int[] array) {
        heapify(array);

        for (int i = array.length; i > 0; i--) {
            swapElementsInArray(array, 0, i-1);
            siftDown(array, 0, i-1);
        }
    }

    private void heapify(int[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            siftDown(array, i, array.length);
        }
    }

    private void siftDown(int[] array, int elementToHeapify, int currentElementQuantity) {
        int left = 2 * elementToHeapify + 1;
        int right = 2 * elementToHeapify + 2;
        int max = elementToHeapify;

        if (left < currentElementQuantity && array[max] < array[left]) {
            max = left;
        }

        if (right < currentElementQuantity && array[max] < array[right]) {
            max = right;
        }

        if (max != elementToHeapify) {
            swapElementsInArray(array, max, elementToHeapify);
            siftDown(array, max, currentElementQuantity);
        }
    }
}
