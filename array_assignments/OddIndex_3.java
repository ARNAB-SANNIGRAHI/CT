package array_assignments;

public class OddIndex_3 {
	static void printOddIndex(int[] a) {
		for (int i = 1; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printOddIndex(arr);
	}
}
