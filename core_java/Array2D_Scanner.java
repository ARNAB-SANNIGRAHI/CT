package core_java;

import java.util.Scanner;

public class Array2D_Scanner {

    public static int[][] input2DArray(int rows, int cols, Scanner sc) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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

        System.out.println("The 2D array is:");
        print2DArray(array);

        sc.close();
    }
}
