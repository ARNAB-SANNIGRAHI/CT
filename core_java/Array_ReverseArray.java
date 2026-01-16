package core_java;

import java.util.Scanner;

public class Array_ReverseArray {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void displayReversedArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }

    public static void main(String[] args) {
        displayReversedArray();
    }
}
