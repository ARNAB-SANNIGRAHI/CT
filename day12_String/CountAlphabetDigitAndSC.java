package day12_String;

public class CountAlphabetDigitAndSC {

		public static void main(String[] args) {
			int alphabet = 0;
			int digit=0;
			int specialCharacter=0;
			String s = "ABC123456qwerpo";
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
					alphabet++;
				} else if(ch>='0' && ch<='9') {
					digit++;
				} else {
					specialCharacter++;
				}
			}
			System.out.println("Number of alphabets: " +alphabet);
			System.out.println("Number of Digits: "+digit);
			System.out.println("Number of Special Cahracter: "+specialCharacter);
		}
}
