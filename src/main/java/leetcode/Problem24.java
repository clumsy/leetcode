package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode tmp = current.next;
            current.next = current.next.next;
            ListNode next = current.next.next;
            current.next.next = tmp;
            tmp.next = next;
            current = tmp;
        }
        return dummy.next;
    }
}
