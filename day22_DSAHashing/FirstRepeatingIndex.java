package day22_DSAHashing;

import java.util.HashSet;

public class FirstRepeatingIndex {
	public static void main(String[] args) {
		String content = "abdjccklbjckl";
		
		System.out.println(getIndex(content));
	}

    public static int getIndex(String str) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (set.contains(ch)) {
                return i;
            }
            set.add(ch);
        }
        return -1;
	}
}

