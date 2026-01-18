package array2d_Assignments;

public class AddMatrix_2 {
	static void addMatrices(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
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

		int[][] m2 = { { 7, 8, 9 }, { 1, 2, 3 } };

		addMatrices(m1, m2);
	}
}
