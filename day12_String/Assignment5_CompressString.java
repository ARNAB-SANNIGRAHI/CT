package day12_String;

public class Assignment5_CompressString {
public static void main(String[] args) {
	String s = "aaabbccc";
	String compressed="";
	
	int count = 1;
	for(int i=0;i<s.length();i++) {
		if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
			count++;
		} else {
			compressed += s.charAt(i)+String.valueOf(count);
			count=1;
		}
	}
	System.out.println(compressed);
}
}
