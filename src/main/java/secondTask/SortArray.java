package secondTask;

import java.util.Random;

public class SortArray {

    public void doAction() {
        int[] array = createAndFillArray();
        int high = array.length - 1;
        mergeSort(array, 0, high);
    }

    public void mergeSort(int[] array, int low, int high) {
        if(array == null) {
            throw new NullPointerException("Cannot read the array length because \"actual\" is null");
        } else if(low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private void merge(int[] subset, int low, int middle, int high) {
        int n = high - low + 1;
        int[] temp = new int[n];
        int i = low;
        int j = middle + 1;
        int k = 0;

        while (i <= middle || j <= high) {
            if (i > middle) {
                temp[k++] = subset[j++];
            } else if (j > high) {
                temp[k++] = subset[i++];
            } else if (subset[i] < subset[j]) {
                temp[k++] = subset[i++];
            } else {
                temp[k++] = subset[j++];
            }
        }
        for (j = 0; j < n; j++) {
            subset[low + j] = temp[j];
        }
    }

    private static int[] createAndFillArray() {
        var random = new Random();
        int[] array = random.ints(50, 0, 100).toArray();
        return array;
    }
}
