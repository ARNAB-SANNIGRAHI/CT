package day21_DSARecursionDp;

public class PrintElementUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		printElement(arr, 0);
	}
	public static void printElement(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		System.out.println(arr[index]);
		printElement(arr,index+1);
	}
}
