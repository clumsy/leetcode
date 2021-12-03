package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(99.92)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem143 {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null) {
            fast = fast.next;
        }
        ListNode next = slow.next;
        slow.next = null;
        while (next != null) {
            ListNode tmp = next.next;
            next.next = slow;
            slow = next;
            next = tmp;
        }
        slow = head;
        while (slow != null) {
            ListNode tmp1 = slow.next;
            slow.next = fast;
            ListNode tmp2 = fast.next;
            fast.next = tmp1;
            slow = tmp1;
            fast = tmp2;
        }
    }
}
