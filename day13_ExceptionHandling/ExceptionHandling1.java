package day13_ExceptionHandling;

public class ExceptionHandling1 {
public static void main(String[] args) {
	System.out.println("hii");
	try {
		System.out.println(7/0);
	}catch(ArithmeticException e) {
		System.out.println("divided by zero");
	}
	System.out.println("bye");
}
}
