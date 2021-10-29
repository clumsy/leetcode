package leetcode;

import org.junit.Test;

public class Problem876Test {
    private final Problem876 solution = new Problem876();
    
    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assert solution.middleNode(list) == list.next.next;
    }
    
    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2,3,4,5,6);
        assert solution.middleNode(list) == list.next.next.next;
    }
}
