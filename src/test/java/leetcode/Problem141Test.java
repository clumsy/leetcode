package leetcode;

import org.junit.Test;

public class Problem141Test {
    private final Problem141 solution = new Problem141();
    
    @Test
    public void example1() {
        ListNode head = ListNodes.list(3,2,0,-4);
        head.next.next.next.next = head.next;
        assert solution.hasCycle(head);
    }
    
    @Test
    public void example2() {
        ListNode head = ListNodes.list(1,2);
        head.next.next = head;
        assert solution.hasCycle(head);
    }
    
    @Test
    public void example3() {
        ListNode head = ListNodes.list(1);
        assert !solution.hasCycle(head);
    }
}
