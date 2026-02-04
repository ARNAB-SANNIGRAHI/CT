package day22_DSAHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {
	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "tab", "nat", "bat" };

		Anagram a = new Anagram();
		List<List<String>> lists = a.groupAnagram(words);
		System.out.println(lists);
	}

	public List<List<String>> groupAnagram(String[] string) {
		HashMap<String, List<String>> ans = new HashMap<>();
		for (String word : string) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);

			String keyString = new String(charArray);

			ans.putIfAbsent(keyString, new ArrayList<>());
			ans.get(keyString).add(word);
		}
		return new ArrayList<>(ans.values());
	}
}