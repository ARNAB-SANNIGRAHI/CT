package day13_ExceptionHandling;

public class ExceptionHandling4 {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		try {
			System.out.println(a[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index not found");
		}
	}
}
