package core_java;
import java.util.Scanner;
public class Array_Sum {
	public static void SumOfArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum=0;
		
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Sum of array elements are:"+sum);
		sc.close();
	}
	public static void main(String[] args) {
		SumOfArray();
	}
}
