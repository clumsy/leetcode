package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1170Test {
    private final Problem1170 solution = new Problem1170();
    
    @Test
    public void example1() {
        String[] queries = {"cbd"};
        String[] words = {"zaaaz"};
        assertThat(solution.numSmallerByFrequency(queries, words), is(new int[] {1}));
    }
    
    @Test
    public void example2() {
        String[] queries = {"bbb","cc"};
        String[] words = {"a","aa","aaa","aaaa"};
        assertThat(solution.numSmallerByFrequency(queries, words), is(new int[] {1, 2}));
    }
}
