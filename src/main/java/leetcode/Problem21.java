package leetcode;

import java.util.StringJoiner;

public class Problem21 {
    static class ListNode {
        int val;
        ListNode next;
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode current = null;
        while (l1 != null) {
            ListNode next;
            if (l2 == null || l1.val <= l2.val) {
                next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                next = new ListNode(l2.val);
                l2 = l2.next;
            }
            if (root == null) {
                root = next;
                current = root;
            } else {
                current.next = next;
                current = current.next;
            }
        }
        while (l2 != null) {
            ListNode next = new ListNode(l2.val);
            if (root == null) {
                root = next;
                current = root;
            } else {
                current.next = next;
                current = current.next;
            }
            l2 = l2.next;
        }
        return root;
    }
}
