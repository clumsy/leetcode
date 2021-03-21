package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1347Test {
    private final Problem1347 solution = new Problem1347();
    
    @Test
    public void example1() {
        assertThat(solution.minSteps("bab", "aba"), is(1));
    }
    
    @Test
    public void example2() {
        assertThat(solution.minSteps("leetcode", "practice"), is(5));
    }
    
    @Test
    public void example3() {
        assertThat(solution.minSteps("anagram", "mangaar"), is(0));
    }
    
    @Test
    public void example4() {
        assertThat(solution.minSteps("xxyyzz", "xxyyzz"), is(0));
    }
    
    @Test
    public void example5() {
        assertThat(solution.minSteps("friend", "family"), is(4));
    }
}
