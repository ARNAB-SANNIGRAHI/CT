package day22_DSAHashing;

public class MinimumWindowSize {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static int minWindow(String s, String t) {
        int[] freq = new int[128];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int start = 0, count = t.length();
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < s.length(); end++) {
            if (freq[s.charAt(end)]-- > 0) {
                count--;
            }

            while (count == 0) {
                minLen = Math.min(minLen, end - start + 1);

                if (++freq[s.charAt(start)] > 0) {
                    count++;
                }
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
