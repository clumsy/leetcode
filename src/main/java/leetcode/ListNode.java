package leetcode;

import java.util.StringJoiner;

public class ListNode {
    int val;
    ListNode next;
    ListNode() { }
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        ListNode current = this;
        while (current != null) {
            joiner.add("" + current.val);
            current = current.next;
        }
        return "[" + joiner.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListNode)) {
            return false;
        }
        ListNode start = this;
        ListNode other = (ListNode) obj;
        while (start != null) {
            if (start.val != other.val) {
                return false;
            }
            start = start.next;
            other = other.next;
        }
        return other == null;
    }
}
