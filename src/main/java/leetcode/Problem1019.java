package leetcode;

import java.util.Stack;

@BeatsPercent(97.85)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_K) // max distance for i and nextLarger(i)
public class Problem1019 {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            n++;
        }
        int[] result = new int[n];
        Stack<int[]> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head.next;
        int i = 0;
        while (fast != null) {
            if (fast.val > slow.val) {
                result[i] = fast.val;
            } else {
                stack.push(new int[] {i, slow.val});
            }
            while (!stack.isEmpty() && stack.peek()[1] < fast.val) {
                int[] pair = stack.pop();
                result[pair[0]] = fast.val;
            }
            slow = slow.next;
            fast = fast.next;
            i++;
        }
        return result;
    }
}
