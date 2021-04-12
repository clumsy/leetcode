package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem844Test {
    private final Problem844 solution = new Problem844();
    
    @Test
    public void example1() {
        assertThat(solution.backspaceCompare("ab#c", "ad#c"), is(true));
    }
    
    @Test
    public void example2() {
        assertThat(solution.backspaceCompare("ab##", "c#d#"), is(true));
    }
    
    @Test
    public void example3() {
        assertThat(solution.backspaceCompare("a##c", "#a#c"), is(true));
    }
    
    @Test
    public void example4() {
        assertThat(solution.backspaceCompare("a#c", "b"), is(false));
    }
    
    @Test
    public void example5() {
        assertThat(solution.backspaceCompare("bxj##tw", "bxo#j##tw"), is(true));
    }
    
    @Test
    public void example6() {
        assertThat(solution.backspaceCompare("bbbextm", "bbb#extm"), is(false));
    }
}
