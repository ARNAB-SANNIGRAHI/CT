package day12_String;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		s1 = s1.replace(" "," ").toLowerCase();
		s2 = s2.replace(" ", " ").toLowerCase();
				if(s1.length()!= s2.length()) {
					System.out.println("Not Anagram");
					return;
				}
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			System.out.println(Arrays.equals(a1, a2)?"Anagram":"NotAnagram");
		}
	}