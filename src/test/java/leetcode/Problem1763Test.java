package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1763Test {
    private final Problem1763 solution = new Problem1763();
    
    @Test
    public void example1() {
        assertThat(solution.longestNiceSubstring("YazaAay"), is("aAa"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.longestNiceSubstring("Bb"), is("Bb"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.longestNiceSubstring("cBd"), is(""));
    }
    
    @Test
    public void example4() {
        assertThat(solution.longestNiceSubstring("dDzeE"), is("dD"));
    }
}
