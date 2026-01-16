package core_java;

import java.util.Arrays;

public class Array_ReplaceElementsInIndex {

    public static int[] ReplaceElementsInIndex(int[] arr, int ele, int index) {
        if (index < 0 || index >= arr.length) return arr;
        arr[index] = ele;
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        array = ReplaceElementsInIndex(array, 25, 2);
        System.out.println(Arrays.toString(array));
    }
}
