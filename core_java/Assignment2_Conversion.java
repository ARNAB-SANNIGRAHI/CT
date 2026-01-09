package core_java;

public class Assignment2_Conversion {
	    public static void main(String[] args) {

	        // byte to float (Widening - implicit)
	        byte b = 10;
	        float f = b;
	        System.out.println("Byte to Float: " + f);

	        // float to int (Narrowing - explicit)
	        float f2 = 12.75f;
	        int i = (int)f2;
	        System.out.println("Float to Int: " + i);

	        // char to int (Widening - implicit)
	        char ch = 'A';
	        int i2 = ch;
	        System.out.println("Char to Int: " + i2);

	        // int to char (Narrowing - explicit)
	        int i3 = 66;
	        char ch2 = (char)i3;
	        System.out.println("Int to Char: " + ch2);
	   }

}
