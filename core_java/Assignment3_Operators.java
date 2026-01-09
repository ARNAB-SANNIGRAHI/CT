package core_java;

public class Assignment3_Operators {

	    public static void main(String[] args) {

	        int a = 10;
	        int b = 5;

	        //Arithmetic Operators
	        System.out.println("Arithmetic Operators:");
	        System.out.println("Addition: " + (a + b));      
	        System.out.println("Multiplication: " + (a * b));
	        System.out.println("Modulus: " + (a % b));

	        //Assignment Operators
	        int x = 20;
	        System.out.println("\nAssignment Operators:");
	        x += 5;   // x = x + 5
	        System.out.println("x += 5 -> " + x);

	        x -= 3;   // x = x - 3
	        System.out.println("x -= 3 -> " + x);

	        x *= 2;   // x = x * 2
	        System.out.println("x *= 2 -> " + x);

	        //Relational Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a <= b: " + (a <= b));

	        //Logical Operators
	        boolean p = true;
	        boolean q = false;

	        System.out.println("\nLogical Operators:");
	        System.out.println("p && q: " + (p && q)); // AND
	        System.out.println("p || q: " + (p || q)); // OR
	        System.out.println("!p: " + (!p));         // NOT
	   }

}
