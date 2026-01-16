package core_java;

import java.util.Arrays;

public class Array_AddElementsToIndex {

    public static int[] AddElementsToIndex(int[] arr, int ele, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) newArr[i] = arr[i];
        newArr[index] = ele;
        for (int i = index; i < arr.length; i++) newArr[i + 1] = arr[i];
        return newArr;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        array = AddElementsToIndex(array, 25, 2);
        System.out.println(Arrays.toString(array));
    }
}
