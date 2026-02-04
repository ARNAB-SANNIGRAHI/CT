package day22_DSAHashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5, 6, 8, 7, 1 };
		
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		
		System.out.println("-------------------------");
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
