package array_assignments;

public class PairSum_30 {
	static void printPairs(int[] a, int target) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println(a[i] + ", " + a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int target = 7;
		printPairs(arr, target);
	}
}
