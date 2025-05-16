package huffmancoding.algorithm;

import java.util.PriorityQueue;
import java.util.Comparator;

class HuffmanNode {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

public class HMain {

    static int totalBitsUsed = 0;

    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            int freq = root.data;
            int bitsPerChar = s.length();
            int totalBits = freq * bitsPerChar;
            totalBitsUsed += totalBits;

            System.out.println("Character: " + root.c + 
                               " | Freq: " + freq + 
                               " | Code: " + s + 
                               " | Bits Used: " + totalBits);
            return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        int n = 6;
        char[] charArray = { 'z', 'u', 'c', 'm', 'a', 'e' };
        int[] charfreq = { 8, 44, 53, 60, 100, 153 };

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {
            HuffmanNode x = q.poll();
            HuffmanNode y = q.poll();

            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;

            root = f;
            q.add(f);
        }

        System.out.println("Huffman Codes and Bits Used:\n");
        printCode(root, "");

        // Total frequency count
        int totalFrequency = 0;
        for (int freq : charfreq) {
            totalFrequency += freq;
        }

        // Fixed-length encoding bits (log2(n) rounded up)
        int fixedBitsPerChar = (int) Math.ceil(Math.log(n) / Math.log(2));
        int fixedTotalBits = totalFrequency * fixedBitsPerChar;

        System.out.println("\nTotal Bits using Huffman Coding: " + totalBitsUsed);
        System.out.println("Total Bits using Fixed-Length Encoding (" + fixedBitsPerChar + " bits/char): " + fixedTotalBits);
        System.out.println("Bits Saved: " + (fixedTotalBits - totalBitsUsed));
    }
}
