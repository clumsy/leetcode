package leetcode;

import java.util.List;

public class Problem648 {
    class TrieNode {
        boolean isTerminal;
        TrieNode[] map = new TrieNode[26];

        void addWord(String word) {
            TrieNode current = this;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                TrieNode next = current.map[index];
                if (next == null) {
                    next = new TrieNode();
                    current.map[index] = next;
                }
                current = next;
            }
            current.isTerminal = true;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode roots = new TrieNode();
        for (String word : dictionary) {
            roots.addWord(word);
        }
        StringBuilder result = new StringBuilder();
        for (String word : sentence.split(" ")) {
            result.append(shorten(word, roots));
            result.append(' ');
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }

    private String shorten(String word, TrieNode roots) {
        int end = -1;
        for (int i = 0, length = word.length(); i < length; i++) {
            char ch = word.charAt(i);
            if (roots == null) {
                return word;
            }
            if (roots.isTerminal) {
                end = i;
                break;
            }
            roots = roots.map[ch - 'a'];
        }
        if (end >= 0) {
            return word.substring(0, end);
        }
        return word;
    }
}
