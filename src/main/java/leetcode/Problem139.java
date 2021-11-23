package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TRIE)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem139 {
    private class TrieNode {
        TrieNode[] next = new TrieNode[26];
        boolean terminal;

        private TrieNode add(String word) {
            TrieNode current = this;
            for (char c : word.toCharArray()) {
                if (current.next[c - 'a'] == null) {
                    current.next[c - 'a'] = new TrieNode();
                }
                current = current.next[c - 'a'];
            }
            current.terminal = true;
            return this;
        }
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        TrieNode trie = new TrieNode();
        for (String word : wordDict) {
            trie.add(word);
        }
        return wordBreak(s.toCharArray(), 0, trie, new HashMap<>());
    }

    private boolean wordBreak(char[] s, int start, TrieNode trie, Map<Integer, Boolean> cache) {
        if (start == s.length) {
            return true;
        }
        Boolean cached = cache.get(start);
        if (cached != null) {
            return cached;
        }
        TrieNode current = trie;
        for (int i = start; i < s.length; i++) {
            current = current.next[s[i] - 'a'];
            if (current == null) {
                cache.put(start, false);
                return false;
            }
            if (current.terminal && wordBreak(s, i + 1, trie, cache)) {
                cache.put(start, true);
                return true;
            }
        }
        cache.put(start, false);
        return false;
    }
}
