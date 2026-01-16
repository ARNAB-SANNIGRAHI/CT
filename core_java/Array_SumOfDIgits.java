package core_java;

import java.util.Scanner;

public class Array_SumOfDIgits {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; 
            n /= 10;        
        }
        return sum;
    }

    public static void updateArrayWithDigitSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sumOfDigits(arr[i]);
        }
    }

    public static void displayUpdatedArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        updateArrayWithDigitSum(arr);

        System.out.println("Array after updating with sum of digits:");
        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }

    public static void main(String[] args) {
        displayUpdatedArray();
    }
}
