package core_java;

import java.util.Scanner;

public class Array_Method {


    public static void printArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }

    public static void main(String[] args) {
        printArray();
    }
}
