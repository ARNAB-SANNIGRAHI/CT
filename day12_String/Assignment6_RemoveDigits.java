package day12_String;

public class Assignment6_RemoveDigits {
	public static void main(String[] args) {
		String s = "a1b2c3";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch < '0' || ch > '9') {
				result += ch;
			}
		}
		System.out.println(result);
	}
}
