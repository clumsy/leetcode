package leetcode;

import org.junit.Test;

public class Problem557Test {
    private final Problem557 solution = new Problem557();

    @Test
    public void example1() {
        assert solution.reverseWords("Let's take LeetCode contest").equals("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    public void example2() {
        assert solution.reverseWords("God Ding").equals("doG gniD");
    }
}
