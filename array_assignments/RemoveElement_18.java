package array_assignments;

public class RemoveElement_18 {
	static void removeAtIndex(int[] a, int index) {
		int[] b = new int[a.length - 1];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (i != index) {
				b[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		removeAtIndex(arr, 2);
	}
}
