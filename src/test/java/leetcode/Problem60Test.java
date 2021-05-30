package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem60Test {
    private final Problem60 solution = new Problem60();
    
    @Test
    public void example1() {
        assertThat(solution.getPermutation(3, 3), is("213"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.getPermutation(4, 9), is("2314"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.getPermutation(3, 1), is("123"));
    }
}
