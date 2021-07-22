package leetcode;

import leetcode.Problem535.Codec;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem535Test {
    private final Problem535 solution = new Problem535();
    
    @Test
    public void example1() {
        Codec codec = solution.new Codec();
        String input = "https://leetcode.com/problems/design-tinyurl";
        assertThat(codec.decode(codec.encode(input)), is(input));
    }
}
