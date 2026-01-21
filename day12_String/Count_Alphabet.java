//Count number of alphabets in a string
package day12_String;

public class Count_Alphabet {
	public static void main(String[] args) {
		int count = 0;
		String s = "ABC123qwerpo";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				count++;
			}
		}
		System.out.println(count);
	}
}
