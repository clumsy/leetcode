package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem295Test {
    private final Problem295 solution = new Problem295();
    
    @Test
    public void example1() {
        Problem295.MedianFinder medianFinder = solution.new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertThat(medianFinder.findMedian(), is(1.5));
        medianFinder.addNum(3);
        assertThat(medianFinder.findMedian(), is(2.0));
    }
}
