package array2d_Assignments;

public class ZeroCount_16 {
	static void countZero(int[][] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println("Number of zeros: " + count);
	}

	public static void main(String[] args) {
		int[][] m = { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 0, 1 } };
		countZero(m);
	}
}
