package leetcode;

import org.junit.Test;

import java.util.function.IntConsumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1116Test {
    private final Problem1116 solution = new Problem1116();
    
    @Test
    public void example1() throws InterruptedException {
        Problem1116.ZeroEvenOdd fixture = solution.new ZeroEvenOdd(2);
        StringBuilder result = new StringBuilder();
        IntConsumer consumer = result::append;
        fixture.zero(consumer);
        fixture.even(consumer);
        fixture.odd(consumer);
        assertThat(result.toString(), is("0102"));
    }
    
    @Test
    public void example2() throws InterruptedException {
        Problem1116.ZeroEvenOdd fixture = solution.new ZeroEvenOdd(5);
        StringBuilder result = new StringBuilder();
        IntConsumer consumer = result::append;
        fixture.zero(consumer);
        fixture.even(consumer);
        fixture.odd(consumer);
        assertThat(result.toString(), is("0102030405"));
    }
}
