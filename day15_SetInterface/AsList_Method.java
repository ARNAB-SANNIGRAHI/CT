package day15_SetInterface;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class AsList_Method {
public static void main(String[] args) {
	String[] arr = {"a","b","c","d","e","d"};
	
	List<String> list = Arrays.asList(arr);
	Set<String> set = new HashSet<String>(list);
	
	System.out.println("List: "+list);
	System.out.println("Set: "+set);
}
}
