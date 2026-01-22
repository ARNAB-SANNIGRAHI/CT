package day13_ExceptionHandling;

public class ExceptionHandling3 {
	public static void main(String[] args) {
		
	String s = null;
	try {
	System.out.println(s.toLowerCase());
	} catch(NullPointerException e) {
		System.out.println("String value should not be null");
	}
}
}