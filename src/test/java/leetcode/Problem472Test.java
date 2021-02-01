package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem472Test {
    private final Problem472 solution = new Problem472();

    @Test
    public void example1() {
        String[] words = new String[] {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        assertThat(solution.findAllConcatenatedWordsInADict(words), is(Arrays.asList("catsdogcats","dogcatsdog","ratcatdogcat")));
    }
}
