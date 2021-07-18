package leetcode;

import leetcode.Problem1670.FrontMiddleBackQueue;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1670Test {
    private final Problem1670 solution = new Problem1670();
    
    @Test
    public void example1() {
        FrontMiddleBackQueue queue = solution.new FrontMiddleBackQueue();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        assertThat(queue.popFront(), is(1));
        assertThat(queue.popMiddle(), is(3));
        assertThat(queue.popMiddle(), is(4));
        assertThat(queue.popBack(), is(2));
        assertThat(queue.popFront(), is(-1));
    }
    
    @Test
    public void example2() {
        FrontMiddleBackQueue queue = solution.new FrontMiddleBackQueue();
        queue.pushMiddle(493299);
        assertThat(queue.popMiddle(), is(493299));
        queue.pushMiddle(75427);
        assertThat(queue.popMiddle(), is(75427));
        queue.pushFront(753523);
        queue.pushMiddle(677444);
        queue.pushMiddle(431158);
        assertThat(queue.popMiddle(), is(431158));
        assertThat(queue.popMiddle(), is(677444));
        queue.pushBack(47949);
        assertThat(queue.popMiddle(), is(753523));
    }
}
