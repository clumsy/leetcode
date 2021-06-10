package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem71Test {
    private final Problem71 solution = new Problem71();
    
    @Test
    public void example1() {
        assertThat(solution.simplifyPath("/home/"), is("/home"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.simplifyPath("/../"), is("/"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.simplifyPath("/home//foo/"), is("/home/foo"));
    }
    
    @Test
    public void example4() {
        assertThat(solution.simplifyPath("/a/./b/../../c/"), is("/c"));
    }
    
    @Test
    public void example5() {
        assertThat(solution.simplifyPath("/a/../../b/../c//.//"), is("/c"));
    }
}
