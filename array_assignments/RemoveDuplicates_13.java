package array_assignments;

public class RemoveDuplicates_13 {
	static void printUnique(int[] a) {
		boolean[] visited = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {
			if (visited[i])
				continue;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					visited[j] = true;
				}
			}
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 3, 2, 5, 6, 2 };
		printUnique(arr);
	}
}
