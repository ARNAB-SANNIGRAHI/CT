package day12_String;

public class Frequency {
	public static void main(String[] args) {
		String s = "programming";
		while (s.length() > 0) {
			char ch = s.charAt(0);
			int count = s.length() - s.replace(String.valueOf(ch), "").length();
			System.out.println(ch + " : " + count);
			s = s.replace(String.valueOf(ch), "");
		}
	}

}
