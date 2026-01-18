package array_assignments;

public class DuplicateElements_12 {
	static void printDuplicates(int[] a) {
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
			if (count > 1) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 3, 2, 5, 6, 2 };
		printDuplicates(arr);
	}
}
