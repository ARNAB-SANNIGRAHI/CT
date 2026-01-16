package core_java;

public class Array_ArrayMerge {

    public static int[] zigzagMerge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            merged[k++] = arr1[i++];
            merged[k++] = arr2[j++];
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] mergedArray = zigzagMerge(array1, array2);

        displayArray(mergedArray);
    }
}
