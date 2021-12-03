package leetcode;

@Difficulty(Level.HARD)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem25 {
    public ListNode reverseKGroup(final ListNode head, final int k) {
        ListNode current = head;
        int n = k;
        while (--n > 0 && current != null) {
            current = current.next;
        }
        if (current == null) {
            return head;
        }

        n = k;
        ListNode newHead = head;
        while (--n > 0) {
            ListNode prev = newHead;
            newHead = head.next;
            head.next = newHead.next;
            newHead.next = prev;
        }
        head.next = reverseKGroup(head.next, k);
        return newHead;
    }
}
