package array2d_Assignments;

public class IdentityMatrix_5 {
	static void checkIdentity(int[][] a) {
		boolean isIdentity = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j && a[i][j] != 1)
					isIdentity = false;
				if (i != j && a[i][j] != 0)
					isIdentity = false;
			}
		}
		if (isIdentity)
			System.out.println("Identity Matrix");
		else
			System.out.println("Not an Identity Matrix");
	}

	public static void main(String[] args) {
		int[][] m = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		checkIdentity(m);
	}
}
