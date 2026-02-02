package day20_DSASearchingSorting;

public class WeightFormSort {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6};
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int temp = arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
	for(int i:arr) {
		System.out.print(arr[i]+" ");
	}
}
}
