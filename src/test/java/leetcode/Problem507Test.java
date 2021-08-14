package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem507Test {
    private final Problem507 solution = new Problem507();
    
    @Test
    public void example1() {
        assertThat(solution.checkPerfectNumber(28), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.checkPerfectNumber(6), is(true));
    }
    
    @Test
    public void example3() {
        assertThat(solution.checkPerfectNumber(496), is(true));
    }
    
    @Test
    public void example4() {
        assertThat(solution.checkPerfectNumber(8128), is(true));
    }
    
    @Test
    public void example5() {
        assertThat(solution.checkPerfectNumber(2), is(false));
    }
    
    @Test
    public void example6() {
        assertThat(solution.checkPerfectNumber(1), is(false));
    }
}
