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
        queue.pushMiddle(493299); // [493299]
        assertThat(queue.popMiddle(), is(493299)); // []
        queue.pushMiddle(75427); // [75427]
        assertThat(queue.popMiddle(), is(75427)); // []
        queue.pushFront(753523); // [753523]
        queue.pushMiddle(677444); // [753523,677444]
        queue.pushMiddle(431158); // [753523,431158,677444]
        assertThat(queue.popMiddle(), is(431158)); // [753523,677444]
        assertThat(queue.popMiddle(), is(677444)); // [753523]
        queue.pushBack(47949); // [753523,47949]
        assertThat(queue.popMiddle(), is(753523)); // [47949]
    }
    
    @Test
    public void example3() {
        FrontMiddleBackQueue queue = solution.new FrontMiddleBackQueue();
        assertThat(queue.popMiddle(), is(-1));
        queue.pushMiddle(5422); // [5422]
        queue.pushMiddle(532228); // [532228,5422]
        assertThat(queue.popBack(), is(5422)); // [532228]
        queue.pushMiddle(206486); // [206486,5422]
        queue.pushBack(351927); // [206486,5422,351927]
        assertThat(queue.popFront(), is(206486)); // 
        assertThat(queue.popFront(), is(532228)); //
        queue.pushMiddle(73577); //
        queue.pushMiddle(785914); //
        queue.pushMiddle(765630); //
        assertThat(queue.popMiddle(), is(765630)); //
        queue.pushMiddle(208060); //
        assertThat(queue.popMiddle(), is(208060)); //
        queue.pushMiddle(592866); // 
    }
    
    @Test
    public void example4() {
        FrontMiddleBackQueue queue = solution.new FrontMiddleBackQueue();
        queue.pushMiddle(371447); // [371447]
        assertThat(queue.popMiddle(), is(371447)); // []
        assertThat(queue.popMiddle(), is(-1)); // []
        queue.pushFront(154898); // 
        assertThat(queue.popMiddle(), is(154898)); // 
        queue.pushMiddle(498468); // [498468]
        queue.pushBack(725851); // [498468,725851]
        queue.pushFront(20315); // [20315,498468,725851]
        queue.pushMiddle(384279); // [20315,384279,498468,725851]
        queue.pushMiddle(816477); //
        assertThat(queue.popFront(), is(20315)); // 
        queue.pushMiddle(934190); //
        assertThat(queue.popMiddle(), is(934190)); //
        queue.pushFront(255188); //
        queue.pushBack(186484); //
        assertThat(queue.popFront(), is(255188)); //
    }
}
