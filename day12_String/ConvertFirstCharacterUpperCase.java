//Create a program to convert every first character of a word of a sentence to upperCase.
package day12_String;

public class ConvertFirstCharacterUpperCase {
	public static void main(String[] args) {

		String str = "this is java language";
		String res = str.substring(0, 1).toUpperCase();
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == ' ') {
				res += String.valueOf(str.charAt(i)).toUpperCase();
			} else {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}
}