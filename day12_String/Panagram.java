package day12_String;

public class Panagram {
public static void main(String[] args) {
	String s = "The quick brown fox jumps over the lazy dog";
	s = s.toLowerCase();
	
	boolean isPanagram = true;
	for(char ch ='a';ch<='z';ch++) {
		if(!s.contains(String.valueOf(ch))) {
			isPanagram = false;
			break;
		}
	}
	System.out.println(isPanagram?"Panagram":"Not Panagram");
}
}
