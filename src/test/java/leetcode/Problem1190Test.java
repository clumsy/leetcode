package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1190Test {
    private final Problem1190 solution = new Problem1190();
    
    @Test
    public void example1() {
        assertThat(solution.reverseParentheses("(abcd)"), is("dcba"));
    }
    
    @Test
    public void example2() {
        assertThat(solution.reverseParentheses("(u(love)i)"), is("iloveu"));
    }
    
    @Test
    public void example3() {
        assertThat(solution.reverseParentheses("(ed(et(oc))el)"), is("leetcode"));
    }
    
    @Test
    public void example4() {
        assertThat(solution.reverseParentheses("a(bcdefghijkl(mno)p)q"), is("apmnolkjihgfedcbq"));
    }
    
    @Test
    public void example5() {
        assertThat(solution.reverseParentheses("yfgnxf"), is("yfgnxf"));
    }
    
    @Test
    public void example6() {
        assertThat(solution.reverseParentheses("ta()usw((((a))))"), is("tauswa"));
    }
    
    @Test
    public void example7() {
        assertThat(solution.reverseParentheses("sxmdll(q)eki(x)"), is("sxmdllqekix"));
    }
    
    @Test
    public void example8() {
        assertThat(solution.reverseParentheses("s()uteawj((eg))"), is("suteawjeg"));
    }
}
