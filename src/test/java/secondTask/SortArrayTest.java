package secondTask;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class SortArrayTest {

    @Test
    public void shouldSortArrayWithMultipleDigits() {
        int[] actual = {22, 50, 1, 15, 8, 5, 30};
        new SortArray().mergeSort(actual, 0, actual.length - 1);
        int[] expected = {1, 5, 8, 15, 22, 30, 50};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortArrayWithOneDigit() {
        int[] actual = {1};
        new SortArray().mergeSort(actual, 0, actual.length - 1);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowsNPE() {
        int[] actual = null;
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class,
                () -> new SortArray().mergeSort(actual, 0, actual.length - 1));
        assertEquals("Cannot read the array length because \"actual\" is null", exception.getMessage());
    }
}