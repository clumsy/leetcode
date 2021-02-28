package leetcode;

@Beats100Percent
public class Problem86 {
    public ListNode partition(ListNode head, int x) {
        ListNode lessThanHead = new ListNode(x - 1);
        ListNode lessThan = lessThanHead;
        ListNode greaterThanOrEqualHead = new ListNode(x);
        ListNode greaterThanOrEqual = greaterThanOrEqualHead;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            if (current.val < x) {
                lessThan.next = current;
                lessThan = current;
            } else {
                greaterThanOrEqual.next = current;
                greaterThanOrEqual = current;
            }
            current.next = null;
            current = next;
        }
        lessThan.next = greaterThanOrEqualHead.next;
        return lessThanHead.next;
    }
}
