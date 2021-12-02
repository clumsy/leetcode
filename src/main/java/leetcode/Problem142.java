package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N, best = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT, best = Complexity.CONSTANT)
public class Problem142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
