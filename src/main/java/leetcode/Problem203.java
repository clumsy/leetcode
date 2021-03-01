package leetcode;

public class Problem203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        ListNode current = newHead;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return newHead.next;
    }
}
