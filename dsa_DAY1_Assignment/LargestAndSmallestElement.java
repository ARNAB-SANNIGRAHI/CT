package dsa_DAY1_Assignment;

public class LargestAndSmallestElement {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 8, 20, 1 };

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println("Smallest: " + min);
		System.out.println("Largest: " + max);
	}

}
