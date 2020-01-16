package leetcode;

class TrieNode {
    TrieNode[] next;
    String word;
    TrieNode() {
        this.next = new TrieNode[26];
        this.word = null;
    }
}
