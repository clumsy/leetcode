package leetcode;

import org.junit.Test;

import java.util.Objects;

import static leetcode.ListNodes.list;

public class Problem19Test {
    private final Problem19 solution = new Problem19();

    @Test
    public void example1() {
        assert solution.removeNthFromEnd(list(1,2,3,4,5), 2).equals(list(1,2,3,5));
    }

    @Test
    public void example2() {
        assert Objects.equals(solution.removeNthFromEnd(list(1), 1), list());
    }

    @Test
    public void example3() {
        assert solution.removeNthFromEnd(list(1,2), 1).equals(list(1));
    }

    @Test
    public void example4() {
        assert solution.removeNthFromEnd(list(1,2), 2).equals(list(2));
    }
}
