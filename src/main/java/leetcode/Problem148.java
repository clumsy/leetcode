package leetcode;

@BeatsPercent(25.83)
@TimeComplexity(Complexity.LINEARITHMIC_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        int n = 0;
        while (current != null) {
            n++;
            current = current.next;
        }
        ListNode dummy_head = new ListNode();
        dummy_head.next = head;
        for (int size = 1; size < n; size *= 2) {
            ListNode left = dummy_head.next;
            ListNode tail = dummy_head;
            while (left != null) {
                ListNode right = split(left, size);
                ListNode next = split(right, size);
                tail = merge(left, right, tail);
                left = next;
            }
        }
        return dummy_head.next;
    }
    
    private ListNode split(ListNode start, int size) {
        size--; // stopping right before last item
        while (start != null && size > 0) {
            size--;
            start = start.next;
        }
        if (start == null) {
            return null;
        }
        ListNode next = start.next;
        start.next = null;
        return next;
    }

    private ListNode merge(ListNode first, ListNode second, ListNode tail) {
        ListNode current = tail;
        while (first != null || second != null) {
            if (first == null) {
                current.next = second;
                second = second.next;
            } else if (second == null) {
                current.next = first;
                first = first.next;
            } else if (first.val < second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        return current;
    }
}
