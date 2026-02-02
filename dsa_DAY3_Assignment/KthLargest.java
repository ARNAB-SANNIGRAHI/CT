package dsa_DAY3_Assignment;

import java.util.Arrays;

public class KthLargest {
static int kthLargest(int[] arr, int k) {
	Arrays.sort(arr);
	return arr[arr.length-k];
}
public static void main(String[] args) {
	int[] arr = {7,10,4,3,20,15};
	int k=2;
	System.out.println(kthLargest(arr, k));
}
}
