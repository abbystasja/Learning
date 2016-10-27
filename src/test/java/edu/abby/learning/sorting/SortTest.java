package edu.abby.learning.sorting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

/**
 * Created by abbystasja on 27/10/16.
 */
@RunWith(value = Parameterized.class)
public class SortTest {

    private int quantityOfElements;
    private int[] arrayToSort;

    @Parameterized.Parameters(name = "{index}: quantitiyOfElements - {0}, maxElement - {1}")
    public static Collection sortingParameters() {
        return Arrays.asList(new Object[][] {
                { 0, 0 },
                { 1, 1 },
                { 10, 10 },
                { 100, 100 },
                { 1000, 1000 },
                { 10000, 10000 },
                { 100000, 100000 },
        });
    }

    public SortTest(int quantityOfElements, int maximumElementInArray) {
        this.quantityOfElements = quantityOfElements;

        arrayToSort = new int[quantityOfElements];

        for (int i = 0; i < quantityOfElements; i++) {
            arrayToSort[i] = (new Random()).nextInt(maximumElementInArray);
        }
    }

    public void runTest(Sort sortAlgorythmToCheck){
        int inputArray[] = Arrays.copyOf(arrayToSort, quantityOfElements);
        sortAlgorythmToCheck.sort(inputArray);
        checkArrayIsSorted(inputArray);
    }

    @Test
    public void testDefaultSort(){
        runTest(new DefaultSort());
    }

    @Test
    public void testBubbleSort(){
        runTest(new BubbleSort());
    }

    private void checkArrayIsSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            Assert.assertTrue(array[i] <= array[i+1]);
        }
    }
}
