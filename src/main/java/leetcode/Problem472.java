package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem472 {
    class TrieNode {
        boolean isTerminal;
        TrieNode[] nexts = new TrieNode[26];

        void addWord(String word) {
            TrieNode current = this;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                TrieNode next = current.nexts[index];
                if (next == null) {
                    next = new TrieNode();
                    current.nexts[index] = next;
                }
                current = next;
            }
            current.isTerminal = true;
        }
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            root.addWord(word);
        }
        List<String> result = new ArrayList<>(words.length);
        Map<String, Integer> cache = new HashMap<>(words.length);
        for (String word : words) {
            if (isMadeOf(root, word, cache) > 1) {
                result.add(word);
            }
        }
        return result;
    }

    private int isMadeOf(TrieNode root, String word, Map<String, Integer> cache) {
        int cached = cache.getOrDefault(word, -1);
        if (cached >= 0) {
            return cached;
        }
        TrieNode current = root;
        int count = 0;
        for (int i = 0, lastIndex = word.length() - 1; i <= lastIndex; i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            TrieNode next = current.nexts[index];
            if (next == null) {
                cache.put(word, 0);
                return 0;
            }
            if (next.isTerminal) {
                if (i == lastIndex) {
                    count++;
                } else if (isMadeOf(root, word.substring(i + 1), cache) > 0) {
                    cache.put(word, 2);
                    return 2;
                }
            }
            current = next;
        }
        cache.put(word, count);
        return count;
    }
}
