package array2d_Assignments;

public class LargestAndSmallest2D_1 {
	static void LargestSmallest(int[][] a) {
		int largest = a[0][0];
		int smallest = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest)
					largest = a[i][j];
				if (a[i][j] < smallest)
					smallest = a[i][j];
			}
		}
		System.out.println("Largest:" + largest);
		System.out.println("Smallest:" + smallest);
	}

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		LargestSmallest(arr);
	}
}
