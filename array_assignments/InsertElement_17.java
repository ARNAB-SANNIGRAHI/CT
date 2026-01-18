package array_assignments;

public class InsertElement_17 {
	static void insertAtIndex(int[] a, int index, int element) {
		int[] b = new int[a.length + 1];
		for (int i = 0; i < index; i++) {
			b[i] = a[i];
		}
		b[index] = element;
		for (int i = index; i < a.length; i++) {
			b[i + 1] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		insertAtIndex(arr, 2, 35);
	}
}
