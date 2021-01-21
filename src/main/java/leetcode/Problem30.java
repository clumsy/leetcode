package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem30 {
    private static final class TrieNode {
        private int countWordEnds = 0;
        private final TrieNode[] map = new TrieNode[26];

        public void addWord(final String word) {
            TrieNode current = this;
            for (int i = 0, length = word.length(); i < length; i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                TrieNode next = current.map[index];
                if (next == null) {
                    next = new TrieNode();
                    current.map[index] = next;
                }
                current = next;
            }
            current.countWordEnds++;
        }
    }

    public List<Integer> findSubstring(String s, String[] words) {
        int wordCount = words.length;
        int wordLength = words[0].length();
        int wordsLength = wordCount*wordLength;
        TrieNode trie = buildTrie(words);
        List<Integer> result = new ArrayList<>();
        for (int i = 0, maxOffset = s.length() - wordsLength + 1; i < maxOffset; i++) {
            if (isValid(trie, s, i, i + wordsLength - 1)) {
                result.add(i);
            }
        }
        return result;
    }

    private TrieNode buildTrie(final String[] words) {
        TrieNode root = new TrieNode();
        for (final String word : words) {
            root.addWord(word);
        }
        return root;
    }

    private boolean isValid(final TrieNode root, final String s, int start, int end) {
        if (start > end) {
            return true;
        }
        TrieNode current = root;
        for (int i = start; i <= end; i++) {
            char ch = s.charAt(i);
            current = current.map[ch - 'a'];
            if (current == null) {
                return false;
            }
            if (current.countWordEnds > 0) {
                current.countWordEnds--;
                if (isValid(root, s, i + 1, end)) {
                    current.countWordEnds++;
                    return true;
                }
                current.countWordEnds++;
                return false;
            }
        }
        return false;
    }
}
