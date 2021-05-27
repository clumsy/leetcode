package leetcode;

@BeatsPercent(100)
public class Problem61 {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode start = head;
        while (start != null) {
            length++;
            start = start.next;
        }
        if (length < 2) {
            return head;
        }
        k %= length;
        if (k == 0) {
            return head;
        }
        ListNode last = head;
        while (k-- > 0) {
            last = last.next;
        }
        ListNode current = head;
        while (last.next != null) {
            current = current.next;
            last = last.next;
        }
        last.next = head;
        ListNode newHead = current.next;
        current.next = null;
        return newHead;
    }
}
