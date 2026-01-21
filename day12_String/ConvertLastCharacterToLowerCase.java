package day12_String;

public class ConvertLastCharacterToLowerCase {

	public static void main(String[] args) {

		String str = "THIS IS JAVA LANGUAGE";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (i==str.length()-1 || str.charAt(i+1)==' ') {
				res += String.valueOf(str.charAt(i)).toLowerCase();
			} else {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
