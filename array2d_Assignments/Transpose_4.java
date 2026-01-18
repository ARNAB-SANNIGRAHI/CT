package array2d_Assignments;

public class Transpose_4 {
	static void transpose(int[][] a) {
		int[][] t = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				t[j][i] = a[i][j];
			}
		}
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };
		transpose(m);
	}
}