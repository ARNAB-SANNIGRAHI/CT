package day17_DSA;

public class RemoveElement2DArray {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 4, 5, 6, 7 } };
		int element = 2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == element) {
					arr[i][j] = Integer.MIN_VALUE;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != Integer.MIN_VALUE) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
