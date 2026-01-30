package day18_DSAStack;

public class StringReverse {
	public static void main(String[] args) {
		StringReverse s = new StringReverse();

		System.out.println(s.ReverseString("Hello"));
	}

	public String ReverseString(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			ans = str.charAt(i) + ans;
		}
		return ans;
	}
}
