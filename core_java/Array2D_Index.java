package core_java;

import java.util.Scanner;

public class Array2D_Index {

    public static int[][] input2DArray(int rows, int cols, Scanner sc) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }


    public static void printEvenIndices(int[][] arr) {
        System.out.println("Indices of even elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println("Element " + arr[i][j] + " at index [" + i + "][" + j + "]");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        System.out.println("Enter elements of the 2D array:");
        int[][] array = input2DArray(rows, cols, sc);

        printEvenIndices(array);

        sc.close();
    }
}
