package leetcode;

import java.util.Arrays;
import java.util.Objects;
import org.junit.Test;

public class Problem118Test {
    private final Problem118 solution = new Problem118();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.generate(5),
            Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1)));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.generate(1),
            Arrays.asList(
                Arrays.asList(1)));
    }
}
