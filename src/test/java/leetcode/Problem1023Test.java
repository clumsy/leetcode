package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1023Test {
    private final Problem1023 solution = new Problem1023();

    @Test
    public void example1() {
        String[] queries = new String[] {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        assertThat(solution.camelMatch(queries, "FB"), is(Arrays.asList(true,false,true,true,false)));
    }
}
