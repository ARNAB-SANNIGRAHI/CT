package core_java;

import java.util.Arrays;

public class Array_RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; 
        int j = 0; 

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, j);
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 4, 5, 3, 2, 5};

        System.out.println("Original Array:");
        displayArray(array);

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates:");
        displayArray(uniqueArray);
    }
}
