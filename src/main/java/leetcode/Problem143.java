package leetcode;

@BeatsPercent(99.81)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode prev = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is in the middle, cut in half
        prev.next = null;

        // reversing second half
        prev = null;
        ListNode next;
        while (slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // slow is at the end of reversed second half
        ListNode start = head;
        ListNode end = prev;
        while (start != null) {
            ListNode start_next = start.next;
            start.next = end;
            if (start_next == null) {
                break;
            }
            ListNode end_next = end.next;
            end.next = start_next;
            start = start_next;
            end = end_next;
        }
    }
}
