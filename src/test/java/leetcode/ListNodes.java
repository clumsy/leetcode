package leetcode;

public class ListNodes {
    public static ListNode list(Integer... nodes) {
        ListNode root = new ListNode(nodes[0]);
        ListNode current = root;
        for (int i = 1; i < nodes.length; i++) {
            current.next = new ListNode(nodes[i]);
            current = current.next;
        }
        return root;
    }
}
