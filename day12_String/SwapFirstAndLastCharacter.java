package day12_String;

public class SwapFirstAndLastCharacter {

	    public static void main(String[] args) {
	        String str = "Hi Java";
	        String result = "";

	        String[] words = str.split(" ");

	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];

	            if (word.length() > 1) {
	                result += word.substring(word.length() - 1)
	                        + word.substring(1, word.length() - 1)
	                        + word.substring(0, 1);
	            } else {
	                result += word;
	            }

	            result += " ";
	        }

	        System.out.println(result.trim());
	    }

}
