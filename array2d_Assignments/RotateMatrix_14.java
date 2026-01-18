package array2d_Assignments;

public class RotateMatrix_14 {
	static void rotate90(int[][] a) {
		int n = a.length;
		int[][] r = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				r[j][n - 1 - i] = a[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotate90(m);
	}
}
