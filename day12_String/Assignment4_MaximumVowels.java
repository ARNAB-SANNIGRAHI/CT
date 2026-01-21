package day12_String;

public class Assignment4_MaximumVowels {
public static void main(String[] args) {
	String s = "I love programming";
		String[] w = s.split(" ");
		String maxVowelWord ="";
		int maxVowels = 0;
		for(String word:w) {
			int count = 0;
			for(int i=0;i<word.length();i++) {
				char ch = Character.toLowerCase(word.charAt(i));
				if("aeiou".indexOf(ch) != -1) {
					count++;
				}
			}
			if(count>maxVowels) {
				maxVowels = count;
				maxVowelWord = word;
			}
		}
	System.out.println(maxVowelWord);
}
}
