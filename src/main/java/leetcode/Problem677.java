package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem677 {
    static class MapSum {
        private final TrieNode<Integer> root = new TrieNode<>(0);
        private final Map<String, Integer> values = new HashMap<>();

        public void insert(String key, int val) {
            int delta = val - values.getOrDefault(key, 0);
            values.put(key, val);
            TrieNode<Integer> current = root;
            for (char c : key.toCharArray()) {
                int nextChar = c - 'a';
                if (current.next[nextChar] == null) {
                    current.next[nextChar] = new TrieNode<>(0);
                }
                current = current.next[nextChar];
                current.val += delta;
            }
        }

        public int sum(String prefix) {
            TrieNode<Integer> current = root;
            for (char c : prefix.toCharArray()) {
                int nextChar = c - 'a';
                if (current.next[nextChar] == null) {
                    current.next[nextChar] = new TrieNode<>(0);
                }
                current = current.next[nextChar];
            }
            return current.val;
        }
    }
}
