package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem216Test {
    private final Problem216 solution = new Problem216();
    
    @Test
    public void example1() {
        assertThat(solution.combinationSum3(3, 7),
            is(Arrays.asList(
                Arrays.asList(1,2,4))));
    }
    
    @Test
    public void example2() {
        assertThat(solution.combinationSum3(3, 9),
            is(Arrays.asList(
                Arrays.asList(1,2,6),
                Arrays.asList(1,3,5),
                Arrays.asList(2,3,4))));
    }
    
    @Test
    public void example3() {
        assertThat(solution.combinationSum3(4, 1), is(Arrays.asList()));
    }
    
    @Test
    public void example4() {
        assertThat(solution.combinationSum3(3, 2), is(Arrays.asList()));
    }
    
    @Test
    public void example5() {
        assertThat(solution.combinationSum3(9, 45),
            is(Arrays.asList(Arrays.asList(1,2,3,4,5,6,7,8,9))));
    }
    
    @Test
    public void example6() {
        assertThat(solution.combinationSum3(2, 18), is(Arrays.asList()));
    }
}
