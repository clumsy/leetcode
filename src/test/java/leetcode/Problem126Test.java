package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem126Test {
    private final Problem126 solution = new Problem126();
    
    @Test
    public void example1() {
        assertThat(solution.findLadders("hit", "cog",
            Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")),
            is(Arrays.asList(
                Arrays.asList("hit","hot","dot","dog","cog"),
                Arrays.asList("hit","hot","lot","log","cog"))));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findLadders("hit", "cog",
            Arrays.asList("hot", "dot", "dog", "lot", "log")),
            is(Collections.emptyList()));
    }
}
