package core_java;

import java.util.Scanner;

public class Array_ReturnEvenElements {

    public static int[] getEvenElements(int[] arr) {

        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evenArr = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[index++] = num;
            }
        }

        return evenArr;
    }

    public static void displayEvenElements() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] evenArray = getEvenElements(arr);

        System.out.println("Even elements are:");
        for (int num : evenArray) {
            System.out.println(num);
        }

        sc.close();
    }

    public static void main(String[] args) {
        displayEvenElements();
    }
}
