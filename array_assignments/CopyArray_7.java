package array_assignments;

public class CopyArray_7 {
	static void printCopyArray(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printCopyArray(arr);
	}
}
