package day17_DSA;

public class ArraySmallest {
public static void main(String[] args) {
	int[] arr = {12,15,41,65,10,25,47,95};
	int min = arr[0];
	for(int i=1;i<arr.length;i++)
		if(min>arr[i]) {
		min = arr[i];
		}
	System.out.println(min);
}
}