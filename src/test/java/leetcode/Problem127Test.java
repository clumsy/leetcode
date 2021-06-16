package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem127Test {
    private final Problem127 solution = new Problem127();
    
    @Test
    public void example1() {
        assertThat(solution.ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")), is(5));
    }
    
    @Test
    public void example2() {
        assertThat(solution.ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log")), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.ladderLength("a", "c", Arrays.asList("a","b","c")), is(2));
    }
    
    @Test
    public void example4() {
        assertThat(solution.ladderLength("hot", "dog", Arrays.asList("hot","dog")), is(0));
    }
}
