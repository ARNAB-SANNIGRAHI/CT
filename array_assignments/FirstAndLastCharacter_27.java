package array_assignments;

public class FirstAndLastCharacter_27 {
	static void printFirstAndLast(int[] a) {
		if (a.length > 0) {
			System.out.println("First element: " + a[0]);
			System.out.println("LastElement: " + a[a.length - 1]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printFirstAndLast(arr);
	}
}