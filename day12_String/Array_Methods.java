package day12_String;
import java.util.Arrays;
public class Array_Methods {
	public static void main(String[] args) {
		char[] ch1 = {'b','a','c'};
		char[] ch2 = {'b','a','c'};
		char[] ch3 = {'b','a','c'};
		Arrays.sort(ch1);// ->sort the array
		System.out.println(Arrays.toString(ch1));//[a, b, c]  ->Converts the array to string
		
		System.out.println(Arrays.equals(ch2, ch3));//true ->compares 2 arrays
		
		System.out.println(Arrays.binarySearch(ch3, 'a'));//1  ->binary searches the character in an array
	}

}
