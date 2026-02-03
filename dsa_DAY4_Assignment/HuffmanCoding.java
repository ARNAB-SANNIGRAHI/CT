package dsa_DAY4_Assignment;

import java.util.*;

class HuffmanNode {
    int freq;
    char ch;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

public class HuffmanCoding {

    public static void printCodes(HuffmanNode root, String code) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + code);
        }

        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freq = {5, 9, 12, 13, 16, 45};

        PriorityQueue<HuffmanNode> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));

        for (int i = 0; i < chars.length; i++) {
            pq.add(new HuffmanNode(chars[i], freq[i]));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode merged =
                    new HuffmanNode('-', left.freq + right.freq);
            merged.left = left;
            merged.right = right;

            pq.add(merged);
        }

        System.out.println("Huffman Codes:");
        printCodes(pq.peek(), "");
    }
}

