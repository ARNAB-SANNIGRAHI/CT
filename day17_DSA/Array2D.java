package day17_DSA;

public class Array2D {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, // 0 ->index
				{ 4, 5, 6 }, // 1 ->index
				{ 7, 8, 9 } // 2 ->index
		};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
