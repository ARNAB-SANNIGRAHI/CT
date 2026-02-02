package dsa_DAY3_Assignment;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int[] arr = {10,30,21,45,50,11};
	int n = arr.length;
	for(int i=0;i<n;i++) {
		int key = arr[i];
		int j = i-1;
		
		while(j>=0 && arr[j] > key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	System.out.println(Arrays.toString(arr));
}
}
//Time Complexity
//Best case: O(n) (already sorted)
//Average case: O(n²)
//Worst case: O(n²)





//Insertion Sort is better than Bubble & Selection Sort when:
//Array is nearly sorted
//Array size is small
//Sorting is required online (data comes gradually)