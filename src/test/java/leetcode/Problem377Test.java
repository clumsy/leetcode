package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem377Test {
    private final Problem377 solution = new Problem377();
    
    @Test
    public void example1() {
        assertThat(solution.combinationSum4(new int[] {1,2,3}, 4), is(7));
    }
    
    @Test
    public void example2() {
        assertThat(solution.combinationSum4(new int[] {9}, 3), is(0));
    }
    
    @Test
    public void example3() {
        assertThat(solution.combinationSum4(new int[] {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25}, 10), is(9));
    }
}
