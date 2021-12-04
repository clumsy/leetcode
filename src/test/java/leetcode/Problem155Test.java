package leetcode;

import org.junit.Test;

public class Problem155Test {
    private final Problem155 solution = new Problem155();
    
    @Test
    public void example1() {
        Problem155.MinStack minStack = solution.new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assert minStack.getMin() == -3;
        minStack.pop();
        assert minStack.top() == 0;
        assert minStack.getMin() == -2;
    }
}
