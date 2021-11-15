package leetcode;

import leetcode.Problem232.MyQueue;
import org.junit.Test;

public class Problem232Test {
    private final Problem232 solution = new Problem232();
    
    @Test
    public void example1() {
        MyQueue queue = solution.new MyQueue();
        queue.push(1);
        queue.push(2);
        assert queue.peek() == 1;
        assert queue.pop() == 1;
        assert !queue.empty();
    }
}
