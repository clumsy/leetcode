package leetcode;

public class Problem148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        head = sortList(head);
        slow = sortList(slow);
        return merge(head, slow);
    }

    private ListNode merge(ListNode first, ListNode second) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (first != null || second != null) {
            if (first == null) {
                current.next = second;
                second = second.next;
            } else if (second == null) {
                current.next = first;
                first = first.next;
            } else if (first.val < second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        return head.next;
    }
}
