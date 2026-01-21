//Convert string uppercase to lowercase and vice versa(the numbers should remain same)
package day12_String;
public class CaseConversion {
	public static void main(String[] args) {
		String s = "ABC123abc";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				res += (char)(ch+32);
			}
			else if(ch>='a' && ch<='z') {
				res += (char)(ch-32);
			} else {
				res += ch;
		}
	}
			System.out.println(res);
}
}
