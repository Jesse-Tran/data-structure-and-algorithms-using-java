package blinkk.learnprogramming.sortalgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {23, 1, 55, -5, 0, 77, -99};
        System.out.println("Original Array: " + Arrays.toString(intArray));

        ShellSort(intArray);

        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void ShellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newElement;
            }
        }
    }

    public static void InsertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }
    }

    public static void SelectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int maxIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }

            swap(array, maxIndex, lastUnsortedIndex);
        }
    }

    public static void BubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
