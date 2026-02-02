package dsa_DAY2_Assignment;

	import java.util.Queue;
	import java.util.LinkedList;

	public class FirstNonRepeatingChar {

	    public static void printFirstNonRepeating(String stream) {
	        int[] freq = new int[26];
	        Queue<Character> queue = new LinkedList<>();

	        for (int i = 0; i < stream.length(); i++) {
	            char ch = stream.charAt(i);


	            freq[ch - 'a']++;


	            queue.add(ch);

	            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
	                queue.poll();
	            }

	            if (queue.isEmpty()) {
	                System.out.print("-1 ");
	            } else {
	                System.out.print(queue.peek() + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String stream = "aabc";
	        printFirstNonRepeating(stream);
	    }
	}

