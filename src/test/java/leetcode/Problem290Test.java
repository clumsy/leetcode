package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem290Test {
    private final Problem290 solution = new Problem290();
    
    @Test
    public void example1() {
        assertThat(solution.wordPattern("abba", "dog cat cat dog"), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.wordPattern("abba", "dog cat cat fish"), is(false));
    }
    
    @Test
    public void example3() {
        assertThat(solution.wordPattern("aaaa", "dog cat cat dog"), is(false));
    }
    
    @Test
    public void example4() {
        assertThat(solution.wordPattern("abba", "dog dog dog dog"), is(false));
    }
}
