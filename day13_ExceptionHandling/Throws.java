package day13_ExceptionHandling;

public class Throws {
public static void main(String[] args) throws ClassNotFoundException, ArithmeticException {
	System.out.println("hi");		//throws declares the Exception if any exception occurs 
	Class.forName("array.Student");	//throws is used to skip try catch block
	System.out.println("bye");		//throws is used to declare the exception in method declaration
}
}
