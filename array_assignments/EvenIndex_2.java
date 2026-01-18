package array_assignments;

public class EvenIndex_2 {
	static void printEvenIndex(int[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printEvenIndex(arr);
	}

}
