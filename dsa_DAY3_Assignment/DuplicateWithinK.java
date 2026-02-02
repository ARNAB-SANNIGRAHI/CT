package dsa_DAY3_Assignment;

import java.util.HashSet;

public class DuplicateWithinK {
public static void main(String[] args) {
	int[] arr = {1,2,3,1,4,5};
	int k=3;
	
	System.out.println(checkDuplicates(arr, k));
	
}
static boolean checkDuplicates(int[] arr, int k) {
	HashSet<Integer> set= new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		if(set.contains(arr[i]))
			return true;
		
		set.add(arr[i]);
		
		if(i>=k)
			set.remove(arr[i-k]);
	}
	return false;
}
}
