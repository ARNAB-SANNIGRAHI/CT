package array2d_Assignments;

public class BoundaryElements_7 {
	static void printBoundary(int[][] a) {
		int r = a.length;
		int c = a[0].length;

		for (int j = 0; j < c; j++) {
			System.out.print(a[0][j] + " ");
		}

		for (int i = 1; i < r; i++) {
			System.out.print(a[i][c - 1] + " ");
		}

		for (int j = c - 2; j >= 0; j--) {
			System.out.print(a[r - 1][j] + " ");
		}

		for (int i = r - 2; i > 0; i--) {
			System.out.print(a[i][0] + " ");
		}
	}

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		printBoundary(m);
	}
}
