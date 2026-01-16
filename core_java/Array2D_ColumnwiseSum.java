package core_java;

import java.util.Arrays;

public class Array2D_ColumnwiseSum {

    public static int[] columnwiseSum(int[][] arr) {
        int cols = arr[0].length;
        int[] sumArr = new int[cols];
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) sum += arr[i][j];
            sumArr[j] = sum;
        }
        return sumArr;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] colSumArray = columnwiseSum(array);
        System.out.println(Arrays.toString(colSumArray));
    }
}
