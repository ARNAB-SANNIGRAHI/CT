package day12_String;

public class Reverse_String {
	public static void main(String[] args) {
		String s = "I am a student";
		String[] word = s.split(" ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
	}
}