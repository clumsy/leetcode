package leetcode;

import org.junit.Test;

public class Problem1381Test {
    private final Problem1381 solution = new Problem1381();
    
    @Test
    public void example1() {
        Problem1381.CustomStack customStack = solution.new CustomStack(3);
        customStack.push(1);
        customStack.push(2);
        assert customStack.pop() == 2;
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        customStack.increment(2, 100);
        assert customStack.pop() == 103;
        assert customStack.pop() == 202;
        assert customStack.pop() == 201;
        assert customStack.pop() == -1;
    }
}
