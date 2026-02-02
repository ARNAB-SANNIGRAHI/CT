package day20_DSASearchingSorting;

public class PeakElement {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,8,6,3,0};
	int max = arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println(max);
}
}
