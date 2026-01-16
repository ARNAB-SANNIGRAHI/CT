package core_java;

import java.util.Scanner;

public class Array_EvenOddSum {

    public static void evenOddSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int evenSum = 0, oddSum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("Sum of Even Elements: " + evenSum);
        System.out.println("Sum of Odd Elements: " + oddSum);

        sc.close();
    }

    public static void main(String[] args) {
        evenOddSum();
    }
}
