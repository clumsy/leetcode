package leetcode;

public class Problem109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int half = length/2;
        current = head;
        ListNode previous = current;
        while (half-- > 0) {
            previous = current;
            current = current.next;
        }
        TreeNode root = new TreeNode(current.val);
        previous.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(current.next);
        return root;
    }
}
