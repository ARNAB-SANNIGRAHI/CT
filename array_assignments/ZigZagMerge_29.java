package array_assignments;

public class ZigZagMerge_29 {
	static void mergeZigzag(int[] a, int[] b) {
		int n = a.length + b.length;
		int[] merged = new int[n];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			merged[k++] = a[i++];
			merged[k++] = b[j++];
		}
		while (i < a.length)
			merged[k++] = a[i++];
		while (j < b.length)
			merged[k++] = b[j++];
		for (int x = 0; x < merged.length; x++) {
			System.out.println(merged[x]);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6, 8 };
		mergeZigzag(arr1, arr2);
	}
}
