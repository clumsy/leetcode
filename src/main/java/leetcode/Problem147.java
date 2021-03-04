package leetcode;

@BeatsPercent(59.27)
public class Problem147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode sorted = new ListNode(0);
        ListNode current = head;
        while (current != null) {
            ListNode cursor = sorted;
            while (cursor.next != null && cursor.next.val < current.val) {
                cursor = cursor.next;
            }
            ListNode next = current.next;
            current.next = cursor.next;
            cursor.next = current;
            current = next;
        }
        return sorted.next;
    }
}
