package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem206Test {
    private final Problem206 solution = new Problem206();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,3,4,5);
        assert Objects.equals(solution.reverseList(list), ListNodes.list(5,4,3,2,1));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list(1,2);
        assert Objects.equals(solution.reverseList(list), ListNodes.list(2,1));
    }

    @Test
    public void example3() {
        ListNode list = ListNodes.list();
        assert Objects.equals(solution.reverseList(list), list);
    }
}
