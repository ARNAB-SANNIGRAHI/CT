package array2d_Assignments;

public class MultiplyMatrix_3 {
	static void multiplyMatrices(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] m2 = { { 7, 8 }, { 9, 1 }, { 2, 3 } };

		multiplyMatrices(m1, m2);
	}
}
