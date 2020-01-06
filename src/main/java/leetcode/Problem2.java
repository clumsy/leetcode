package leetcode;

public class Problem2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, value = l1.val + l2.val;
        if (value > 9) {
            carry = value / 10;
            value %= 10;
        }
        ListNode result = new ListNode(value), current = result;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            value = carry;
            if (l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }
            if (value > 9) {
                carry = value / 10;
                value %= 10;
            } else {
                carry = 0;
            }
            ListNode next = new ListNode(value);
            current.next = next;
            current = next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result;
    }
}
