package day12_String;

public class Assignment2_Isogram {
public static void main(String[] args) {
	String s = "machine";
	s = s.toLowerCase();
	
	boolean isIsogram = true;
	for(int i=0;i<s.length();i++) {
		if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
		
		isIsogram = false;
		break;
	}
}
if(isIsogram) {
	System.out.println("Isogram");
} else {
	System.out.println("Not Isogram");
}
}}