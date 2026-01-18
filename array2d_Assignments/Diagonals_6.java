package array2d_Assignments;

public class Diagonals_6 {
	static void printMainDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][i] + " ");
		}
		System.out.println();
	}

	static void printSecondaryDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][a.length - 1 - i] + " ");
		}
	}

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Main Diagonal:");
		printMainDiagonal(m);
		System.out.println("Secondary Diagonal");
		printSecondaryDiagonal(m);
	}
}
