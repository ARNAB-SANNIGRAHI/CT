package core_java;

import java.util.Arrays;

public class Array2D_RowwiseSum {

    public static int[] rowwiseSum(int[][] arr) {
        int[] sumArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) sum += arr[i][j];
            sumArr[i] = sum;
        }
        return sumArr;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] rowSumArray = rowwiseSum(array);
        System.out.println(Arrays.toString(rowSumArray));
    }
}
