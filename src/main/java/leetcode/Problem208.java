package leetcode;

public class Problem208 {
    class Trie {
        private int countWordsEnd = 0;
        private final Trie[] map = new Trie[26];

        /** Initialize your data structure here. */
        public Trie() {

        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie current = this;
            for (int i = 0, length = word.length(); i < length; i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                Trie next = current.map[index];
                if (next == null) {
                    next = new Trie();
                    current.map[index] = next;
                }
                current = next;
            }
            current.countWordsEnd++;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie current = this;
            for (int i = 0, length = word.length(); i < length; i++) {
                char ch = word.charAt(i);
                current = current.map[ch - 'a'];
                if (current == null) {
                    return false;
                }
            }
            return current.countWordsEnd > 0;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Trie current = this;
            for (int i = 0, length = prefix.length(); i < length; i++) {
                char ch = prefix.charAt(i);
                current = current.map[ch - 'a'];
                if (current == null) {
                    return false;
                }
            }
            return true;
        }
    }
}
