package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1455Test {
    private final Problem1455 solution = new Problem1455();
    
    @Test
    public void example1() {
        assertThat(solution.isPrefixOfWord("i love eating burger", "burg"), is(4));
    }
    
    @Test
    public void example2() {
        assertThat(solution.isPrefixOfWord("this problem is an easy", "pro"), is(2));
    }
    
    @Test
    public void example3() {
        assertThat(solution.isPrefixOfWord("i am tired", "you"), is(-1));
    }
    
    @Test
    public void example4() {
        assertThat(solution.isPrefixOfWord("i use triple pillow", "pill"), is(4));
    }
    
    @Test
    public void example5() {
        assertThat(solution.isPrefixOfWord("hello from the other side", "they"), is(-1));
    }
}
