package day12_String;

public class Assignment1_CommonCharacter {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "grape";
		while (s1.length() > 0) {
			char ch = s1.charAt(0);
			if (s2.contains(String.valueOf(ch))) {
				System.out.print(ch + " ");
			}
			s1 = s1.replace(String.valueOf(ch), "");
		}
	}
}
