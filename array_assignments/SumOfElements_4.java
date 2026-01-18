package array_assignments;

public class SumOfElements_4 {
	static void printSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		printSum(arr);
	}
}
