package array2d_Assignments;

public class SaddlePoint_15 {
	static void findSaddlePoint(int[][] a) {
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			int minRow = a[i][0];
			int colIndex = 0;

			for (int j = 1; j < a[i].length; j++) {
				if (a[i][j] < minRow) {
					minRow = a[i][j];
					colIndex = j;
				}
			}

			boolean isSaddle = true;
			for (int k = 0; k < a.length; k++) {
				if (a[k][colIndex] > minRow) {
					isSaddle = false;
					break;
				}
			}

			if (isSaddle) {
				System.out.println("Saddle point: " + minRow);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No saddle point found");
		}
	}

	public static void main(String[] args) {
		int[][] m = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };

		findSaddlePoint(m);
	}

}
