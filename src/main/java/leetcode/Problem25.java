package leetcode;

public class Problem25 {
    public ListNode reverseKGroup(final ListNode head, final int k) {
        ListNode current = head;
        int n = k;
        while (--n > 0) {
            if (current == null) {
                return head;
            }
            current = current.next;
        }
        if (current == null) {
            return head;
        }

        n = k;
        ListNode newHead = head;
        while (--n > 0) {
            ListNode tmp = newHead;
            newHead = head.next;
            head.next = newHead.next;
            newHead.next = tmp;
        }
        head.next = reverseKGroup(head.next, k);
        return newHead;
    }
}
