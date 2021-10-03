package leetcode;

import leetcode.Problem284.PeekingIterator;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem284Test {
    private final Problem284 solution = new Problem284();
    
    @Test
    public void example1() {
        PeekingIterator iterator = solution.new PeekingIterator(Arrays.asList(1, 2, 3).iterator());
        assertThat(iterator.next(), is(1));
        assertThat(iterator.peek(), is(2));
        assertThat(iterator.next(), is(2));
        assertThat(iterator.next(), is(3));
        assertThat(iterator.hasNext(), is(false));
    }
}
