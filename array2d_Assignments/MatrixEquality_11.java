package array2d_Assignments;

public class MatrixEquality_11 {
	static void checkEqual(int[][] a, int[][] b) {
		boolean equal = true;
		if (a.length != b.length || a[0].length != b[0].length) {
			equal = false;
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] != b[i][j]) {
						equal = false;
					}
				}
			}
		}
		if (equal)
			System.out.println("Matrices are equal");
		else
			System.out.println("Matrices are not equal");
	}

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		checkEqual(m1, m2);
	}
}
