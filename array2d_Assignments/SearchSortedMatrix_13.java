package array2d_Assignments;

public class SearchSortedMatrix_13 {
    static void search(int[][] a, int key) {
        int i = 0;
        int j = a[0].length - 1;

        while (i < a.length && j >= 0) {
            if (a[i][j] == key) {
                System.out.println("Element found at (" + i + ", " + j + ")");
                return;
            } else if (a[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[][] m = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        search(m, 29);
    }
}

