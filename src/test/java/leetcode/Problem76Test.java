package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem76Test {
    private final Problem76 solution = new Problem76();
    
    @Test
    public void example1() {
        assertThat(solution.minWindow("ADOBECODEBANC", "ABC"), is("BANC"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minWindow("a", "a"), is("a"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.minWindow("a", "aa"), is(""));
    }
    
    @Test
    public void example4() {
        assertThat(solution.minWindow("ab", "b"), is("b"));
    }
    
    @Test
    public void example5() {
        assertThat(solution.minWindow("aa", "aa"), is("aa"));
    }
    
    @Test
    public void example6() {
        assertThat(solution.minWindow("aab", "aab"), is("aab"));
    }
    
    @Test
    public void example7() {
        assertThat(solution.minWindow("bba", "ab"), is("ba"));
    }
}
