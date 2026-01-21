package day12_String;

public class Demo2 {
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = "abc";
		String s3 = "xyz";
		String s4 = new String("xyz");
		String s5 = new String("abc");
		String s6 = "abc";

		System.out.println(s1.equals(s3)); // true (because contents are same)
		System.out.println(s1 == s3); // false (because address is different(content is same))
		System.out.println(s4.equals(s5)); // false (because contents are different)
		System.out.println(s4 == s5); // false (because contents are different)
		System.out.println(s1.equals(s4));// true (contents are same and both are stored in heap area)
		System.out.println(s1 == s4); // false (address are different)
		System.out.println(s2.equals(s6));// true (address and content both are same)
		System.out.println(s2 == s6);// true (address and content both are same)
	}
}
