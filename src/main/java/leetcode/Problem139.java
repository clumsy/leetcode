package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@BeatsPercent(100)
public class Problem139 {
    class TrieNode {
        boolean isTerminal;
        TrieNode[] next = new TrieNode[26];
        
        private void addWord(String word) {
            TrieNode trie = this;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                if (trie.next[index] == null) {
                    trie.next[index] = new TrieNode();
                }
                trie = trie.next[index];
            }
            trie.isTerminal = true;
        }
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        TrieNode trie = new TrieNode();
        for (String word : wordDict) {
            trie.addWord(word);
        }
        Map<String, Boolean> cache = new HashMap<>();
        return breaks(s, trie, cache);
    }
    
    private boolean breaks(String s, TrieNode trie, Map<String, Boolean> cache) {
        if (s.isEmpty()) {
            return true;
        }
        Boolean cached = cache.get(s);
        if (cached != null) {
            return cached;
        }
        TrieNode current = trie;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            current = current.next[ch - 'a'];
            if (current == null) {
                cache.put(s, false);
                return false;
            }
            if (current.isTerminal && breaks(s.substring(i + 1), trie, cache)) {
                cache.put(s, true);
                return true;
            }
        }
        cache.put(s, false);
        return false;
    }
}
