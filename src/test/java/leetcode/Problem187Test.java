package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem187Test {
    private final Problem187 solution = new Problem187();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"),
            Arrays.asList("AAAAACCCCC","CCCCCAAAAA"));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"),
            Arrays.asList("AAAAAAAAAA"));
    }
    
    @Test
    public void example3() {
        assert Objects.equals(solution.findRepeatedDnaSequences("AAAAAAAAA"),
            Arrays.asList());
    }
}
