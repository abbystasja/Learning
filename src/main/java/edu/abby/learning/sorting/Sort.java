package edu.abby.learning.sorting;

/**
 * Created by abbystasja on 27/10/16.
 */
public abstract class Sort {
    public abstract void sort(int [] array);

    public void swapElementsInArray(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void printArray(int[] array){
        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
