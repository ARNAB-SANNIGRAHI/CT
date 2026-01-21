package day12_String;

public class Assignment7_PrintSpecialSymbol {
	public static void main(String[] args) {
		String s = "Hello@#2024!";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ')) {
				System.out.print(ch + " ");
			}
		}
	}
}