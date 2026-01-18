package array_assignments;

public class UniqueElements_14 {
	static void printUnique(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 3, 2, 5, 6, 2, 7 };
		printUnique(arr);
	}
}
