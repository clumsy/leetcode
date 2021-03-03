package leetcode;

public class Problem92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int length = right - left;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode current = newHead;
        while (current.next != null && --left > 0) {
            current = current.next;
        }
        ListNode oneBeforeLeft = current;
        ListNode leftNode = oneBeforeLeft.next;
        while (leftNode != null && leftNode.next != null && length-- > 0) {
            ListNode previousLeft = oneBeforeLeft.next;
            oneBeforeLeft.next = leftNode.next;
            ListNode newLeft = leftNode.next.next;
            leftNode.next.next = previousLeft;
            leftNode.next = newLeft;
        }
        return newHead.next;
    }
}
