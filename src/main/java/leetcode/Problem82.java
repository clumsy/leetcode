package leetcode;

@Beats100Percent
public class Problem82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode previous = newHead;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                previous.next = head.next;
            } else {
                previous = previous.next;
            }
            head = head.next;
        }
        return newHead.next;
    }
}
