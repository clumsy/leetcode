package leetcode;

class TrieNode<T> {
    TrieNode<T>[] next;
    T val;
    TrieNode() {
        this(null);
    }
    TrieNode(T val) {
        this.next = new TrieNode[26];
        this.val = val;
    }
}
