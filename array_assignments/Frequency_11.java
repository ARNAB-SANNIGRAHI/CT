package array_assignments;

public class Frequency_11 {
	static void printFrequency(int[] a) {
		boolean[] visited = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {
			if (visited[i])
				continue;

			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println("Frequency of "+a[i] + " is " + count);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1, 2 };
		printFrequency(arr);
	}
}
