package leetcode;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1209Test {
    private final Problem1209 solution = new Problem1209();
    
    @Test
    public void example1() {
        assertThat(solution.removeDuplicates("abcd", 2), is("abcd"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.removeDuplicates("deeedbbcccbdaa", 3), is("aa"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.removeDuplicates("pbbcggttciiippooaais", 2), is("ps"));
    }
}
