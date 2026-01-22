package day13_ExceptionHandling;

public class WrapperClass {
	public static void main(String[] args) {

		int n = 10;
		Integer i1 = n;// auto boxing
		int n2 = i1;// auto unboxing

		Integer i2=80;// auto boxing
		
		Character c1 = 'A';
		System.out.println(i2);
		System.out.println(c1);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer i = Integer.valueOf("123"); //String ->Wrapper Class Type
		System.out.println(i+1);
		
		Boolean b1 = Boolean.valueOf("true");//Boolean ->Wrapper class type
		System.out.println(b1);				//If not boolean value it will give false
		
		int a = Integer.parseInt("123");//String -> int
		long b = Long.parseLong("567"); // String -> long
		String s = Integer.toString(123);// Integer-> String
		
		//  int c = Integer.parseInt("1A2"); //NumberFormatException(Trying to convert character to integer which is not possible)
		
	}
}