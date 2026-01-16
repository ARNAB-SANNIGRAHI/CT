package core_java;

import java.util.Arrays;

public class Array_RemoveElementsFromIndex {

    public static int[] RemoveElementsFromIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        array = RemoveElementsFromIndex(array, 2);
        System.out.println(Arrays.toString(array));
    }
}
