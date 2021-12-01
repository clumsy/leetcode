package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem2Test {
    private final Problem2 solution = new Problem2();

    @Test
    public void example1() {
        ListNode l1 = ListNodes.list(2, 4, 3);
        ListNode l2 = ListNodes.list(5, 6, 4);
        assert Objects.equals(solution.addTwoNumbers(l1, l2), ListNodes.list(7, 0, 8));
    }
}
