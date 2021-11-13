package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem203Test {
    private final Problem203 solution = new Problem203();

    @Test
    public void example1() {
        ListNode list = ListNodes.list(1,2,6,3,4,5,6);
        assert Objects.equals(solution.removeElements(list, 6), ListNodes.list(1,2,3,4,5));
    }

    @Test
    public void example2() {
        ListNode list = ListNodes.list();
        assert Objects.equals(solution.removeElements(list, 1), list);
    }

    @Test
    public void example3() {
        ListNode list = ListNodes.list(7,7,7,7);
        assert Objects.equals(solution.removeElements(list, 7), ListNodes.list());
    }
}
