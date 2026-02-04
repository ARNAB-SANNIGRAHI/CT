package day22_DSAHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
public static void main(String[] args) {
	int[] arr = {100,4,200,1,3,2,5,6};//1234->4
	System.out.println(longestConsecutive(arr));
}
public static int longestConsecutive(int[] arr) {
	Set<Integer> set = new HashSet<>();
	int globalCount=0;
	for(int element:arr) {
		set.add(element);
	}
	for(int number:set) {
		if(!set.contains(number-1)) {
			int currentNum = number;
			int count = 1;
			
			while(set.contains(currentNum+1)) {
				currentNum++;
				count++;
			}
			globalCount = Math.max(globalCount, count);
		}
	}
	return globalCount;
}
}
