package day22_DSAHashing;

import java.util.HashSet;

public class FirstRepeatingElement {
	public static void main(String[] args) {
		String content = "abdjccklbjckl";
		System.out.println(getCharacter(content));

	}

	public static char getCharacter(String string) {
		HashSet<Character> index = new HashSet<>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (index.contains(ch)) {
				return ch;
			}
			index.add(ch);
		}
		return (char) -1;
	}
}