package array_assignments;

public class MergrArrays_28 {
static void mergeArrays(int[] a, int[]b) {
	int[] merged = new int[a.length+b.length];
	for(int i=0;i<a.length;i++) {
		merged[i]=a[i];
	}
	for(int i=0;i<b.length;i++) {
		merged[a.length+i]=b[i];
	}
	for(int i=0;i<merged.length;i++) {
		System.out.println(merged[i]);
	}
}
public static void main(String[] args) {
	int[] arr1 = {1,3,5};
	int[] arr2 = {2,4,6};
	mergeArrays(arr1, arr2);
}
}
