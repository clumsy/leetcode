package leetcode;

public class Problem720 {
    class TrieNode {
        boolean isTerminal;
        TrieNode[] map = new TrieNode[26];

        public void addWord(String word) {
            TrieNode current = this;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                TrieNode next = current.map[index];
                if (next == null) {
                    current.map[index] = new TrieNode();
                }
                current = current.map[index];
            }
            current.isTerminal = true;
        }
    }

    public String longestWord(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            root.addWord(word);
        }
        return findLongest(root, new StringBuilder());
    }

    private String findLongest(TrieNode root, StringBuilder builder) {
        String longest = "";
        if (root.isTerminal) {
            longest = builder.toString();
        }
        for (int i = 0; i < root.map.length; i++) {
            TrieNode next = root.map[i];
            if (next == null || !next.isTerminal) {
                continue;
            }
            builder.append((char)('a' + i));
            String candidate = findLongest(next, builder);
            builder.setLength(builder.length() - 1);
            if (candidate.length() > longest.length()) {
                longest = candidate;
            }
        }
        return longest;
    }
}
