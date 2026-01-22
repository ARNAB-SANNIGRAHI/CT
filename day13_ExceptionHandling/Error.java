package day13_ExceptionHandling;

public class Error {
	public static void main(String[] args) {
		String s = "xyz";
		while(true) {
			s=s+s;	//OutOfMemoryError
		}
	}
	public static void m1() {
		System.out.println("hi");
		m1();
	}

}
