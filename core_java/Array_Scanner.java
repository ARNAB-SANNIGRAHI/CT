package core_java;

import java.util.Scanner;

public class Array_Scanner {

    public static void elements() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }

    public static void main(String[] args) {
        elements();
    }
}
