package day12_String;

public class RemoveDigits {
	public static void main(String[] args) {
		String s = "abc123def45";
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