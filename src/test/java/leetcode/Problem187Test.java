package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem187Test {
    private final Problem187 solution = new Problem187();
    
    @Test
    public void example1() {
        assertThat(solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"),
            is(Arrays.asList("AAAAACCCCC","CCCCCAAAAA")));
    }
    
    @Test
    public void example2() {
        assertThat(solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"),
            is(Arrays.asList("AAAAAAAAAA")));
    }
}
