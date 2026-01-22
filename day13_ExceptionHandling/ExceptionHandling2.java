package day13_ExceptionHandling;

public class ExceptionHandling2 {
	public static void main(String[] args) {
	
	String s = "xyz";
	try {
	System.out.println(s.charAt(10));
	} catch(StringIndexOutOfBoundsException e) {
		System.out.println("Index not found");
		
	}
}
}