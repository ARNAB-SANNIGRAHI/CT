package core_java;

public class Array_BiggestAndSmallest {

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void displayMinMax(int[] arr) {
        int[] result = findMinMax(arr);
        System.out.println("Smallest element: " + result[0]);
        System.out.println("Biggest element: " + result[1]);
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 7, 89, 34, 2, 67};

        displayMinMax(array);
    }
}
