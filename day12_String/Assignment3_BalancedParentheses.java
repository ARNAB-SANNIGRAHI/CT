package day12_String;

public class Assignment3_BalancedParentheses {
	public static void main(String[] args) {
		String s = "({[]})";
		boolean balanced = true;
		while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
			s = s.replace("()", "").replace("{}", "").replace("[]", "");
		}
		if (!s.isEmpty()) {
			balanced = false;
		}
		System.out.println(balanced ? "Balanced" : "Not Balanced");
	}
}