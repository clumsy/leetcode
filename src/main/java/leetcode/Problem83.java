package leetcode;

@BeatsPercent(100)
public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}
