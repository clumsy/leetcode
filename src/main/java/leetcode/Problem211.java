package leetcode;

@BeatsPercent(34.78)
@DataStructures(DataStructure.TRIE)
@SpaceComplexity(Complexity.N_BY_M) // where N is the length of the word, M is the number of words
public class Problem211 {
    private static final int MAX = 50000;
    
    class WordDictionary {
        private final int[][] next = new int[MAX][26];
        private final boolean[] terminal = new boolean[MAX];
        private int size = 0;

        /**
         * Initialize your data structure here.
         */
        public WordDictionary() {

        }

        @TimeComplexity(Complexity.LINEAR_N)
        public void addWord(String word) {
            char[] s = word.toCharArray();
            int current = 0;
            for (char c : s) {
                int i = c - 'a';
                if (next[current][i] == 0) {
                    next[current][i] = ++size;
                }
                current = next[current][i];
            }
            terminal[current] = true;
        }

        @TimeComplexity // 26^N
        public boolean search(String word) {
            return doSearch(word.toCharArray(), 0, 0);
        }

        private boolean doSearch(char[] s, int pos, int current) {
            if (pos == s.length) {
                return terminal[current];
            }
            for (int i = pos; i < s.length; i++) {
                if (s[i] == '.') {
                    for (int j : next[current]) {
                        if (j != 0 && doSearch(s, i + 1, j)) {
                            return true;
                        }
                    }
                    return false;
                }
                current = next[current][s[i] - 'a'];
                if (current == 0) {
                    return false;
                }
            }
            return terminal[current];
        }
    }
}
