package leetcode;

import org.junit.Test;

public class Problem142Test {
    private final Problem142 solution = new Problem142();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(3,2,0,-4);
        list.next.next.next.next = list.next;
        assert solution.detectCycle(list) == list.next;
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2);
        list.next.next = list;
        assert solution.detectCycle(list) == list;
    }
    
    @Test
    public void example3() {
        ListNode list = ListNodes.list(1);
        assert solution.detectCycle(list) == null;
    }
}
