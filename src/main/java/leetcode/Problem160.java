package leetcode;

@Beats100Percent
public class Problem160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != currentB) {
            if (currentA == null) {
                currentA = headB;
            } else {
                currentA = currentA.next;
            }
            if (currentB == null) {
                currentB = headA;
            } else {
                currentB = currentB.next;
            }
        }
        return currentA;
    }
}
