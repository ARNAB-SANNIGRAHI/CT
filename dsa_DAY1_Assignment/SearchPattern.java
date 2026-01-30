package dsa_DAY1_Assignment;

public class SearchPattern {
	public static void main(String[] args) {
		String str = "Java Programming";
		String pattern = "Java";

		if (str.contains(pattern)) {
			System.out.println("Pattern found");
		} else {
			System.out.println("Pattern not found");
		}
	}
}
