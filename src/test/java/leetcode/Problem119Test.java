package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem119Test {
    private final Problem119 solution = new Problem119();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.getRow(3),
            Arrays.asList(1,3,3,1));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.getRow(0),
            Arrays.asList(1));
    }
}
