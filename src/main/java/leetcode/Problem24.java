package leetcode;

public class Problem24 {
    public static final class Alternative extends Problem24 {

        @Override
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode point = dummy;
            while (point.next != null && point.next.next != null) {
                ListNode swap1 = point.next;
                ListNode swap2 = point.next.next;
                point.next = swap2;
                swap1.next = swap2.next;
                swap2.next = swap1;
                point = swap1;
            }
            return dummy.next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = head.next;
        if (newHead == null) {
            return head;
        }
        ListNode current = head;
        ListNode adjacent = newHead;
        ListNode previousAdjacent = null;
        ListNode rest = newHead.next;
        while (adjacent != null) {
            current.next = rest;
            adjacent.next = current;
            if (previousAdjacent != null) {
                previousAdjacent.next = adjacent;
            }
            if (rest == null) {
                return newHead;
            }
            previousAdjacent = current;
            current = rest;
            adjacent = current.next;
            if (adjacent != null) {
                rest = adjacent.next;
            }
        }
        return newHead;
    }
}
