package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem65Test {
    private final Problem65 solution = new Problem65();
    
    @Test
    public void example1() {
        assertThat(solution.isNumber("0"), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.isNumber("e"), is(false));
    }
    
    @Test
    public void example3() {
        assertThat(solution.isNumber("."), is(false));
    }
    
    @Test
    public void example4() {
        assertThat(solution.isNumber(".1"), is(true));
    }
    
    @Test
    public void example5() {
        assertThat(solution.isNumber("6+1"), is(false));
    }
    
    @Test
    public void example6() {
        assertThat(solution.isNumber("4e+"), is(false));
    }
}
