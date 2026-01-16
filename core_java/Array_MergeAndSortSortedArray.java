package core_java;

import java.util.Arrays;

public class Array_MergeAndSortSortedArray {

    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        Arrays.sort(merged);

        return merged;
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Predefined sorted arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] mergedSortedArray = mergeAndSort(array1, array2);

        System.out.println("Merged and Sorted Array:");
        displayArray(mergedSortedArray);
    }
}
