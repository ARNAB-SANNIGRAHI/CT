package day12_String;

public class String_InbuiltMethods {
	public static void main(String[] args) {

	}

	public static void StripLeadingAndStripTrailing() {
		String s = "   hi hi hi students   ";

		System.out.println(s.stripLeading());// "hi hi hi students " ->removes the starting space
		System.err.println(s.stripTrailing());// " hi hi hi students" ->removes the ending space

	}

	public static void ReplaceAndReplaceFirst() {
		String s = "hi hi hi students";

		System.out.println(s.replace("hi", "bye"));// bye bye bye students ->replace all words
		System.out.println(s.replaceFirst("hi", "bye"));// bye hi hi students ->replace the first word only
	}

	public static void IsEmptyAndIsBlank() {
		String s1 = "";

		System.out.println(s1.isEmpty());// true ->Length should be 0(no space)

		String s2 = "    ";

		System.out.println(s2.isBlank());// true
	}

	public static void ValueOf() {
		int a = 100;
		String s = null;
		s = s.valueOf(a);
		System.out.println(s);// 100 ->Converts integer to String
	}

	public static void EndsWith() {
		String s = "helloworld";

		System.out.println(s.endsWith("world"));// true
		System.out.println(s.endsWith("hello"));// false
		System.out.println(s.endsWith("rld"));// true
	}

	public static void StartWith() {
		String s = "helloworld";

		System.out.println(s.startsWith("hello"));// true
		System.out.println(s.startsWith("he"));// true
		System.out.println(s.startsWith("world"));// false
	}

	public static void EqualIgnoreCase() {
		String s1 = "JAVA";
		String s2 = "java";

		System.out.println(s1.equalsIgnoreCase(s2));// true ->ignores uppercase or lowercase
		System.out.println(s1.equals(s2));// false ->checks uppercase or lowercase also
	}

	public static void Split() {
		String s2 = "hi,bye,java";

		String[] str = s2.split(",");// return type string[] array
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

	public static void Contains() {
		String s = "I love java";

		System.out.println(s.contains("love"));// true
		System.out.println(s.contains("java"));// true
		System.out.println(s.contains("python"));// false

	}

	public static void LastIndexOf() {
		String s = "abcde";// a-0,b-1,c-2,d-3,e-4

		System.out.println(s.lastIndexOf('a'));// 0
		System.out.println(s.lastIndexOf('b'));// 1

		String s2 = "Hii java java hi";

		System.out.println(s2.lastIndexOf("java"));// 9
		System.out.println(s2.lastIndexOf("java", 5));// 4

	}

	public static void IndexOf() {
		String s = "abcde";// a-0,b-1,c-2,d-3,e-4

		System.out.println(s.indexOf('b'));// 1
		System.out.println(s.indexOf('c'));// 2
		System.out.println(s.indexOf('b', 3));// -1
		System.out.println(s.indexOf('z'));// -1
	}

	public static void SubString() {
		String s = "abcde";// a-0,b-1,c-2,d-3,e-4

		System.out.println(s.substring(1));// bcde
		System.out.println(s.substring(2));// cde
		System.out.println(s.substring(1, 4));// bcd
		System.out.println(s);// abcde

	}

	public static void StringToCharacterAndViceVersa() {
		String s = "abcde";

		// String -> char[]
		char[] c = s.toCharArray();// method
		for (int i = 0; i < c.length; i++) {
			System.out.println(c);
		}

		// char[] ->String
		String st = new String(c);// constructor
		System.out.println(st);
	}

	public static void UpperCaseAndLowerCaseMethod() {
		String a = "abc";
		String b = "XYZ";

		String upper = a.toUpperCase();

		System.out.println(upper);// ABC
		System.out.println(b.toLowerCase());// xyz
	}

	public static void charAtMethod() {
		String s1 = "abc";

		char c = s1.charAt(0);

		System.out.println(c);// a
		System.out.println(s1.charAt(1));// b
		System.out.println(s1.charAt(2));// c
	}

	public static void lengthMethod() {
		String s1 = "xyz";
		String s2 = "abc";

		int l = s1.length();

		System.out.println(l);// 3
		System.out.println(s2.length());// 3
	}

	public static void trim() {
		String s = "   abc xyz   ";

		s = s.trim();

		System.out.println(s);// "abc xyz"
	}
}