package leetcode;

public class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode current = root;
        while (l1 != null) {
            ListNode next;
            if (l2 == null || l1.val <= l2.val) {
                next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current.next = next;
            current = current.next;
        }
        while (l2 != null) {
            current.next = new ListNode(l2.val);
            current = current.next;
            l2 = l2.next;
        }
        return root.next;
    }
}
