package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {

    @Test
    /* Unit of work/condicao/esperado */
    public void bubbleSort_emptyArray_emptyArray(){
        int[] actual = {};
        int[] expected = {};

        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort_1ItemArray_noArrayChanges(){
        int[] actual = {1};
        int[] expected = {1};

        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort_sortedArray_noArrayChanges(){
        int[] actual = {1,10};
        int[] expected = {1,10};

        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort_unsortedArray_sortedArray(){
        int[] actual = {8,10,6,7};
        int[] expected = {6,7,8,10};

        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}