package day20_DSASearchingSorting;

import java.util.Arrays;

public class DutchFlag {
public static void main(String[] args) {
	int[] arr = {2,2,0,0,0,1,0,1,1};
	int start=0;
	int mid=0;
	int end=arr.length-1;
	
	while(mid<=end) {
		if(arr[mid]==0) {
			int temp=arr[start];
			arr[start] = arr[mid];
			arr[mid]=temp;
			mid++;
			start++;
		} else if(arr[mid]==1) {
			mid++;
		} else {
			int temp=arr[end];
			arr[end]=arr[mid];
			arr[mid]=temp;
			end--;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}