package day13_ExceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println(7/0);
		} catch(NullPointerException e){
			System.out.println("handled");
		} finally {
			System.out.println("finally block");
			//System.out.println(5/0); -> This exception will not be handled and will be executed
			System.out.println("stop");
		}
	}

}
