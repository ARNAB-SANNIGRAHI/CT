package day20_DSASearchingSorting;

import java.util.Arrays;

public class MergeSortedArrays {
public static void main(String[] args) {
	int[] arr1 = {1,2,5,7,9};
	int[] arr2 = {2,3,4,6,8};
	
	System.out.println(Arrays.toString(merge(arr1,arr2)));
}
public static int[] merge(int[] arr1, int[] arr2) {
	int n = arr1.length;
	int m = arr2.length;
	
	int[] arr3 = new int[n+m];
	
	int i=0,j=0,k=0;
	while(i<n && j<m) {
		if(arr1[i]<arr2[j]) {
			arr3[k] = arr1[i];
			i++;
		}else {
			arr3[k]=arr2[j];
			j++;
		}
		k++;
	}
	while(i<m) {
		arr3[k++]=arr1[i++];
		
	}	while(j<n) {
		arr3[k++]=arr2[j++];
		
	}
	return arr3;
}
}
