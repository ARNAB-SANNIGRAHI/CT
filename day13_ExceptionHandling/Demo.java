package day13_ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("hi");
		// System.out.println(5/0); -> ArithmeticException

		// String s = "xyz";
		// System.out.println(s.charAt(10)); -> StringIndexOutOfBoundsException

		// String s = null;
		// System.out.println(s.toLowerCase()); -> StringIndexOutOfBoundsException

		// try{
		// Thread.sleep(3000); // ->Checked Exception(InterruptedException)
		// } catch(InterruptedException e) {
		// System.out.println("sleep method called");
		// }

		// try {
		// Class.forName("array.Student"); // ->Checked
		// Exception(ClassNotFoundException)
		// }catch(ClassNotFoundException e) {
		// System.out.println("class info is wrong");
		// }

		// try {
		// System.out.println(7/7);
		// Class.forName("array.Student"); //->Multiple Exception Handling
		// } catch(ClassNotFoundException e) {
		// System.out.println("Class info is wrong");
		// } catch(ArithmeticException e) {
		// System.out.println("Dividing by zero");
		// } catch(Exception e) {
		// System.out.println("Something went wrong");
		// }

		System.out.println("bye");
	}
}
